function armstrong() {
    const number = Number.parseInt(prompt("Enter number: "));
    let sum = 0, temp = number, rem;
    while (temp > 0) {
        rem = temp % 10;
        sum += rem * rem * rem;
        temp = Number.parseInt(temp / 10);
    }
    if (sum == number) {
        document.write("Number is Armstrong number");
    }
    else {
        document.write("Number is not Armstrong number");
    }
}
