import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ButtonListener implements ActionListener
{
   private Measurable[] theObject;
   private String category;

   public ButtonListener(Measurable[] theObject,String category)
   {
      this.theObject = theObject;
      this.category = category;
   }

   public void actionPerformed(ActionEvent event)
   {
	  double result = 0;
	   //check if user wants to see maximum
	   if (category=="Maximum")
	   {
		   result = Data.max(theObject);
	   }
	   //check if user wants to see minimum
	   if (category=="Minimum")
	   {
		   result = Data.min(theObject);
	   }
	   //check if user wants to see average
	   if (category=="Average") 
	   {
		   result = Data.average(theObject);
	   }
	   
	   if (theObject[0].getClass().getName().equals("BankAccount")) 
	   {
		   System.out.println(category + " Account Balance is "+result);
	   }
	   if (theObject[0].getClass().getName().equals("Country")) 
	   {
		   System.out.println(category + " Country Area is "+result);
	   }
	   if (theObject[0].getClass().getName().equals("Quiz")) 
	   {
		   System.out.println(category + " Quiz Score is "+result);
	   }
      
   }
}