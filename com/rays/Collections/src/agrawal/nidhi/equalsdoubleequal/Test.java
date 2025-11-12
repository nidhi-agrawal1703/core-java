package agrawal.nidhi.equalsdoubleequal;

public class Test {
	public static void main(String[] args) {
		
		String s1=new String("hello");
		String s2=new String("hello");
		
		System.out.println(s1==s2);//false as "==" operator checks references
		
		System.out.println(s1.equals(s2));//true because equals checks logical values
	}
}
