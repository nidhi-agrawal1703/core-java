package agrawal.nidhi.exceptiontypes;

public class TestStringOutOfBoundsException {
	
	public static void main(String[] args) {
		
		String str="Nidhi";
		
		try {
			System.out.println(str.charAt(7));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
