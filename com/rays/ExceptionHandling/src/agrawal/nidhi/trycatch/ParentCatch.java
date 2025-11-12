package agrawal.nidhi.trycatch;

public class ParentCatch {
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		String str=null;
		
		try {
			double div=i/j;
			System.out.println(div);
			System.out.println(str.charAt(8));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
