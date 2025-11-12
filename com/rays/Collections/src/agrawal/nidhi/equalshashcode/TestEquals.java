package agrawal.nidhi.equalshashcode;

public class TestEquals {
	
	public static void main(String[] args) {
		
		String s1=new String("Nidhi");
		String s2=new String("Nidhi");
		
		System.out.println(s1==s2);//== operator checks whether 2 references point to same memory
		System.out.println(s1.equals(s2));//equals operator checks logical value and not references
	}

}
