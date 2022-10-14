package com.codebind;

public class Customer {

	public Customer(int customerId, String customerName, Long contact, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contact = contact;
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	private int customerId;
	private String customerName;
	private Long contact;
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "customerId=" + customerId + ", customerName=" + customerName + ", contact=" + contact + ", " + address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
