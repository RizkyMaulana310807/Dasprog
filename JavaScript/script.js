var button = document.getElementById('button');

button.addEventListener('click', function() {
    var num1 = document.getElementById('num1').value;
    var num2 = document.getElementById('num2').value;
    var operator = document.getElementById('operator').value;
    
    switch(operator){
        case '+':
            alert(parseInt(num1) + parseInt(num2));
            break;
        case '*':
            alert(parseInt(num1) * parseInt(num2));
            break;
        case '-':
            alert(parseInt(num1) - parseInt(num2));
            break;
        case '/':
            if(parseInt(num1) == 0 || parseInt(num2) == 0){
                alert('Angka tidak dapat di isi nol (0)');
            } else{
                alert(parseInt(num1) / parseInt(num2))
            }
            break;
        case '%':
            alert(parseInt(num1) % parseInt(num2));
            break;
        default:
            alert('Invalid operator');
            break;
    }
});