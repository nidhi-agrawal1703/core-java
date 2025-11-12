package agrawal.nidhi.reading;

//FileReader class reads file character by character

import java.io.FileReader;

public class ReadTextFile {
	
	public static void main(String[] args) {
		try {
			FileReader in=new FileReader("C:\\Users\\Nidhi\\OneDrive\\Desktop\\first.txt");
			int i=in.read();
			while(i!=-1) {
				System.out.println((char)i);
				i=in.read();
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
