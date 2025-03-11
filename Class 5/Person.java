package com.library.Person;

import com.library.Address.*;

public class Person {
	private String name;
	private String role;
	private Address address;

	public Person(String name, String role, Address address) {
		this.name = name;
		this.role = role;
		this.address = address;
	}

	public Person(Person other) {
		this.name = other.name;
		this.role = other.role;
		this.address.setStreet(other.address.getStreet());
		this.address.setCity(other.address.getCity());

	} 

	public void showPersonDetails() {
		System.out.printf("%s.%n", this.name);
		System.out.printf("%s.%n", this.role);
		this.address.showAddress();
	}

	public boolean equal(Person other) {
		return (this.name.equals(other.name)&&this.role.equals(other.role)&&(this.address.equals(other.address)))? true : false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
}
