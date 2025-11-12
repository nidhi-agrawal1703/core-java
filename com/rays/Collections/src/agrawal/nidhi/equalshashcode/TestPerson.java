package agrawal.nidhi.equalshashcode;

public class TestPerson {
	public static void main(String[] args) {
		
		Person p1=new Person("Ram");
		Person p2=new Person("Shyam");
		Person p3=new Person("Ram");
		
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
