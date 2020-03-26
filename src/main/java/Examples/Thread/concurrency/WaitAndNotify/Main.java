package Examples.Thread.concurrency.WaitAndNotify;


public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        for (int i = 1; i <= 2; i++) {
            Thread producer = new Thread(new Producer(sharedResource));
            producer.setName("Producer" + i);
            producer.start();
        }

        for (int i = 1; i <= 5; i++) {
            Thread consumer = new Thread(new Consumer(sharedResource));
            consumer.setName("Consumer" + i);
            consumer.start();
        }


    }
}
