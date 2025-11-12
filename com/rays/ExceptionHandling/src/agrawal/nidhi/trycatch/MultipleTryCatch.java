package agrawal.nidhi.trycatch;

public class MultipleTryCatch {
	public static void main(String[] args) {
		
		int i=15;
		int k=10;
		String str="Nidhi";
		
		//Although multiple catch blocks are written but at a time only one exception will be raised
		try {
			int div=i/k;
			System.out.println(div);
			System.out.println(str);
			System.out.println(str.charAt(5));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
