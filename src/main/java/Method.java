public class Method
{
	public static void main(String arg[])
	{
		int arr1[]={1,2,3,4,5};
		int b=5;
		int anser;
		square(arr1);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		anser = fac(b);
		System.out.println("anser="+anser);
		
	}
	public static void square(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = arr[i]*arr[i];
		}
	}
	public static int fac(int a)
	{
		if(a== 0)
		{
			return 1;
		}
		else
		{
			return a*fac(a-1);			
		}
	}
	
}