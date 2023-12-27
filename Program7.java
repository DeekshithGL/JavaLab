import java.util.LinkedList;

class SharedBuffer {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int cap) {
        this.capacity = cap;
    }

    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity)
                wait();

            buffer.add(item);
            System.out.println("Producing item: " + item);
            notifyAll();
        }
    }

    public int consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty())
                wait();

            int item = buffer.removeFirst();
            System.out.println("Consuming item: " + item);

            notifyAll();
            return item;
        }
    }
}

class Producer implements Runnable {
    private final SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                sharedBuffer.produce(i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable{
    private final SharedBuffer sharedBuffer;
    public Consumer(SharedBuffer sharedBuffer){
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run(){
        while(true){
            try{
                int item = sharedBuffer.consume();
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(5);

        Thread producerThread = new Thread(new Producer(sharedBuffer));
        producerThread.start();

        Thread consumerThread = new Thread(new Consumer(sharedBuffer));
        consumerThread.start();
    }
}
