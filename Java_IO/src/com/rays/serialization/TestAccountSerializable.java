package com.rays.serialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {
	public static void main(String[] args) throws Exception, IOException {
		
		Account a=new Account("3823442346",67342.343);
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D://sandesh//Account.txt"));
		out.writeObject(a);
		out.close();
		System.out.println("successfully Serialized");
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("D://sandesh//Account.txt"));
		System.out.println(in.readObject());
		in.close();
	}

}
