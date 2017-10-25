import java.lang.Math;
import java.util.Scanner;

public class grandcircusroomdetail {
	 public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);  //Creating scanner
		//Declaring and assigning values to all of my variables.
		 double length = 0;
		 double width = 0;
		 double perimeter = 0;
		 double area = 0;
		 double volume = 0;
		 double height = 0;
		 String cont = "Y";
		 
		 //This loop will execute while cont equals Yes.  This also takes input from the user.  
		 //This also verifies if the input is a double.  
		 while (cont.equalsIgnoreCase("Y")) {
			 System.out.println("Enter Length: ");
			 while (!scnr.hasNextDouble()) {
				 scnr.next();
				 System.out.println("Invalid Entry.  Please re-enter length: ");
			 }
			 
			 length = scnr.nextDouble();
			
			 System.out.println("Enter Width:  ");
			 while (!scnr.hasNextDouble()) {
				 scnr.next();
				 System.out.println("Invalid Entry.  Please re-enter width:  ");
			 }
			 width = scnr.nextDouble();
			 
			 System.out.println("Enter Height:  ");
			 while (!scnr.hasNextDouble()) {
				 scnr.next();
				 System.out.println("Invalid Entry.  Please re-enter height: ");
			 }
			 height = scnr.nextDouble();
			 scnr.nextLine(); 
			 
			 //Calculations for the perimeter, area and volume of the rooms.
			 perimeter = 2 * (length + width);
			 area = (length * width);
			 volume = (length * height * width);
			 
			 /*Outputs all of the results to the console.
			  * Also asks user if they would like to continue with another calculation. 
			  */
			 System.out.println("Area: " + area);
			 System.out.println("Perimeter: " + perimeter);
			 System.out.println("Volume: " + volume);
			 System.out.println("Would you like to continue? (Y/N)");
			 cont = scnr.nextLine(); 		//input for cont
	}
		System.out.println("Goodbye!"); 
		scnr.close(); //closing the scanner
	 }
	 
}
