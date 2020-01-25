window.onload = () => {
     const button5 = document.getElementById('btn5');
     button5.addEventListener('click', () => {
          // get all the values from the buttons
          let arr = [
               document.getElementById('btn1').innerText,
               document.getElementById('btn2').innerText,
               document.getElementById('btn3').innerText,
               document.getElementById('btn6').innerText,
               document.getElementById('btn9').innerText,
               document.getElementById('btn8').innerText,
               document.getElementById('btn7').innerText,
               document.getElementById('btn4').innerText       
          ];
 
          // create new shifted array 
          arr = [
               ...arr.slice(arr.length - 1),
               ...arr.slice(0, arr.length - 1)
          ];
          
          // assign new values to buttons
          document.getElementById('btn1').innerText = arr[0];
          document.getElementById('btn2').innerText = arr[1];
          document.getElementById('btn3').innerText = arr[2];
          document.getElementById('btn6').innerText = arr[3];
          document.getElementById('btn9').innerText = arr[4];
          document.getElementById('btn8').innerText = arr[5];
          document.getElementById('btn7').innerText = arr[6];
          document.getElementById('btn4').innerText = arr[7];       
     });  
}
