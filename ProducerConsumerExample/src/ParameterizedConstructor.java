import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class ParameterizedConstructor {
int number;

ParameterizedConstructor(int num) {
number = num;
}

public static void main(String[] args) {
ParameterizedConstructor obj = new ParameterizedConstructor(5);
System.out.println(obj.number);
}
}



//public class ProducerConsumerExample {
//
//    public static void main(String[] args) {
//    
//        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
//
//       
//        Thread producerThread = new Thread(new Producer(queue));
//        producerThread.start();
//
//        Thread consumerThread = new Thread(new Consumer(queue));
//        consumerThread.start();
//    }
//}
//
//class Producer implements Runnable {
//    private BlockingQueue<String> queue;
//
//    public Producer(BlockingQueue<String> queue) {
//        this.queue = queue;
//    }
//
//    @Override
//    public void run() {
//        try {
//           
//            for (int i = 1; i <= 5; i++) {
//                String message = "Message " + i;
//                queue.put(message);
//                System.out.println("Produced: " + message);
//                Thread.sleep(1000); 
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//    }
//}
//
//class Consumer implements Runnable {
//    private BlockingQueue<String> queue;
//
//    public Consumer(BlockingQueue<String> queue) {
//        this.queue = queue;
//    }
//
//    @Override
//    public void run() {
//        try {
//            //Consume messages from the queue
//            while (true) {
//                String message = queue.take();
//                System.out.println("Consumed: " + message);
//                Thread.sleep(1500); 
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//    }
//}
//
//
//
//
//





















//
//
//
//import java.util.concurrent.ArrayBlockingQueue; // Import the ArrayBlockingQueue class from the java.util.concurrent package.
//import java.util.concurrent.BlockingQueue; // Import the BlockingQueue interface from the java.util.concurrent package.
//
//public class ProducerConsumerExample { // Define the main class for the producer-consumer example.
//
//    public static void main(String[] args) { // Main method - entry point of the application.
//
//        // Create a BlockingQueue with a capacity of 10 to hold the messages.
//        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
//
//        // Create and start a producer thread.
//        Thread producerThread = new Thread(new Producer(queue));
//        producerThread.start(); // Start the producer thread to begin producing messages.
//
//        // Create and start a consumer thread.
//        Thread consumerThread = new Thread(new Consumer(queue));
//        consumerThread.start(); // Start the consumer thread to begin consuming messages.
//    }
//}
//
//class Producer implements Runnable { // Define the Producer class that implements Runnable for thread execution.
//    private BlockingQueue<String> queue; // Declare a BlockingQueue to hold the messages.
//
//    public Producer(BlockingQueue<String> queue) { // Constructor to initialize the queue.
//        this.queue = queue;
//    }
//
//    @Override
//    public void run() { // Override the run method to define the thread's task.
//        try {
//            // Produce 5 messages and add them to the queue.
//            for (int i = 1; i <= 5; i++) {
//                String message = "Message " + i; // Create a message.
//                queue.put(message); // Add the message to the queue (blocking if necessary).
//                System.out.println("Produced: " + message); // Print the produced message.
//                Thread.sleep(1000); // Sleep for 1 second before producing the next message.
//            }
//        } catch (InterruptedException e) { // Handle interruption during sleep or queue operations.
//            Thread.currentThread().interrupt(); // Restore interrupted status.
//        }
//    }
//}
//
//class Consumer implements Runnable { // Define the Consumer class that implements Runnable for thread execution.
//    private BlockingQueue<String> queue; // Declare a BlockingQueue to hold the messages.
//
//    public Consumer(BlockingQueue<String> queue) { // Constructor to initialize the queue.
//        this.queue = queue;
//    }
//
//    @Override
//    public void run() { // Override the run method to define the thread's task.
//        try {
//            // Continuously consume messages from the queue.
//            while (true) {
//                String message = queue.take(); // Take a message from the queue (blocking if necessary).
//                System.out.println("Consumed: " + message); // Print the consumed message.
//                Thread.sleep(1500); // Sleep for 1.5 seconds before consuming the next message.
//            }
//        } catch (InterruptedException e) { // Handle interruption during sleep or queue operations.
//            Thread.currentThread().interrupt(); // Restore interrupted status.
//        }
//    }
//}
//
