package agrawal.nidhi.FunctionaInterface;

public class TestHelloInt {
	public static void main(String[] args) {
		HelloInt h=new HelloInt() {
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Hello anonymous class");
			}
		};
		h.hello();
	}
}
