// o Writeaprogramtocreate andrun multiple threads using the Thread class.

package Core_JavaMain;

class C13_1MultipleThread extends Thread {
    private String threadName;

    // Constructor to initialize thread name
    C13_1MultipleThread(String name) {
        threadName = name;
    }

    // Override the run() method to define the task for the thread
    @Override
    public void run() {
        System.out.println(threadName + " is starting.");
        try {
            Thread.sleep(1000);  // Simulate work with a 1-second delay
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " has finished.");
    }
}

public class C13_1MultipleThreadExample {
    public static void main(String[] args) {
        // Create and start threads with different task names
        new C13_1MultipleThread("Printer").start();
        new C13_1MultipleThread("SumCalculator").start();
        new C13_1MultipleThread("Downloader").start();
    }
}

