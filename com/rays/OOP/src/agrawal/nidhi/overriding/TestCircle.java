package agrawal.nidhi.overriding;

public class TestCircle {
	public static void main(String[] args) {
		
		//Storing child class reference in parent class variable
		Shape s1=new Circle();
		
		//Typecasting Shape type object into Circle type object
		Circle c=(Circle)s1;
		
		c.setRadius(5);
		System.out.println(s1.area());
	}
}
