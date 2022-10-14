package com.codebind;

public class Address {
	public Address(String street, String city, String state, String country, int pincode) {

		Street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	private String Street;
	private String city;
	private String state;
	private String country;
	private int pincode;

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Street=" + Street + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode="
				+ pincode;
	}

}
