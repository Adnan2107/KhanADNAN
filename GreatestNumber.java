/**
 * 
 */

/**
 * @author SABSSSS
 *
 */
public class GreatestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1 = 300, n2 = 180, n3 = 50;
		if ( n1 >= n2 && n1 >= n3)
			System.out.println(n1 + "is the largest number");
		else  if( n2 >= n1 && n2 >=n3)
			System.out.println(n2 + "is the largest number");
		else
			System.out.println(n3 + "is the largest number");

	}

}
