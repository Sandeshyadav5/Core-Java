package com.rays.Io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestValidPhoneNumber {
	public static void main(String[] args) throws Exception {
		FileReader source= new FileReader("D://IO//phone.txt");
		FileWriter target =new FileWriter("D://IO//ValidPhone.txt");
		
		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw= new BufferedWriter(target);
		
		String phone=br.readLine();
		
		while(phone!=null) {
			if(phone.length()==10) {
			bw.write(phone);
			bw.newLine();
		}
		phone=br.readLine();
	}
	br.close();
	bw.close();
	}
}
