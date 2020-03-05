package Examples.Thread.sequence.join;

public class CustomThread implements Runnable {
    private int number;
    private int millis;

    public CustomThread(int number, int millis) {
        this.number = number;
        this.millis = millis;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(number);
    }
}
