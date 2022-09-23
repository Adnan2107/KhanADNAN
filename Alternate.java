
public class Alternate {


public static int  printAlternetNo(int[]arr1) 
	{
		 
	        int total=0;
	        
	        System.out.println("Alternating number are" );
	        for (int i = 0; i < arr1.length; i = i+2) 
	        {  
	
				System.out.println(arr1[i]);
				
				total +=arr1[i];
	        }  
			
	        return total;
	      
	}
	
	
	public static void main(String[] args) 
	{     
	       int [] arr1 ={1, 2, 3, 4, 5,6,7,8,9,1};  

	       int total=printAlternetNo(arr1);
		System.out.print("Addition Of Alternating number :" +total);
	}



	    }
	


