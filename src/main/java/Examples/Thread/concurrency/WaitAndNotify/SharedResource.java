package Examples.Thread.concurrency.WaitAndNotify;

import Examples.Console.ConsoleColor;

import java.util.ArrayList;
import java.util.List;

/**
 * Producer, Consumer 간에 공유할 객체
 */
public class SharedResource {
    private final int RESOURCE_CAPACITY = 10;
    private final List<Resource> resourceList = new ArrayList<>(RESOURCE_CAPACITY);

    // called by Producer
    public void addResource(Resource resource) {
        System.out.println(Thread.currentThread().getName() + " called addResource()");
        synchronized (resourceList) {

            // 리소스가 full인 경우
            while (resourceList.size() >= RESOURCE_CAPACITY) {
                try {
                    System.out.println(
                            ConsoleColor.ANSI_RED.toString(Thread.currentThread().getName() + " waiting... (ResourceList is full : " + resourceList.size() + ")")
                    );
                    // 꽉 찼으므로 소비될 때 까지 Lock을 놓고 Wait
                    this.resourceList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 소비가 되어 꽉 차지 않은 경우 리소스 추가
            this.resourceList.add(resource);
            System.out.println(
                    ConsoleColor.ANSI_GREEN.toString(Thread.currentThread().getName() + " added Resource [" + resource.toString() + ", " + resource.toString() + "]")
            );

            // 리소스를 추가했으니 Lock을 놓고 다른 스레드에게 알림
            this.resourceList.notify();
        }
    }

    // called by Consumer
    public Resource getResource() {
        System.out.println(Thread.currentThread().getName() + " called getResource()");
        synchronized (resourceList) {

            // 비어 있으면 대기
            while (resourceList.isEmpty()) {
                try {
                    System.out.println(
                            ConsoleColor.ANSI_RED.toString(Thread.currentThread().getName() + " waiting... (ResourceList is empty)")
                    );
                    this.resourceList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 비어 있지 않으면 소비
            Resource resource = resourceList.remove(0);
            resourceList.notify();
            return resource;
        }
    }


}
