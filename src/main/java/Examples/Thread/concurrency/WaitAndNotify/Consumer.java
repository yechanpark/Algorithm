package Examples.Thread.concurrency.WaitAndNotify;

public class Consumer implements Runnable {
    private final int CONSUMER_THREAD_SLEEP_TIME = 100;
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            Resource resource = sharedResource.getResource();
            System.out.println(Thread.currentThread().getName() + " consumed Resource : [" + resource.getId() + ", " + resource.getValue() + "]");
            try {
                Thread.sleep(CONSUMER_THREAD_SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
