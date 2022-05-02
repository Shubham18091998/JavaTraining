package com.cts.domain;

import java.util.Scanner;

public class UserValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter user name:");
			String userName=sc.nextLine();
			if(Character.isLowerCase(userName.charAt(0))) {
				throw new UserException("Invalid user name");
			}
			else {
				try {
					System.out.println("Enter password:");
					String password=sc.nextLine();
					if(password.length()>=8) {
						if(password.contains("@")||password.contains("$")||password.contains("#")||password.contains("$")) {
							System.out.println("User is created");
						}
						else {
							throw new UserException("Invalid password | Password must contain a special character");
						}
					}
					else {
						throw new UserException("Invalid password | Password must be 8 character long");
					}
				}catch(UserException e) {
					System.out.println(e);
				}
			}
		}catch(UserException e) {
			System.out.println(e);
		}

	}

}
