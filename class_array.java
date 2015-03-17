class CCircle
{
	private static double pi = 3.14;
	private double radius;
	public CCircle(double r)
	{
		radius =r;
	}
	public static double compare(CCircle cr[])
	{
		double max =0;
		for(int i=0;i<cr.length;i++)
		{
			if(cr[i].radius > max)
			{
				max = cr[i].radius;
			}
		}
		return max;
	}

}
public class class_array
{
	public static void main(String arg[])
	{
		CCircle cir[] = new CCircle[3];
		cir[0] = new CCircle(2.0);
		cir[1] = new CCircle(1.0);
		cir[2] = new CCircle(5.0);
		System.out.println("Larges radius = "+CCircle.compare(cir));
	}
}