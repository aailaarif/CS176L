import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class DonationsTester {
	
	public static void main(String[] args)throws FileNotFoundException {
		
		String donationType = null;
		String userAnswer = null;
		String convertedData = null;
		//constant variables to check donation type or sentinel 
		final String INDVDON ="individual donation";
		final String BUSINESSDON ="business donation";
		final String OTHERDON ="other donation";
		final String EOF="EOF";
		//create a donations object with no parameters
		Donations giveToMe = new Donations();
		//input txt file with File class
		File inputFile = new File("Donations.txt");
		Scanner inFile = new Scanner(inputFile);
		//prompt user if they would like to display statistics
		System.out.print("Would you like to process donations now? (enter 'Yes' to continue): ");
		Scanner in = new Scanner(System.in);
		userAnswer=in.next();
		//display statistics if userAnswer.equals("Yes")
		if (userAnswer.equals("Yes")) {
		//loop through while loop until there are no lines left in the txt file
			while(inFile.hasNextLine())
			{
				String line=inFile.nextLine();
				//remove "<" from line
				convertedData=line.replaceAll("<", "");
				//replace unnecessary digits/characters from line
				line= line.replaceAll("[^0-9,-]",  " ");
				line= line.replaceAll(" +", " ");
				convertedData.replaceAll(">", " ");
				//find donation type if the index is not -1, break from loop if sentinel is encountered
				if(convertedData.indexOf(INDVDON)!=-1)
				{
					donationType=INDVDON;
				}
				else if (convertedData.indexOf(BUSINESSDON)!=-1)
				{
					donationType=BUSINESSDON;
				}
				else if(convertedData.indexOf(OTHERDON)!=-1)
				{
					donationType=OTHERDON;
				}
				else if(convertedData.indexOf(EOF)!=-1)
					break;
				
				//parse through line to find the String representing a double, convert it to Double
				Double doubleLine=Double.parseDouble(line);
				//send in donation type and double to get processed
				giveToMe.processDonation(donationType, doubleLine);
			}
			//close scanners to prevent errors
			inFile.close();
			in.close();
			//display statistics
			giveToMe.getStatistics();
		}
		//print if user does not wish to process donations
		else {
			System.out.println("Ending now without processing donations.");
		}		
	}
}
