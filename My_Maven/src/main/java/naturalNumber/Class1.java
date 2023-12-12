package naturalNumber;
import java.util.Scanner;
public class Class1 {
	static int n;
	public static void print() {
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i+=1;
		}
		}

	public static void main(String[] args) {
		
		System.out.println("Enter limit");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		print();
		
	}
	}
