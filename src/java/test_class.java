class CCcircle
{
	String color;
	double pi = 3.14;
	double radius;
	/*method overloading*/
	void setcircle(String str)
	{
		color = str;
	}
	void setcircle(double ra)
	{
		radius = ra;
	}
	void setcircle(String str, double ra)
	{
		color = str;
		radius = ra;
	}
	void show()
	{
		System.out.println("color = "+color+",radius="+radius);
		System.out.println("area = "+pi*radius*radius);
	}
}
public class test_class
{
	public static void main (String args[])
	{
		CCcircle c1 = new CCcircle();
		c1.setcircle(5);
		c1.setcircle("red");
		c1.show();
		
	}
}