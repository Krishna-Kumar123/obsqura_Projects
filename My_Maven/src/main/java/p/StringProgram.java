package p;
import java.util.Scanner;
public class StringProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		StringBuilder s1 = new StringBuilder(s);
		StringBuilder s2 = s1.reverse();
		StringBuilder s3 = new StringBuilder(s);
		
		
		System.out.println(s2);
		System.out.println(s3);
		
		if(s3==s2)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
