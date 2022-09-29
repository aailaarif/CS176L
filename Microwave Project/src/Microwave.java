
public class Microwave {
	
	//instantiate instance variables with default values
	private int power = 1;
	private int time = 0;
	//output time and power level the Microwave object is cooking for
	public void start () {
		
		System.out.println("Cooking for " + time + " seconds at level " + power + ".");
	}
	//setter method to add 30 seconds to current time and output
	public void time () {
		
		time = time + 30;
		System.out.println("Time button was pressed. Time is " + time + " seconds");
	}
	//switch between power levels 1 and 2 unless power is equal to 0 and output
	public void power () {
		
		if(power==1) {
			power++;
			System.out.println("Power button was pressed. Power level is " + power);
		}
		else {
			power=1;
			System.out.println("Power button was pressed. Power level is " + power);
		}

	}
	//reset power and time attributes to default and output
	public void reset () {
		
		power = 1;
		time = 0;
		System.out.println("Reset button was pressed. Power level is at " + power + ". Time is " + time + " seconds.");
	}

}
