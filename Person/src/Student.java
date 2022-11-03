
public class Student extends Person{
	
	private String major="";
	
	public Student(String name, int bYear, String theMajor) {
		
		super(name, bYear);
		this.major=theMajor;
	}

	public String toString() {
		   
		return("Student[super=" +super.toString() + ",major=" + major +"]");   
	}
}
