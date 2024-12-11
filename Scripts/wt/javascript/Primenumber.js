
function prime()
{
        var no =  Number(prompt("Enter no"));
        var flag=0;
        for(var i=2;i<no;i++)
        {
            if(no%i==0)
            {
                flag=1;
                break;
            }

        }
        if(flag==1)
        {
            alert("number is not prime");
        }
        else{
            alert("number is prime" +no);
        }
    }


