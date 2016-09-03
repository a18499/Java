interface Shape
{
   final double PI = 3.14;
    abstract void setcolor(String cl);
}
interface shape2D extends Shape
{
	abstract void ares();
}
class Circle12 implements shape2D
{
	double radius;
	String color;
	public Circle12(double r)
	{
		radius = r;
	}
	public void setcolor(String cl)
	{
		color = cl;
		System.out.println("color is:"+cl);
	}
	public void ares()
	{
		System.out.println("Area is:"+PI*radius*radius);
	}
}
public class test_interface
{
	public static void main(String arg[])
	{
		Circle12 c1;
		c1 = new Circle12(5);
		c1.setcolor("Blue");
		c1.ares();
		
	}
}