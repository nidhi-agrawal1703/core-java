package agrawal.nidhi.writing;

import java.io.*;

public class WriteTextLineByLine {
	
	public static void main(String[] args) throws Exception {
		BufferedWriter out=new BufferedWriter(new FileWriter("C://Users//Nidhi//OneDrive//Desktop//newfile1.txt"));
		out.write("Hello sunilOs");
		out.newLine();
		out.write("This is my first program");
		System.out.println("File created successfully");
		out.close();
	}
}
