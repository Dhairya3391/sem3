
class Thread_demo implements Runnable {
    Thread th1;
    Thread th2;

    Thread_demo() {
        th1 = new Thread();
        th1.start();
        th2 = new Thread();
        th2.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Good Morning");
                Thread.sleep(1000);
                System.out.println("Good Afternoon");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread Exception");
        }
    }

    public static void main(String args[]) {
        Thread_demo t1 = new Thread_demo();
        t1.run();

    }
}