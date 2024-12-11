function Gcd() {
    const a = Number.parseInt(prompt("Enter value of  number 1: "));
    const b = Number.parseInt(prompt("Enter value of number 2: "));
    let temp;
    
   
        for(let i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                temp=i;
            }
        }
        document.write(temp);

}