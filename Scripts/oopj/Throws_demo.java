class Throws_demo extends Exception {

    public Throws_demo(String s) {
        super(s);
    }

    static int currentbal = 5000;

    public static void main(String[] args) {
        try {
            int amount = Integer.parseInt(args[0]);
            withdraw(amount);
        } catch (Exception e) {
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(int amount) throws Exception {
        int newBalance = currentbal - amount;
        if (newBalance < 1000) {
            throw new Throws_demo("Darshan university");
        }
    }

}
