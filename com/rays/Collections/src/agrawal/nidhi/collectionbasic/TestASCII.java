package agrawal.nidhi.collectionbasic;

//This program will print ASCII code of alphabets
public class TestASCII {
	
	public static void main(String[] args) {
		
		System.out.println("(int)A");
		System.out.println("Capital Letters ASCII");
		for(char c='A';c<='Z';c++) {
			System.out.println(c+ ":" + (int)c );
		}
		System.out.println("--------------");
		
		System.out.println("Small Letter ASCII");
		for(char c='a';c<='z';c++) {
			System.out.println(c+": "+(int)c);
		}
		
	}
}
