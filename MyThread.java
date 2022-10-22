
public class MyThread extends Thread {
	
		public void run()
		 {
		String[] friends={"Anas","Adil","Amaan","Kashif","Moin","Danish","Arbaz","Saif","Haider","Sammi"};
		 for(int i=0;i<10;i++)
		 { 
			 System.out.println(friends[i]); 
			 
			 }
		 } 


	public static void main(String[] args) {
		
		MyThread th1=new MyThread();
		MyThread th2= new MyThread();
		MyThread th3=new MyThread();
		th1.start();
		th2.start();
		th3.start();
		
	}

}
