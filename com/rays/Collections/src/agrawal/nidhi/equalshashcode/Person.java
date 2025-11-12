package agrawal.nidhi.equalshashcode;

public class Person {

	private String name;
	
	public Person(String name) {
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p=(Person)obj;
		return this.name.equals(p.name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
