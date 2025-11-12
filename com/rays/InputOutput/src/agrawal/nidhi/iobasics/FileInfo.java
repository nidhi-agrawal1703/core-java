package agrawal.nidhi.iobasics;

import java.io.File;
import java.util.*;

public class FileInfo {
	public static void main(String[] args) {
		//Create object of 'a.txt' file
		File f=new File("C:\\Users\\Nidhi\\OneDrive\\Desktop\\first.txt");
		
		//Check if file exists
		if(f.exists()) {
			System.out.println("NAme: "+ f.getName());
		//Path of file
			System.out.println("Path of file: "+ f.getAbsolutePath());
		//Check Access Permission
			System.out.println("Access permission");
			System.out.println("Writable: "+f.canWrite());
			System.out.println("Readable: "+f.canRead());
		//Check if it is a directory or file
			System.out.println("Is File "+f.isFile());
			System.out.println("Is Directory "+f.isDirectory());
			
		//Last modified date of file
			System.out.println("DAte modified: "+ new Date(f.lastModified()));
			
		//length of file
			long length=f.length();
			System.out.println("Length: "+length+" bytes");
			
		}else {
			System.out.println("File does not exists");
		}
	}
}
