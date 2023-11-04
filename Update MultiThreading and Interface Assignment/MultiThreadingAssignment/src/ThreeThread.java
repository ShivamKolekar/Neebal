public class ThreeThread implements Runnable {
   String[] course = {"Java", "J2EE", "Spring"};
   int index = 0;

    public void run() {
        while (index < course.length) {
            
                if (index < course.length) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " : " + course[index]);
                    index++;
                }
            
        }
    }

    public static void main(String[] args) {
    	ThreeThread program = new ThreeThread();
        
        Thread thread1 = new Thread(program);
        Thread thread2 = new Thread(program);
        Thread thread3 = new Thread(program);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}