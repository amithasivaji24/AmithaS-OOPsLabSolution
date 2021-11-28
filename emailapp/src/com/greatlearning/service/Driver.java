package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		Employee employee = new Employee("Amitha", "Sivaji");
		CredentialService credentialService = new CredentialService();
		String generatedEmail = null;
		char[] generatedPassword = null;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option = scanner.nextInt();
		
		switch(option) {
		case 1: {
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "tech");
			generatedPassword = credentialService.generatePassword();
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		
		case 2: {
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "adm");
			generatedPassword = credentialService.generatePassword();
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		
		case 3: {
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "hr");
			generatedPassword = credentialService.generatePassword();
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		
		case 4: {
			generatedEmail = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "lg");
			generatedPassword = credentialService.generatePassword();
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		
		default:
			System.out.println("Invalid option. Enter between 1-4");
			break;
		}
		
		scanner.close();
		
	}

}
