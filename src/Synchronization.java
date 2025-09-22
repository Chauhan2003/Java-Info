/*
Synchronization in Java?

In Java, synchronization is a way to control the access of multiple threads to shared resources (like variables, objects, files).
👉 It prevents race conditions and ensures thread-safety.
 */

class CounterCheck {
    private int counter = 0;

    public synchronized void inc() {
        counter += 1;
    }

    public int get() {
        return counter;
    }
}

public class Synchronization {
    public static void main(String[] args) {
        CounterCheck cnt = new CounterCheck();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println();
                cnt.inc();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=0;i<10000;i++) {
                cnt.inc();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

            System.out.print("Final counter is " + cnt.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
