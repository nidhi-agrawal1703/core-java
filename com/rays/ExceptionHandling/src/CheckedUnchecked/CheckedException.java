package CheckedUnchecked;

public class CheckedException extends Exception {
	public CheckedException(String msg) {
		super(msg);
		System.out.println(msg);
	}
}
