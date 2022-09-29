
public abstract class BankMain {
	
		 abstract int  getbalance(int balance);
		 
		 
  }

         class BankA extends BankMain{

		int getBalance(int balance)
		{
			return balance;
			
		}
         
    }

	
	  class BankB extends BankMain {

		
		int getBalance(int balance)
		{
			return balance;
			
		}
		
    }

	    class BankC extends BankMain {

		int getBalance(int balance)
		{
			return balance;
			
		}

    }
		public static void main(String[] args) {
			
				BankA a = new BankA();
				System.out.println("A Boy Deposited Rs In Bank A are : "+a.getBalance(1000));
				
				BankB b = new BankB();
				System.out.println(" A Boy Deposited Rs In Bank B are : "+b.getBalance(1500));
				
				BankC c=new BankC();
				System.out.println("A Boy Deposited Rs In Bank C are :  "+c.getBalance(2000));

			}

	  }


	

