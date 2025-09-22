public class MultiThreading {
    public static void main(String[] args) {
//        Extends Thread Class:
//        World world = new World();
//        world.start();

//        Implements Runnable Interface:
        Gagan gagan = new Gagan();
        Thread thread = new Thread(gagan);
        thread.start();

        for (int i=0;i<10000;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class World extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10000;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class Gagan implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10000;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
