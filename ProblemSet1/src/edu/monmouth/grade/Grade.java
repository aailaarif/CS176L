package edu.monmouth.grade;

public class Grade {
	//instance variable
	private char gradeLetter;
	//default constructor
	public Grade() {
		gradeLetter = 'U';
	}
	//overloaded constructor that accepts a char parameter
	public Grade(char gradeLetter) {
		this.gradeLetter = gradeLetter;
	}
	//getter method that returns the current value of the instance variable gradeLetter
	public char getGradeLetter() {
		return gradeLetter;
	}
	//setter method that takes a char parameter and sets the instance variable gradeLetter to this value
	public void setGradeLetter(char gradeLetter) {
		this.gradeLetter = gradeLetter;
	}

}