package agrawal.nidhi.inheritance;

public class TestShape {
	
	public static void main(String[] args) {
		
		Circle c=new Circle();
		c.setRadius(8);
		c.setColor("blue");
		c.setBorderWidth(5);
		System.out.println("Area of circle: "+c.area());
				
		Triangle t=new Triangle();
		t.setColor("red");
		t.setBorderWidth(5);
		t.setBase(5);
		t.setHeight(8);		
		System.out.println("Area of triangle: "+t.area());
		
		Rectangle r=new Rectangle();
		r.setColor("green");
		r.setBorderWidth(9);
		r.setLength(8);
		r.setWidth(6);
		System.out.println("Area of rectangle: "+ r.area());
		System.out.println("Color of triangle: "+r.getColor());
		
		
	}
}
