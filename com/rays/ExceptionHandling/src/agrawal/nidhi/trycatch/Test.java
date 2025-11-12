package agrawal.nidhi.trycatch;

public class Test {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		try {
			double div=a/b;
			System.out.println("Result: "+div);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("This block will execute irrespective of incoming exception");
		}
	}
}
