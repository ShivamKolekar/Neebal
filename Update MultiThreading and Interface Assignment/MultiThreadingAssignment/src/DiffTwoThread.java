/* In this code when an instance of ThreadExample is created, 
 it  starts the thread by calling start() in the constructor.*/

public class DiffTwoThread extends Thread {
    private String threadName;

    public DiffTwoThread(String name) {
        this.threadName = name;
        
        start(); // Start the thread upon construction
        System.out.println("Constructor executed");
    }

    @Override
    public void run() {
        System.out.println("Running thread: " + threadName);
    }

    public static void main(String[] args) 
    {
    	DiffTwoThread t1 = new DiffTwoThread("Thread 1");
    	DiffTwoThread t2 = new DiffTwoThread("Thread 2");
    }
}