
public class MicrowaveTester {
	
	public static void main(String args[]) {
		//instantiate a new object of the Microwave class called myMicrowave
		Microwave myMicrowave = new Microwave();
		//call the method time to add 30 seconds to the time twice and output
		myMicrowave.time();
		myMicrowave.time();
		//call power method once to switch the power level and output
		myMicrowave.power();
		//call start method to output current time and power level
		myMicrowave.start();
		//reset time and power attributes to default with reset method call
		myMicrowave.reset();

	}

}

/* Output
Time button was pressed. Time is 30 seconds
Time button was pressed. Time is 60 seconds
Power button was pressed. Power level is 2
Cooking for 60 seconds at level 2.
Reset button was pressed. Power level is at 1. Time is 0 seconds.
*/