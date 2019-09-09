'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

function median(count, d){
    let d2 = Math.floor((d+1)/2);
    for (let i = 0; i < 201; i++){
        if (count[i] > d2) return 2*i;
        if (count[i] == d2){
            if (d%2 != 0) return 2*i;
            for (let j = i + 1; j < 201; j++)
                if (count[j] > 0) return i+j;
        }
        d2 -= count[i];
    }
    return 0;
}

function activityNotifications(a,n,d) {
    let result = 0;
    let count = Array.from(Array(201), () => 0)

    for (let i = 0; i < n; i++){
        let v = a[i];
        if (i >= d){
            let m = median(count, d);
            if (v >= m)
                result++;
            count[a[i - d]]--;
        }
        count[v]++;
    }
    return result;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const nd = readLine().split(' ');

    const n = parseInt(nd[0], 10);

    const d = parseInt(nd[1], 10);

    const expenditure = readLine().split(' ').map(expenditureTemp => parseInt(expenditureTemp, 10));

    let result = activityNotifications(expenditure,n, d);

    ws.write(result + "\n");

    ws.end();
}
