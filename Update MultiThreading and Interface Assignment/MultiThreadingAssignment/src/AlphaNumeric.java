class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            /*try {
                //Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}

class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
            /*try {
                //Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}

public class AlphaNumeric {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        AlphabetThread alphabetThread = new AlphabetThread();

        numberThread.start();
        alphabetThread.start();
    }
}