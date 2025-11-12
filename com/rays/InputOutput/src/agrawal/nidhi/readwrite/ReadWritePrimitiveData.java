package agrawal.nidhi.readwrite;

import java.io.*;

public class ReadWritePrimitiveData {
	public static void main(String[] args) throws Exception {
		DataOutputStream out=new DataOutputStream(new FileOutputStream("C:\\Users\\Nidhi\\OneDrive\\Desktop\\primitive.txt"));
		out.writeInt(5);
		out.writeDouble(22.3);
		out.writeBoolean(true);
		out.writeChar('a');
		out.writeShort(6);
		out.writeLong(1L);
		System.out.println("DAta written successfully in file");
		
		out.close();
		
		System.out.println("Reading data from the file");
		DataInputStream in=new DataInputStream(new FileInputStream("C:\\Users\\Nidhi\\OneDrive\\Desktop\\primitive.txt"));
		System.out.println(in.readInt());
		System.out.println(in.readDouble());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readShort());
		System.out.println(in.readLong());
	}
}
