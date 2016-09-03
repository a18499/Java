public class Array
{
	public static void main(String arg[])
	{
		int arr [];
		int a [] = {18,-51,23,35,10,9,-3,52,81,69};
		int b[] ={28,32,-35,40,73,17,92,32,13,29};
		int sum =0;
		arr = new int[4];
		for(int i=0 ;i<4;i++)
		{
			arr[i] = i;
			System.out.println(arr[i]);
		}
		for(int counter = 0;counter<9;counter++)
		{
			sum+=(a[counter]*b[9-counter]);
		}
		System.out.println("sum is :"+sum);
	}
}