package com.library.Address;

public class Address{
	private String street;
	private String city;

	public Address(String street, String city) {
		this.street = street;
		this.city = city;
	}

	 public Address(Address other) {
		 this.street = other.getStreet();
		 this.city = other.getCity();
	 }

	public void showAddress() {
		System.out.printf("%s, %s%n", this.city, this.street);
	}

	public boolean equal(Address other) {
		 if ( this.street.equals(other.street) && this.city.equals(other.city) ) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}

	public String getStreet() {
		return this.street;
	}

	public String getCity() {
		return this.city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
