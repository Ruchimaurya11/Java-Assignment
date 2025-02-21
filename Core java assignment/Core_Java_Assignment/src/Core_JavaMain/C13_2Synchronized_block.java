//o Implement thread synchronization using synchronized blocks or methods.

package Core_JavaMain;

class Printer {
    
    void printNumbers() {
        synchronized (this) {  
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MyThread extends Thread {
    Printer printer; 

    MyThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printNumbers(); 
        }
}


public class C13_2Synchronized_block {
    public static void main(String[] args) {
        Printer printer = new Printer(); 

        MyThread t1 = new MyThread(printer);
        MyThread t2 = new MyThread(printer);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
