package com.rays.Io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TestBufferWriter {
	public static void main(String[] args) throws Exception {
		
		BufferedWriter file= new BufferedWriter(new FileWriter("D://sandesh//Hello.java"));
		file.write("sandesh");
		file.newLine();
		file.write("sndfj");
		System.out.println("successfully write");
		file.close();
			
	}

}
