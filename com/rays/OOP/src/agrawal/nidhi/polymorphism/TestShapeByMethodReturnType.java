package agrawal.nidhi.polymorphism;

public class TestShapeByMethodReturnType {
	
	public static void main(String[] args) {
		
		Shape[] s=new Shape[3];
		
		s[0]=Shape.getShape(3);//Rectangle
		Rectangle r=(Rectangle)s[0];
		r.setLength(4);
		r.setWidth(6);
		
		s[1]=Shape.getShape(2);//Triangle
		Triangle t=(Triangle)s[1];
		t.setBase(2);
		t.setHeight(5);
				
		s[2]=Shape.getShape(1);//Circle
		Circle c=(Circle)s[2];
		c.setRadius(8);
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].area());
		}
		
		
	}
}
