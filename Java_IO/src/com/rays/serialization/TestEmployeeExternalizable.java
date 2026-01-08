package com.rays.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {public static void main(String[] args) throws Exception, IOException {
	
	TestEmployee a=new TestEmployee(1,"Ram");
	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D://sandesh//Employee.txt"));
	out.writeObject(a);
	out.close();
	System.out.println("successfully Externalized");
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("D://sandesh//Employee.txt"));
	System.out.println(in.readObject());
	in.close();
}

}
