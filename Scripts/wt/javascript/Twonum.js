function Twonumlogic() {
    let num1 = Number(prompt("Enter the number to split"));
    let sum = num1.toString().split("");
    let a = sum[0];
    let b = sum[1];


    for (let i = 1; i < b; i++) {
        a = a * sum[0];


    }
    alert(a);

}