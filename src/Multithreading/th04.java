package Multithreading;

public class th04 {
    public static void main(String[] args) {
    Runnable w1= new Workerth04();

        Thread t1= new Thread(w1);
        t1.start();

        Runnable w2= new Workerth04();
        Thread t2= new Thread(w2);
        t2.start();
        for(int i=0; i<10; i++){
            System.out.println(i+ "--" + Thread.currentThread().getName());        }


    }
}

class Workerth04 implements Runnable {


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