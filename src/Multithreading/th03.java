package Multithreading;

public class th03 {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Workers");
        Workerth03 w1 = new Workerth03(threadGroup, "w1");
        w1.start();
        Workerth03 w2 = new Workerth03(threadGroup, "w2");
        w2.start();
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static class Workerth03 extends Thread {
        Workerth03(ThreadGroup threadGroup, String name) {
            super(threadGroup, name);
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
