package controller;
import model.*;
import exception.NoSuchException; 

public class Customer {
	
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String name;
	
	public Customer()
	{
		
		name = "";
		state ="";
		city ="";
		address ="";
		zipCode ="";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	public static Customer getNameAndAddress(int custNo)
	{
		Customer c = new Customer();
		try
		{
			c = CustomerIO.getCustomer(custNo);
			
		}
		
		catch( NoSuchException e)
		{
			e.printStackTrace();
		}
		
	return c;
		
	}
	@Override
	public String toString()
	{
		String message = this.name +this.state +this.city+this.address+this.zipCode;
		return message;
	}

}
