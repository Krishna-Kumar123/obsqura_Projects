package package2;

public class Sales extends Employee {
	
	int sale = 1000;
	public static void main(String[] args) {
		Sales s = new Sales();
		s.print();
		s.display();

	}
	public void display()
	{
		System.out.println("Child class");
	}
	

}
