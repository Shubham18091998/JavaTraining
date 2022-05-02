package com.cts.domain;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter user name:");
			String userName=sc.nextLine();
			if(Character.isLowerCase(userName.charAt(0))) {
				throw new UsernameException("Invalid user name");
			}
			else {
				try {
					System.out.println("Enter password:");
					String password=sc.nextLine();
					if(password.length()<8) {
						throw new PasswordException("Invalid password | Password must be 8 character long");
					}
					else if(password.contains("@")||password.contains("$")||password.contains("#")||password.contains("$")) {
						System.out.println("User is created");
					}
					else {
						throw new PasswordException("Invalid password | Password must contain a special character");
					}
				}catch(PasswordException e) {
					System.out.println(e);
				}
			}
		}catch(UsernameException e) {
			System.out.println(e);
		}

	}

}
