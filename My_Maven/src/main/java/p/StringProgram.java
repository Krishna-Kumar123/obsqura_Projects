package p;
import java.util.Scanner;
public class StringProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		StringBuffer s1 = new StringBuffer(s);
		s1.reverse();
		String s2 = new String(s1);
		System.out.println(s2);
		System.out.println(s);
		
		if(s2.equalsIgnoreCase(s)==true)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
