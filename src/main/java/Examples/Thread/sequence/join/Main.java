package Examples.Thread.sequence.join;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread timer = new Thread(new TimerThread());
        timer.start();

        Thread thread1 = new Thread(new CustomThread(1, 4000 )); // 4초
        Thread thread2 = new Thread(new CustomThread(2, 4000 )); // 4초
        Thread thread3 = new Thread(new CustomThread(3, 2000 )); // 2초
        Thread thread4 = new Thread(new CustomThread(4, 3000 )); // 3초
        Thread thread5 = new Thread(new CustomThread(5, 10000)); // 10초
        Thread thread6 = new Thread(new CustomThread(6, 1000 )); // 1초

        thread5.start();
        thread3.start();
        thread1.start();
        thread3.join();
        thread2.start();
        thread1.join();
        thread4.start();
        thread2.join();
        thread4.join();
        thread5.join();
        thread6.start();
        thread6.join();

        timer.interrupt();
    }
}
