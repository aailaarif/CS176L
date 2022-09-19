import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner sc= new Scanner(System.in);
		//Declare all variables to collect
		double costPerSqFoot, houseLength, houseWidth, houseHeight, numOfWindows, windowLength, windowWidth, numOfDoors, doorLength, doorWidth;
		//Declare variables for calculations
		double sqFeetOfDoors, sqFeetOfWindows, sqFeetNoPeaks, sqFeetPeaks;
		double sqFeetToPaint, costToPaint;
		//Get all inputs from user
		System.out.println("Please enter the cost per square foot: ");
		costPerSqFoot= sc.nextDouble();
		
		System.out.println("Please enter the length of the house in feet: ");
		houseLength=sc.nextDouble();
		
		System.out.println("Please enter the width of the house in feet: ");
		houseWidth=sc.nextDouble();
		
		System.out.println("Please enter the height of the house in feet: ");
		houseHeight=sc.nextDouble();
		
		System.out.println("Please enter the number of windows: ");
		numOfWindows=sc.nextDouble();
		
		System.out.println("Please enter the length of a window: ");
		windowLength=sc.nextDouble();
		
		System.out.println("Please enter the width of a window: ");
		windowWidth=sc.nextDouble();
		
		System.out.println("Please enter the number of doors: ");
		numOfDoors=sc.nextDouble();
		
		System.out.println("Please enter the length of a door: ");
		doorLength=sc.nextDouble();
		
		System.out.println("Please enter the width of a door: ");
		doorWidth=sc.nextDouble();
		
		//Calculations
		//Square feet to subtract
		sqFeetOfWindows=numOfWindows*windowLength*windowWidth;
		sqFeetOfDoors=numOfDoors*doorLength*doorWidth;
		
		//Square feet to add
		sqFeetNoPeaks= houseLength*houseWidth*2;
		sqFeetPeaks=((houseLength*houseWidth)+(0.5*(houseLength*(houseHeight-houseWidth))))*2;
		
		//Final calculations
		sqFeetToPaint=sqFeetNoPeaks+sqFeetPeaks-sqFeetOfWindows-sqFeetOfDoors;
		costToPaint=costPerSqFoot*sqFeetToPaint;
		
		//Output amount of square feet to paint as well as cost
		String output1= String.format("Your total paintable surface area is %.0f square feet.",sqFeetToPaint);
		System.out.println(output1);
		String output2= String.format("Your estimate is %.0f dollars." , costToPaint);
		System.out.println(output2);

	}

}
