package encapsulation;

public class ClassB {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.setAcc_no(123);
		a.setName("KrishnaKumar");
		System.out.println("Account number = "+a.getAcc_no());
		System.out.println("Name = "+a.getName());

	}

}
