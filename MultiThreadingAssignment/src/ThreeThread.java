public class ThreeThread {
	public static void main(String[] args) {
		String[] course= {"Java","J2EE","Spring"};
		
		for(String str :course) {
			Printing r1=new Printing("Java");
			Thread t1=new Thread(r1);
			t1.start();
			Printing r2=new Printing("J2EE");
			Thread t2=new Thread(r2);
			t2.start();
			Printing r3=new Printing("Spring");
			Thread t3=new Thread(r3);
			t3.start();
		}
	}
}

class Printing implements Runnable {
	private String str;
	public Printing(String s) {
	this.str=s;
}	
	public void run() {
		System.out.println(str);
	}
	
}