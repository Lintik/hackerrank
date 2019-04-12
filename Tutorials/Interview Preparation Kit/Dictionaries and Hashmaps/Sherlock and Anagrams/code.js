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

// Complete the sherlockAndAnagrams function below.
function sherlockAndAnagrams(s) {
    let count = 0;
    let subs = {};
    const l = s.length;
    for (let i = l - 1; i > 0; i--)
        for (let j = 0; j + i <= l; j++){
            let t = s.substring(j, j + i);
            t = t.split('').sort().join('');

            if (!(t in subs)) 
                subs[t] = 1;
            else 
                subs[t] += 1;
        }

    for (let key in subs) {
        let n = subs[key];
        //console.log(key,n);
        if (n > 1)
            count += Math.floor((n - 1) * n / 2);
    }

    return count;

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const q = parseInt(readLine(), 10);

    for (let qItr = 0; qItr < q; qItr++) {
        const s = readLine();

        let result = sherlockAndAnagrams(s);

        ws.write(result + "\n");
    }

    ws.end();
}
