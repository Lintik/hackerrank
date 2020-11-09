'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

function gcd(a, b){
    if (b == 0) 
        return a; 
    return gcd(b, a % b); 
}

function gcdArray(a){
    let ans = a[0];
    for (let i = 1; i < a.length; i++) {
        ans = gcd(ans, a[i]);
    }
    return ans;
}

function lcm(a, b){
    return a * (b / gcd(a, b));
}

function lcmArray(a){
    let ans = a[0]; 

    for (let i = 1; i < a.length; i++) 
        ans = (((a[i] * ans)) / 
                (gcd(a[i], ans))); 

    return ans; 
}

function getTotalX(arr, brr) {
    let l = lcmArray(arr);
    let g = gcdArray(brr);
    
    let count = 0;
    for(let i = l, j =2; i<=g; i=l*j,j++){
        if(g%i==0)
            count++;
    }
    return count;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const firstMultipleInput = readLine().replace(/\s+$/g, '').split(' ');

    const n = parseInt(firstMultipleInput[0], 10);

    const m = parseInt(firstMultipleInput[1], 10);

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    const brr = readLine().replace(/\s+$/g, '').split(' ').map(brrTemp => parseInt(brrTemp, 10));

    const total = getTotalX(arr, brr);

    ws.write(total + '\n');

    ws.end();
}
