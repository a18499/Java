class CShape
{
	protected static double pi =3.14; 
	protected double height;
	protected double weight;
	protected double area()
	{
		return 0;		
	}
   public static void largest(CShape cs[])
   {
	   double max =0;
	   for(int i=0;i<cs.length;i++ )
	   {
		   if(cs[i].area()>max)
		   {
			   max = cs[i].area();
		   }
	   }
	   System.out.println("Max is:"+max);
   }
}
class Ccircle1 extends CShape
{
	protected static double pi =3.14; 
	protected double radius;
	public  Ccircle1(double r )
	{
		radius = r;
	}
	protected double area()
	{
		System.out.println("circle area is:"+pi*radius*radius);
		return pi*radius*radius;		
	}
}
class CSquare extends CShape
{
	
	public  CSquare(double h, double w)
	{
		height = h;
		weight = w;
	}
	protected double area()
	{
		System.out.println("CSquare area is:"+height*weight);
		return height*weight;		
	}
}
class CTriangle extends CShape
{
	public  CTriangle(double h, double w)
	{
		height = h;
		weight = w;
	}
	protected double area()
	{
		System.out.println("CTriangle area is:"+(height*weight)/2);
		return (height*weight)/2;		
	}
}
public class method_overriding
{
	public static void main(String arg[])
	{
		CShape csp[] = new CShape[3];
		csp[0] = new Ccircle1(2);
		csp[1] = new CSquare(4,2);
		csp[2] = new CTriangle(4,2);
		CShape.largest(csp);
		
	}
}