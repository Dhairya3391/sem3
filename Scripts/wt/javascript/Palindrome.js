function pelindrome() {
    var n = Number.parseInt(prompt("Enter number: "));
    var temp = n, newNum = 0, rem;
    while (n > 0) {
        rem = n % 10;
        n = Number.parseInt(n / 10);
        newNum = (newNum * 10) + rem;
    }

    if (newNum == temp) {
        document.write("Number is Palindrome");
    }
    else {
        document.write("Number is not Palindrome");
    }
}



