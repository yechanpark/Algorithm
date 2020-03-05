package Examples.Thread.join;

public class TimerThread implements Runnable {

    @Override
    public void run() {
        int waiting = 0;

        while (true) {
            System.out.println(waiting++ + "초");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }

    }
}
