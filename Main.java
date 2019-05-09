

class RunnableDemo implements Runnable {
    private Thread t;

    RunnableDemo() {
    }

    public void run() {
        try {
            ChocolateBoiler tasa = ChocolateBoiler.getInstance();
        } catch (Exception e) {
            System.out.println("Thread no puede usar la clase.");
        }
    }
}


public class Main {

    public static void main(String[] args) {
        //OriginalChocolateBoiler tasa = new OriginalChocolateBoiler();
        ChocolateBoiler tasasingleton = ChocolateBoiler.getInstance();

        RunnableDemo R1 = new RunnableDemo();
        RunnableDemo R2 = new RunnableDemo();

        Thread t = new Thread(R1);
        Thread t2 = new Thread(R2);

        t.start();
        t2.start();

        //System.out.println("Hello World!");
    }
}
