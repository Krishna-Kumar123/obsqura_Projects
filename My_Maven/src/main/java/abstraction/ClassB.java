package abstraction;

public class ClassB extends ClassA {
	
	public void print() {
		
		System.out.println("Implementation");
		
	}
	public void show() {
		System.out.println("Show");
	}

	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.print();
		b.show();
		b.display();

	}

}
