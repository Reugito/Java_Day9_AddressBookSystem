package com.day9.AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {
	List<Person> addressBookList = new ArrayList();
	
	void addPerson(Person address) {
		addressBookList.add(address);
	}
	
	void printPerson() {
		for(Person Items: addressBookList) {
			System.out.println(Items);
		}
	}
	
	void addPersonDetails(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter firstName: ");
		String firstName = sc.next();
		System.out.print("\nEnter lastName: ");
		String lastName = sc.next();
		System.out.println("\nEnter address: ");
		String address = sc.next();
		System.out.println("\nEnter city: ");
		String city = sc.next();
		System.out.println("\nEnter state: ");
		String state = sc.next();
		System.out.println("\nEnter email: ");
		String email = sc.next();
		System.out.println("\nEnter zip: ");
		String zip = sc.next();
		System.out.println("\nEnter phoneNumber: ");
		String phoneNumber = sc.next();
		
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setFirstName(address);
		person.setLastName(city);
		person.setFirstName(state);
		person.setLastName(email);
		person.setFirstName(zip);
		person.setLastName(phoneNumber);
		addPerson(person);
	}
	
	void removeItem(Person address) {
		addressBookList.remove(address);
	}
}
