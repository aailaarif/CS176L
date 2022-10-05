package edu.monmouth.grade;

public class ProblemSet1 {

	public static void main(String[] args) {
		
		//Instantiate a new Grade object with the default constructor
		Grade theGrade=new Grade();
		//Use the getter method getGradeLetter() to receive the current gradeLetter
		//Prints 'U' because the default constructor sets the instance variable of gradeLetter to 'U'
		System.out.println(theGrade.getGradeLetter());
		
		theGrade.setGradeLetter('A');
		//Prints 'A' because we used the setter method setGradeLetter('A') to change the value of the instance variable gradeLetter to 'A'
		System.out.println(theGrade.getGradeLetter());
		
		//Create a new grade object, secondGrade and use the constructor that takes a char value
		//Using this constructor, any character on the keyboard and unicode can be specified (not just A-F)
		Grade secondGrade=new Grade('D');
		System.out.println(secondGrade.getGradeLetter());
		
		//Use a setter method setGradeLetter('C') to change the value of gradeLetter in secondGrade to 'C' and output
		secondGrade.setGradeLetter('C');
		System.out.println(secondGrade.getGradeLetter());

	}

}
