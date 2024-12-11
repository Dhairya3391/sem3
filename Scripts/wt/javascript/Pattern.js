function pattern_diamond()
{
    var n = Number(prompt("Enter Number: "));
    for(let i=0;i<n;i++)
    {
       
        for(let j=n-i-1;j>0;j--)
        {
            document.write("&nbsp");
        }
        for(let k=0;k<=i;k++)
        {
            document.write("*&nbsp");
        }
        
        document.write("<br> ");
     
    }
    for(let i=n-1;i>0;i--)
    {
        for(let m=n-i;m>0;m--)
        {
            document.write("&nbsp");
        }
     
          for(let j=i;j>0;j-- )
          {
            document.write("*&nbsp");
          }
          document.write("<br>");
    }
}