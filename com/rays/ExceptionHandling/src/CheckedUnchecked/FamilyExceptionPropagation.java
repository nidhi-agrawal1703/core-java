package CheckedUnchecked;

public class FamilyExceptionPropagation {

	public static void main(String[] args) {
		try {
			dad();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	public static void dad() throws Exception {
		mom();
	}
	public static void mom() throws Exception {
		son();
	}
	public static void son() throws Exception {
		throw new CheckedException("I made a mistake");
	}
}
