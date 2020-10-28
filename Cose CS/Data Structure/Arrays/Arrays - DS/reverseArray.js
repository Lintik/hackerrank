function processData(input) {
    var data = input.split('\n');
    var n = data[0];
    var numbers = data[1].split(' ');
    var result = "";
    for(var i = 0; i < n; i++)
    {
        result += numbers[n-1-i] + " ";
    }
    console.log(result);
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
