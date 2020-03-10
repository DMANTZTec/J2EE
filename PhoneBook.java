package com.example.javaInterface;

import java.util.HashMap;

public class PhoneBook {
	public static void main(String args[]) {
		
		HashMap<String,Long> PhoneBook = new HashMap<String,Long>();
		
		PhoneBook.put("vijay",9959609201L);
		PhoneBook.put("Harsha",9876543210L);
		PhoneBook.put("yashwanth",123456789L);
		PhoneBook.put("Rohith",4561237890L);
		PhoneBook.put("Santosh",1234567890L);
		PhoneBook.put("Prem",7894561230L);
		
		System.out.println("PhoneBook:"+PhoneBook);
	}

}
