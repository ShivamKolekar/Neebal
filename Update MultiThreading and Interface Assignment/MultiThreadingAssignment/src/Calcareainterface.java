
interface shape{
	double getArea();
}


class rectangle implements shape
{
	double l;
	double b;
	rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	
	public double getArea()
	{
		return l*b;
	}

}

class circle implements shape
{
	double r;
	circle(double r)
	{
		this.r=r;
	}
	public double getArea()
	{
		return 3.14*r*r;
	}

	
}



public class Calcareainterface {

	public static void main(String[] args) {
		rectangle r = new rectangle(5,2);
		circle c=new circle(5);
		System.out.println("Area of rectangle is"+r.getArea());
		System.out.println("Area of circle is"+c.getArea());
	}

}
