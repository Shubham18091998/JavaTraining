package com.cts.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example3 {

	static String input() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		String name=null;
		name=br.readLine();
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		try {
			name=input();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Name="+name);

	}

}
