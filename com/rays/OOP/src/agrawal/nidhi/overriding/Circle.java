package agrawal.nidhi.overriding;

public class Circle extends Shape {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}
}
