package agrawal.nidhi.generics;

public class Employee {
	
	public int id;
	public String name;
	public String address;
	
	public Employee(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	//Overiding toString() method so that object is printed when we can System.out.println
	@Override
	public String toString() {
		
		return "id: "+id+" name: "+name+" address: "+address;
	}
}
