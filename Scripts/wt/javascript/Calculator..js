
        function calculator()
        {
            var firstnumber = parseFloat(prompt("Enter yhe first number:"));
            var oprator = prompt("Enter the oprator(+,-,*,/):");
            var secondnumber = parseFloat(prompt("Enter yhe second number:"));
            var result;

            switch (oprator) {
                case '+':
                    result = firstnumber+secondnumber;
                    break;
                case '-':
                    result = firstnumber - secondnumber;
                    break;
                case '*':
                    result = firstnumber * secondnumber;
                    break;
                case '/':
                   if(secondnumber === 0)
                   {
                    result = "Cannot divide by zero!";
                   }
                   else
                   {
                    result = firstnumber/secondnumber ;
                   }
                default:
                    result ="Invalid number";
            }
            alert("result="+result);
        }
