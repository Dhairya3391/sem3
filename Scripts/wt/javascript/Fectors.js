function fector_demo() {
    let number = Number(prompt("Enter Number: "));
    document.write(1 + " ");
    for (let i = 2; i < number; i++) {
        if (number % i == 0) {
            document.write(i + " ");
        }
    }
    document.write(number);
}