function findmax()
{
    var a=[];
    var n;
    n=Number(prompt("Enter Size of Array" ));

    for(let i=0;i<n;i++)
    {
        a[i]=Number(prompt("Enter Element" +i+":"));
    }
    console.log(a);
    var max=a[0];

    for(i=0;i<n;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
       
    }
    document.write("The Maximum number is "+max);



}
