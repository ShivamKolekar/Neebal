public class Evenoddprinter {

	public static void main(String[] args) {
		Evenodd e = new Evenodd(1);
		Evenodd o = new Evenodd(2);
		
		try {
			e.start();
			e.join();
			o.start();
			o.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}

class Evenodd extends Thread
{
	int num;
	public Evenodd(int n)
	{
		super("New Thread");
		this.num=n;
	}
	

	public void run() 
	{
		
			if(num==2) {
				for(int i=1;i<=20;i+=2) {
					System.out.print(i+" ");
				}
			}
			else {
				for(int i=2;i<=20;i+=2) {
					System.out.print(i+" ");
				}
			}
			
		
	}
}