package com.cts.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
	
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		String name=null;
		try {
			name=br.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Name="+name);
	}

}
