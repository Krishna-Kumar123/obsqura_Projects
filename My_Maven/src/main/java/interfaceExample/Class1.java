package interfaceExample;

public class Class1 implements interfaceExample {
	
	public void display() {
		
		System.out.println("Display");
	}
	public void show() {
		System.out.println("Show");
		System.out.println("value = "+VALUE);
		
	}

	public static void main(String[] args) {
		Class1 c = new Class1();
		c.display();
		c.show();
		

	}

}
