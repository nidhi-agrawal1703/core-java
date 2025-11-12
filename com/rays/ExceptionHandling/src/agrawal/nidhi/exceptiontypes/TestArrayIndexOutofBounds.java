package agrawal.nidhi.exceptiontypes;

public class TestArrayIndexOutofBounds {
	
	public static void main(String[] args) {
		int[] i= {3,4,5,6,7};
		try {
			System.out.println(i[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
