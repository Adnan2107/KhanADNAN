
public class Vowel {
	
	public void countVowel(String str) throws CheckedException 
	{
		
		int count=0;
		
		char[] ch =  new char[str.length()];//creating array of string length
		
		for(int i=0;i<str.length();i++)//copying character by character in array 
		{
			ch[i]=str.charAt(i);
		}
		
		for(int i=0;i<ch.length;i++) //printing the elements 
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
			{
				count++;	
			}
			if(ch[i]=='x') 
			{
				throw new CheckedException("\n array contains 'x' Please Enter a valid String... ");
			}
			System.out.print(ch[i]+" ");
		}
		
		System.out.println("\n\nNo Of Vowel in Strings Are : "+count);
		
		for(int i=0;i<ch.length;i++) //printing the elements 
		{
			if(ch[i]=='x') 
			{
				throw new CheckedException("\n array contains 'x' Please Enter a valid String... ");
			}
		}
		
	}
	

}
