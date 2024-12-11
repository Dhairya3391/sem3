
function prime_range() {
    n1 = Number(prompt("Enter the starting number : "));
    n2 = Number(prompt("Enter the ending number : "));
    for (i = n1 + 1; i < n2; i++) {
        flag = true;
        for (j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            document.write(i + "  ");
        }
    }
}