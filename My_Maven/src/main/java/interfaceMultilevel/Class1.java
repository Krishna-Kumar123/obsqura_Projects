package interfaceMultilevel;

public class Class1 implements interfaceExample3 {
	
	public void display1() {
		
		System.out.println("Display_1");
	}
	public void show1() {
		System.out.println("Show_1");
		System.out.println("value = "+VALUE_1);
		
	}
	public void display2() {
		
		System.out.println("Display_2");
	}
	public void show2() {
		System.out.println("Show_2");
		System.out.println("value = "+VALUE_2);
		
	}
	public void display3() {
		
		System.out.println("Display_3");
	}
	public void show3() {
		System.out.println("Show_3");
		System.out.println("value = "+VALUE_3);
	}

	public static void main(String[] args) {
		Class1 c = new Class1();
		c.display1();
		c.show1();
		c.display2();
		c.show2();
		c.display3();
		c.show3();
		

	}

}
