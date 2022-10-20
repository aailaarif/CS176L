public class Donations {

	private int numIndividual;
	private int numBusiness;
	private int numOther;
	private double amtIndividual;
	private double amtBusiness;
	private double amtOther;
	//initialize all variables
	public Donations() {
		
		numIndividual=0;
		numBusiness=0;
		numOther=0;
		amtIndividual=0;
		amtBusiness=0;
		amtOther=0;
	}
	public void processDonation(String cat, double donation) {
	//check category of donation and amount: increment category and add amount to total donation of category	
		if(cat.equals("individual donation")) {
			if(donation>0) {
				numIndividual+=1;
				amtIndividual=amtIndividual+donation;
			}
	//if negative, decrement num of category and decrease amount from total donation of category
			else {
				numIndividual-=1;
				amtIndividual=amtIndividual+donation;
			}
		}
		else if(cat.equals("business donation"))
		{
			if(donation>0) {
				numBusiness+=1;
				amtBusiness=amtBusiness +donation;
			}
			else {
				numBusiness-=1;
				amtBusiness=amtBusiness+donation;
			}
		}
		else
		{
			if(donation>0) {
				numOther+=1;
				amtOther=amtOther+donation;
			}
			else {
				numOther-=1;
				amtOther=amtOther+donation;
			}
		}
	}
	
	public void getStatistics() {
		//output statistics based on output from requirements
		System.out.println("Individual: #:" + numIndividual + " $" + amtIndividual);
		System.out.println("Business: #:" + numBusiness + " $" + amtBusiness);
		System.out.println("Other: #:" + numOther + " $" + amtOther);

	}

}
