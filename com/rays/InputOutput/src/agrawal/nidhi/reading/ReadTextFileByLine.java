package agrawal.nidhi.reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileByLine {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Nidhi\\OneDrive\\Desktop\\first.txt"));
		String str=br.readLine();
		while(str!=null) {
			System.err.println(str);
			str=br.readLine();
		}
		br.close();
	}
}
