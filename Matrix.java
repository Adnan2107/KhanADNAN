
public class Matrix {

	
		public void Multiply()
	 {
		//two matrices
	 	int n1[][]={{20,30,40},{6,7,8}};  
		int n2[][]={{1,2,3},{50,60,70}};  
		
		//Result of 3rd Matrix
		int n3[][]=new int[n1.length][n1[0].length]; //No. of row &columns 
		  
		{ 
     		  for(int i=0;i<n1.length;i++)
	    	  for(int j=0;j<n1[i].length;j++)
		   {  
		     n3[i][j]=n1[i][j] * n2[i][j]; //multiplication of matrices n1&n2 
		     System.out.print(n3[i][j]+" ");  
		   }  
		    System.out.println(); 
		}
	 }  
		
		
		
		public static void main(String[] args) 
		{
			Matrix ma=new Matrix();
				ma.Multiply();

		}

	
		
			
	}
	
	



