
public class Instructor extends Person{
	
	private double salary=0;
	
	public Instructor(String theName, int bYear, double salary) {
		
		super(theName, bYear);
		this.salary=salary;
	}
	
	public String toString() {
		   
		return("Instructor[super=" + super.toString() + ",salary=" + salary +"]");   
	}
}
