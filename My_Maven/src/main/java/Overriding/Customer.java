package Overriding;

public class Customer extends Bank {
	int a =5;
	public static void main(String[] args) {
		Bank c = new Customer();
		Bank d = new Bank();
		c.details();
		d.details();
	}
	
	public void details()
	{
		System.out.println("Displaying details = "+a);
	}

}
