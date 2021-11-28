package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".abcpvtltd.com";
	}
	
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters ="!@#$%^&*_=+-/.?<>)";
		
		String values = smallLetters + capitalLetters + numbers + specialCharacters;
		
		Random random = new Random();
		
		char[] password = new char[8];
		
		for(int i = 0 ; i < 8 ; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		
		return password;
	}
	
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows:");
		System.out.println("Email --> " + email);
		System.out.println("Password --> " + String.valueOf(generatedPassword));
	}

}