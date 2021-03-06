package com.msl.sampleobj;

public class Student {
	static String batchName ;
	
	//fields
	int rollNumber;
	/*
	data types
	int - integer 
	*/
	String firstName;
	String lastName;
	//constructors
	//default constructor
	public Student() {
		
	}
	
	
	//parameterized constructor
	public Student(int rollNumber, String firstName, String lastName) {
		
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	//methods  Getters and Setters
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [rollNumber:" + rollNumber + ", firstName:" + firstName + ", lastName:" + lastName + "]";
	}
	
}
