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

function dayOfProgrammer(year) {
    let mon7 = 215;
    let feb; //days in february
    if(year < 1918) //julian
        feb = year%4>0 ? 28 : 29;
    else if(year > 1918) //gregorian
        feb = !(year%400 >0) || year%100>0 && !(year%4>0) ? 29 : 28;
    else // 1918
        feb = 15;
    feb = 256 - (feb + mon7);
    return feb.toString() + ".09." + year.toString();

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const year = parseInt(readLine().trim(), 10);

    const result = dayOfProgrammer(year);

    ws.write(result + '\n');

    ws.end();
}
