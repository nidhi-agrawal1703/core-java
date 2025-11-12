package CheckedUnchecked;

public class TestRunException {
	public static void main(String[] args) {
		
		try {
			dad();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void dad() {
		mom();
	}
	public static void mom() {
		son();
	}
	public static void son() {
		throw new UncheckedException("This is runtime exception");
	}
	
}
