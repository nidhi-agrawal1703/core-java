package agrawal.nidhi.readwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadValidMobileNo {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("C://Users//Nidhi//OneDrive//Desktop//mobile.txt"));
		BufferedWriter out=new BufferedWriter(new FileWriter("C://Users//Nidhi//OneDrive//Desktop//validmobile.txt"));
		String mobile=in.readLine();
		String mobileRegex="^[6-9]\\d{9}$";
		while(mobile!=null) {
			if(mobile.matches(mobileRegex)) {
				System.out.println(mobile);
				out.write(mobile);
				out.newLine();
			}
			mobile=in.readLine();
		}
		in.close();
		out.close();
	}

}
