package agrawal.nidhi.serialization;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws Exception, IOException {
		
		Employee e=new Employee(1,"Nidhi");
		
		//Serialization
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Nidhi\\OneDrive\\Desktop\\employee.txt"));
		out.writeObject(e);
		out.close();
		System.out.println("Object is serialized");
		
		//Deserialization
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\Nidhi\\OneDrive\\Desktop\\employee.txt"));
		e=(Employee)in.readObject();
		System.out.println(e);
				
	}
}
