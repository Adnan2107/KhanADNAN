
public class DuplicateChars {
	
		public void charCheck() 
		{
			String str = "Hello World"; 
			int i ,j; 
			for(i = 0; i <str.length(); i++) 
			 {    
			       for(j = i+1; j < str.length(); j++) 
			       {  
			            if(str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') 
			            { 
			            	System.out.println("Duplicate characters in a given string: "+str.charAt(j)); 
			            }  	
			        } 
			 } 
			 
		}
		public static void main(String[] args) {
			DuplicateChars d= new DuplicateChars();
			d.charCheck();
	}

}
