import java.io.*;

public class Input
{
	public static void main(String arg[])
	{
		int num;
		int max = java.lang.Integer.MAX_VALUE;
		int temp;
		String str = null;
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入整數");
		try {
			str = buf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		num=Integer.parseInt(str);
		System.out.println(num+"的平方是"+num*num);
		
		System.out.println("int max is:"+max);
		for(int i=5;i>0;i--)
		{
			temp =i;
			while(temp!=0)
			{
				System.out.print("*");
				temp--;
			}
			System.out.println("\n");
		}
	}

}