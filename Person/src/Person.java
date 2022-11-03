
public class Person {
	
	private int birthYear=0;
	private String name="";
	
	public Person(String theName, int bYear) {
		
		this.name=theName;
		this.birthYear=bYear;
		
	}
	
	public String toString() {
		   
		return("Person[name=" + name + ",birthYear=" + birthYear +"]");   
	}

}
