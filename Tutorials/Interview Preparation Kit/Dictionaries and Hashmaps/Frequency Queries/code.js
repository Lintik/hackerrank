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

// Complete the freqQuery function below.
function freqQuery(queries) {
    let r = []
    let c = {};
    let f = {};
    for (let i = 0; i < queries.length; i++) {
        let a = queries[i][0];
        let b = queries[i][1];
        // insert query
        if (a == 1) {
            if (b in c) {//2-nth insertion
                const m = c[b]++;
                const m1 = m + 1;

                if (m1 in f) f[m1]++;
                else f[m1] = 1;

                if (m in f) {
                    f[m]--;
                    if (f[m] < 1) delete f[m];
                }

            }
            else {//first insertion
                c[b] = 1;
                if (1 in f) f[1]++;
                else f[1] = 1;
            }
        }
        // delete query
        else if (a == 2) {
            if (b in c) {
                const m = c[b]--;
                const m1 = m - 1;

                if (m1 <= 0) delete c[b];
                if (m in f) {
                    f[m]--;
                    if (f[m] <= 0) delete f[m];
                }
                if (m1 in f) f[m1]++;
                else f[m1] = 1;

            }
        }
        else {
            // true if the count of asked frequency is non-zero
            if (f[b] > 0)
                r.push(1);
            else
                r.push(0);
        }
    }
    return r;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const q = parseInt(readLine().trim(), 10);

    let queries = Array(q);

    for (let i = 0; i < q; i++) {
        queries[i] = readLine().replace(/\s+$/g, '').split(' ').map(queriesTemp => parseInt(queriesTemp, 10));
    }
    const ans = freqQuery(queries);

    ws.write(ans.join('\n') + '\n');

    ws.end();
}
