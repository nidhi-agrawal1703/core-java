package agrawal.nidhi.exceptiontypes;

public class TestNumberFormatException {
	
	public static void main(String[] args) {
		
		String str="xyz123";
		
		try {
			int i=Integer.parseInt(str);
			
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
