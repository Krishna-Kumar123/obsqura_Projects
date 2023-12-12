package Hierarchical_Inheritance;

public class ChildB extends ParentClass {

	public static void main(String[] args) {
		ChildB b = new ChildB();
		b.display();
		b.view();
	}
	public void view()
	{
		System.out.println("Class B");
	}

}
