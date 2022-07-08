package com.RevatureEmployeeReimbursement;

import java.util.Scanner;
import java.util.*;

public class EmployeeLogIn {
	
	String Username;
	String Password;
	String Role;
	
	EmployeeLogIn() {
		
	}
	
	EmployeeLogIn(String Username, String Password, String Role) {
		
		this.Username = Username;
		this.Password = Password;
		this.Role = Role;
	}
	
	 void printEmployeeLogInDetails() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Username: ");
        String Username = scanner.nextLine();
        scanner.nextLine();
        
		System.out.print("Enter Password: ");
		String Password = scanner.nextLine();
		
		System.out.print("Enter Role: ");
		String Role = scanner.nextLine();
		
		
		scanner.close();
		
		System.out.println("Username: " + Username);
		System.out.println("Password: " + Password);
		System.out.println("Role: " + Role);
		
		
	}
	
	public static void main(String[] args) {
		
		EmployeeLogIn Employee1 = new EmployeeLogIn();
		EmployeeLogIn Employee2 = new EmployeeLogIn();
		
		Employee1.printEmployeeLogInDetails();
		Employee2.printEmployeeLogInDetails();
	}
	

}
