class product {
    int item;

    synchronized public void put(int item) {
        this.item = item;
        System.out.println("producer" + item);
    }

    synchronized public int get() {
        System.out.println("consumer" + item);
        return item;
    }

}

class producer extends Thread {
    product p;

    producer(product p) {
        this.p = p;
        start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            p.put(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception" + e.toString());
            }
        }
    }
}

class consumer extends Thread {

    product p;
    int g;

    consumer(product p) {
        this.p = p;
        start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            g = p.get();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception" + e.toString());
            }
        }
    }

}

class Producer_Consumer {
    public static void main(String args[]) {
        product p = new product();
        producer p1 = new producer(p);
        consumer c1 = new consumer(p);
    }
}