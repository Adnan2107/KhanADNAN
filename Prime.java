
public class Prime {
	    static int a;
		static void primeNumber(int n) {
			for(int i=1;i<=n;i++) {
				a=0;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						a++;
						break;
					}
				}
				if(a==0) {
					System.out.println(i);
				}
				
			}
		}
		public static void main(String[] args) {
			primeNumber(20);
		}
	
	
	
	
		
   	}
		
		
	   

			
		



