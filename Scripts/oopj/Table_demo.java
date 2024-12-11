class Tableclass implements Runnable {

    int num;
    Thread t1;
    Thread t2;

    Tableclass(int num) {
        this.num = num;
        t1 = new Thread();
        t2 = new Thread();
        t1.start();
        t2.start();
    }

    synchronized public void print_data() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }

    }

    public void run() {

        print_data();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}

class Table_demo {
    public static void main(String args[]) {
        Runnable r1 = new Tableclass(5);
        Runnable r2 = new Tableclass(10);
        r1.run();
        r2.run();

    }
}
