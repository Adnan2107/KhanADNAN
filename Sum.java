

public class Sum {

	
	public int sum(int[] values, int start,int end) throws ArrayIndexOutOfBoundsException,IllegalArgumentException,NullPointerException
	{
		int sum=0,i=0,j=0;
		
		for(i=start;i<=end;i++) 
			
		{
		if(values.length==0) 
		{
			throw new IllegalArgumentException("\n You passed an array of length 0 : ");
		}
		
		
		else if(start>=0 && end >=values.length-1) 
		{
			throw new ArrayIndexOutOfBoundsException("\n Array index out of bound :");
		}
		
			sum=sum+values[i];
		}
		System.out.print("Sum is ");
		return sum;
		
			
	}
	
	
	
	public class IllegalArgumentException extends Exception
	{
		public IllegalArgumentException() 
		{
			super();
		}
		public IllegalArgumentException(String message) 
		{
			super(message);
				
		}
		
	}
	
	public class NullPointerException extends Exception
	{
		public NullPointerException() 
		{
			super();
		}
		public NullPointerException(String message) 
		{
			super(message);
				
		}
		
	}
	
	public class ArrayIndexOutOfBoundsException extends Exception
	{
		public ArrayIndexOutOfBoundsException() 
		{
			super();
		}
		public ArrayIndexOutOfBoundsException(String message) 
		{
			super(message);
				
		}
		
	}	
	public static void main(String[] args) {
		
		Sum s=new Sum();
		int[] values= {1,2,3,4,5};
		try 
		{
			System.out.println(s.sum(values,1,3));
		} 
		catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | NullPointerException e) 
		{
			System.out.println(e);
		}
	}
	
	
}

	


