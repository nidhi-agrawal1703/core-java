package agrawal.nidhi.equalsdoubleequal;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setName("Nidhi");
		e1.setAge(15);
		
		Employee e2=new Employee();
		e2.setName("Nidhi");
		e2.setAge(15);
		
		System.out.println(e1==e2);//"==" checks references
		System.out.println(e1.equals(e2));
	}
}
