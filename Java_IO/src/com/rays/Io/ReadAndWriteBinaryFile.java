package com.rays.Io;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ReadAndWriteBinaryFile {
	public static void main(String[] args) throws Exception {
		String source="D://IO//doramon.jpeg";
		String target="D://IO//doramon.jpeg";
		FileInputStream in=new FileInputStream(source);
		FileOutputStream out=new FileOutputStream(target);
		int i=in.read();
		while(i!=-1) {
			System.out.println(i);
			out.write(i);
			i=in.read();
		}
		in.close();
		out.close();
		System.out.println("successfully...........");
	}

}
