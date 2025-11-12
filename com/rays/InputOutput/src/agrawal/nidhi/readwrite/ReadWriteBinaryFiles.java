package agrawal.nidhi.readwrite;

import java.io.*;

public class ReadWriteBinaryFiles {
	public static void main(String[] args) throws Exception {
		FileInputStream in=new FileInputStream("C:\\Users\\Nidhi\\OneDrive\\Desktop\\Image\\shinchan.jpeg");
		FileOutputStream out=new FileOutputStream("C:\\Users\\Nidhi\\OneDrive\\Desktop\\Image\\newshinchan.jpg");
		
		int i=in.read();
		
		while(i!=-1) {
			out.write(i);
			i=in.read();
		}
		System.out.println("Image copied successfully done");
		in.close();
		out.close();
	}
}
