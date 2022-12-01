import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {
	  boolean stopLoop=false;
	  do {
		  
		  try 
		  {
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Please enter the path to open the input file: ");
			  String answer= sc.nextLine();
			  File inputFile = new File(answer);
			  PrintWriter outputFile = new PrintWriter("C:\\Users\\Aaima\\Downloads\\New folder\\output.txt");
			  Scanner in = new Scanner(inputFile);
			  while (in.hasNext()) 
			  {
				  String what =in.next();
				  outputFile.println(what);
			  }
			  in.close();
			  outputFile.close();
			  stopLoop=true;
		  }
	  
		  catch(Exception FileNotFoundException)
		  {
			  System.out.println("File is not found, please try again.");
		  }
	  } while (stopLoop!=true);
   }
}

//C:\Users\Aaima\Downloads\New folder\lines.txt

/* Output
1
5000
2
300
3
4500
4
10000
5
3500
6
5652
7
12000
8
3498
9
34897
10
3451
*/
