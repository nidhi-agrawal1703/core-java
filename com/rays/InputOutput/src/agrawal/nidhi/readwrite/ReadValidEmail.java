package agrawal.nidhi.readwrite;

import java.io.*;

public class ReadValidEmail {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("C://Users//Nidhi//OneDrive//Desktop//email.txt"));
		BufferedWriter out=new BufferedWriter(new FileWriter("C://Users//Nidhi//OneDrive//Desktop//validemail.txt"));
		String email=in.readLine();
		String emailRegex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		
		while(email!=null) {
			if(email.matches(emailRegex)) {
				System.out.println(email);
				out.write(email);
				out.newLine();
			}
			email=in.readLine();
		}
		in.close();
		out.close();
	}
}
