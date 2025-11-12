package agrawal.nidhi.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	public int id;
	String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:"+id+" name:"+name;
	}
}
