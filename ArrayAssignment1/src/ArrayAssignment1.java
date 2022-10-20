
public class ArrayAssignment1 {

	public static void main(String[] args) {
		
		//initialize the array of type double with values from the requirements
		double[] values= {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		
		double largestElement=values[0];
		int amtOfNegatives=0;
		
		for(double element : values) {
		//displays each element of the array with a space in between
			System.out.print(element + " ");
		//calculates the largest element in the array and stores it as largestElement
			if (element > largestElement) {
				largestElement = element;
			}
		//calculates the amount of negatives and stores it as amtOfNegatives	
			if (element < 0) {
				amtOfNegatives++;
			}
		}
			
		//prints largest element as well as amount of negatives
		System.out.println();
		System.out.println("The largest element in the array is " + largestElement);
		System.out.println("There are " + amtOfNegatives + " negative numbers in the array");
	}
}
