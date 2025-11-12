package agrawal.nidhi.equalsdoubleequal;

public class Employee {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Employee)) {
			return false;
		}

		Employee e = (Employee) obj;

		return this.name.equals(e.name) && this.age == e.age;

	}

}
