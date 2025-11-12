package agrawal.nidhi.inheritance;

public class Circle extends Shape{
	
	protected int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return 3.14*radius*radius;
	}
}
