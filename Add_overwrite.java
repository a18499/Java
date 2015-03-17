class CAdd
{
	public int sum =0 ;
	public void add()
	{
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		System.out.println("1+2+3+...+10 ="+sum);
	}
}
class CAddto extends CAdd
{
    int count=0;
	public CAddto(int r)
   {
		count = r;   
   }
	public CAddto()
   {
			
   }
	public void add()
	{
		if(count == 0 )
		{
			super.add();
			return;
		}
		for(int i=1;i<=count;i++)
		{
			sum+=i;
		}
		System.out.println("1+2+3+...+"+count + "="+sum);
	}
   
}
public class Add_overwrite
{
	public static void main(String arg[])
	{
		CAddto ad1 = new CAddto();
		CAddto ad2 = new CAddto(15);
		ad1.add();
		ad2.add();
		
	}
}