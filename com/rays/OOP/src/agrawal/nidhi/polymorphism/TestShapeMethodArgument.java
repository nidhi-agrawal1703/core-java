package agrawal.nidhi.polymorphism;

public class TestShapeMethodArgument {
	
	public static void main(String[] args) {
		
		Shape[] s=new Shape[3];
		
		s[0]=new Rectangle();
		Rectangle r=(Rectangle)s[0];
		r.setLength(5);
		r.setWidth(5);
		
		
		s[1]=new Circle();
		Circle c=(Circle)s[1];
		c.setRadius(2);
		
		s[2]=new Triangle();
		Triangle t=(Triangle)s[2];
		t.setBase(5);
		t.setHeight(2);
		
		double totalArea=calcArea(s);
		System.out.println(totalArea);
		
		
		
	}
	public static double calcArea(Shape[] s) {
		
		double totalArea=0.0;
		
		for(int i=0;i<s.length;i++) {
			totalArea+=s[i].area();
			System.out.println(s[i].area());
		}
		return totalArea;
		
	}
		
}
