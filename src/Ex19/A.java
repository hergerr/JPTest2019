package Ex19;

public class A {
    class W extends Thread {
        public void run() {
            try {
                w2.join();
            } catch (InterruptedException e) {
            }
        }
    }

    void start() {
        w1.start();
    }

    private W w1 = new W(), w2 = new W();

    public static void main(String[] args) {
        new A().start();
    }
}