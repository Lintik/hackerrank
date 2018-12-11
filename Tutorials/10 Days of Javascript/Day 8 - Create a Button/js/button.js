var incrementButton = document.createElement('button');
incrementButton.id = 'btn';
incrementButton.innerHTML = 0;
document.body.appendChild(incrementButton);
var i = 0;
var btn = document.getElementById('btn');
btn.onclick = function() {
    i++;
    btn.innerHTML = i;
};