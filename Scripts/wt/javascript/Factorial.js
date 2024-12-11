function factorial()
{
    var no = Number(prompt("Enter no:"));
    var fact = 1;
    for(var i=1;i<=no;i++)
    {
        fact=fact*i;
        console.log(fact);
    } 
}