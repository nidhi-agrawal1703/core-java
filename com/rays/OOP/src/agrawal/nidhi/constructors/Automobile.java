package agrawal.nidhi.constructors;

public class Automobile {
	
	private String color;
	private int speed;
	private String make;
	
	public Automobile(String color,int speed,String make) {
		this.color=color;
		this.speed=speed;
		this.make=make;
	}
	
	public String getColor() {
		return this.color;
	}
	public int getSpeed() {
		return this.speed;
	}
	public String getMake() {
		return this.make;
	} 
	
	public void breakSpeed() {
		this.speed=0;
	}
	public void accelerator() {
		this.speed=this.speed+20;
	}

}
