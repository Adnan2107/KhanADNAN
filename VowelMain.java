import java.util.Scanner;

public class VowelMain {

	public static void main(String[] args) {
		Vowel t = new Vowel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		try 
		{
			t.countVowel(str);
		}
		catch(CheckedException ce) 
		{
			System.out.println(ce);
		}

	}

}
