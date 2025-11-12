package agrawal.nidhi.writing;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String[] args) throws Exception {
		FileWriter file=new FileWriter("C://Users//Nidhi//OneDrive//Desktop//newfile.txt");
		char[] a= {'h','i'};
		file.write(a);
		file.write("SunilOs");
		System.out.println("Data added successfully");
		file.close();
	}
}
