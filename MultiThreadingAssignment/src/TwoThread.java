/*
 TwoThreadsExample is a class that extends the Thread class, allowing us to create threads.
The constructor takes a name for the thread, which is passed to the superclass constructor.
The run method is overridden to specify the behavior of the thread. 
In this case, it simply prints a message indicating the thread is running.
In the main method, we create two instances of TwoThreadsExample with different names ("Thread 1" and "Thread 2").
We start both threads using the start method. 

This initiates the execution of the run method in a separate thread.
Finally, the main thread (the one running the main method) prints a message.
 */
public class TwoThread extends Thread 
	{
    	public TwoThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running.");
    }

    public static void main(String[] args) {
        TwoThread thread1 = new TwoThread("Thread 1");
        TwoThread thread2 = new TwoThread("Thread 2");

        thread1.start();
        thread2.start();

        System.out.println("Main thread is running.");
    }
}