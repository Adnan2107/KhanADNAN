
public class Person {
	   int age;
	   String name;
	   
	   Person()
	   {
	   age=0;
	   name=null;
	   }
	   void Info()
	   {
		   System.out.println(" name is "+name);
		   System.out.println(" age "+age);
		  
	   }
	   

	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.name = "Adnan";
		p1.age = 21;
		
		
		   p1.Info();
		   
		Person p2=new Person();
		p2.name = "Saif";
		p2.age = 21;
		
		  
		  p2.Info();
		   
		   
	}
	
	
}


