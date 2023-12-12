package SuperExample;

public class ClassB extends ClassA{
	
	final int age =10;
	public ClassB(){
		super();
		String a = "Child class variable";	
	}
	
	public void method2() {
		
		System.out.println("Child class method");
		super.method1();
		
		System.out.println("Parent class variable is "+super.var);
	}

	public static void main(String[] args) {
		
		ClassB b = new ClassB();
		b.method2();
		b.age = 20;
	
	}

}
