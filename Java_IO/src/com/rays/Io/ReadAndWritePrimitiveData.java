package com.rays.Io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {
	public static void main(String[] args) throws Exception {
		DataOutputStream out=new DataOutputStream(new FileOutputStream("D://sandesh//Primitive.txt"));
		out.writeInt(1);
		out.writeBoolean(false);
		out.writeDouble(4.5);
		out.writeChar('s');
		out.close();
		
		System.out.println("data added................");
		
		DataInputStream in=new DataInputStream(new FileInputStream("D://sandesh//Primitive.txt"));
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		System.out.println(in.readChar());
		
		in.close();
	}

}
