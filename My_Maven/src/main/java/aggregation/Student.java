package aggregation;

public class Student {
	String name;
	int rollnumber;
	Address a;
	public Student(String name,int rollnumber,Address a) {
		this.name=name;
		this.rollnumber=rollnumber;
		this.a =a;
	}
	public void display() {
		System.out.println("Name "+name);
		System.out.println("rollnumber "+rollnumber);
		System.out.println("Housenumber "+a.housenumber);
		System.out.println("Housename "+a.housename);
		System.out.println("pincode "+a.pincode);
		
	}
	public static void main(String[] args) {
		Address ad =new Address(101,"Krishna",695021);
		Student st =new Student("KrishnaKumar",29,ad);
		st.display();

	}

}
