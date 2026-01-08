package com.rays.Io;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferReader {
	public static void main(String[] args) throws Exception {
		
		BufferedReader file= new BufferedReader(new FileReader("D://sandesh//Hello.java"));
		
		String line=file.readLine();
		while(line !=null) {
			System.out.println(line);
			line=file.readLine();
		}
		file.close();
		
	}

}
