
public class Calculator {
	
	public int  addition(int a,int...b)
	{
		int sum = 0;
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i];
		}
		return sum;
	}
	public int  substraction(int b,int...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public int multi (int b,int...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public int division(int b,int...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	
	public double Addition(double b,double...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public double Substraction(double b,double...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public double Mult(double b,double...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public double Division(double b,double...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}

		public static void main(String args[]) {
			
	
			
			 Calculator calc=new Calculator();
			 System.out.println("addition of two int:"+calc.addition(7,6));
			 System.out.println("substraction of two int:"+calc.substraction(7,6));
			 System.out.println("multiplication of two int:"+calc.multi(7,6));
			 System.out.println("division of two int:"+calc.division(7,6));
			 
			}
	
		}

