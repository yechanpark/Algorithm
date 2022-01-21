package Examples.Thread.concurrency.WaitAndNotify;

public class Producer implements Runnable {
    private final int PRODUCER_THREAD_SLEEP_TIME = 10;
    private int resourceSequence;
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            //Resource resource = new Resource(++resourceSequence, "Val" + resourceSequence);
            //sharedResource.addResource(resource);
            try {
                Thread.sleep(PRODUCER_THREAD_SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
