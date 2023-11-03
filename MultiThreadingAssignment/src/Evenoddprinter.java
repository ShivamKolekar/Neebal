public class Evenoddprinter {

	public static void main(String[] args) {
		Even e = new Even();
		Odd o = new Odd();
		e.run();
		o.run();
	}
}

class Even extends Thread {
	public void run() {
		for (int i = 1; i <= 20; ++i) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}

class Odd extends Thread {
	public void run() {
		for (int i = 1; i <= 20; ++i) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}