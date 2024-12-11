function genratefibo() {
    var n = prompt("enter the number of terms fibonaci seris");
    let a = 0, b = 1, c;

    document.write("Fibonaci Series");

    for (let i = 1; i <= n; i++) {
        document.write(a);
        c = a + b;
        a = b;
        b = c;
    }
}
