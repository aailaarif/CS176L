import java.util.Scanner;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MeasurableViewer
{

   public static void main(String[] args)
   {
	   //create a scanner object and prompt the user for which metric they would like to use
	   Scanner in =new Scanner(System.in);
	   System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
	   int categoryNum = in.nextInt();
	   
	   String chosenCategory="";
	   //create bankAccount array
	   Measurable[] bankAccount= new Measurable[3];
	   bankAccount[0] =new BankAccount(176220);
	   bankAccount[1] =new BankAccount(513120);
	   bankAccount[2] =new BankAccount(30510);
	   //create country array
	   Measurable[] country = new Measurable[3];
	   country[0] =new Country("Uruguay", 176220);
	   country[1] =new Country("Thailand", 513120);
	   country[2] =new Country("Belgium", 30510);	   
	   //create quizzes array    
	   Measurable[] quizzes = new Measurable[5];
	   quizzes[0] =new Quiz(95);
	   quizzes[1] =new Quiz(80);
	   quizzes[2] =new Quiz(90);
	   quizzes[3] =new Quiz(50);
	   quizzes[4] =new Quiz(75);
	   //set chosen category to number input by user 
	   if (categoryNum == 1) 
		   chosenCategory = "Maximum";
	   if (categoryNum == 2) 
		   chosenCategory = "Minimum";
	   if (categoryNum == 3) 
		   chosenCategory = "Average";
	  //frame and panel for buttons
	  JPanel panel =new JPanel();
	  JFrame frame =new JFrame();
      frame.add(panel);
      //bankAccount button and listener
      JButton button1 =new JButton("Get " + chosenCategory + " Balance");
      panel.add(button1);
      ActionListener listener =new ButtonListener(bankAccount, chosenCategory);
      button1.addActionListener(listener);
      //country button and listener
      JButton button2 =new JButton("Get " + chosenCategory + " Area");
      panel.add(button2);
      ActionListener listener2 =new ButtonListener(country, chosenCategory);
      button2.addActionListener(listener2);
      //quiz button and listener     
      JButton button3 =new JButton("Get " + chosenCategory + " Score");
      panel.add(button3);
      ActionListener listener3 =new ButtonListener(quizzes, chosenCategory);
      button3.addActionListener(listener3);
      //create visibility and size of frame
      frame.setSize(250, 250);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
   }
}
