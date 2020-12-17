
// Name:  Mathaus Silva
// Project 4

public class RectangleDemo1 {

	public static void main(String[] args) {
		System.out.println("This program will use the Rectangle class to create 3 rectangle objects that represent rooms in a house");
		System.out.println("It will use the methods of the Rectangle class to set the measurements for the rooms and get the square footage.");
		
		// ------------------------------------- Bedroom 1 ----------------------------------------------
		//create a Rectangle object named bedroom1
		
		Rectangle bedroom1 = new Rectangle();
		
		//set the length of bedroom1 to 10
		
		bedroom1.setLength(10);
		
		//set the width of bedroom1 to 10
		
		bedroom1.setWidth(10); 
		
		//calculate the area of bedroom1 and save it in a variable named bedroom1SquareFeet
		
		double bedroom1SquareFeet = bedroom1.calculateArea();
		
		//print a message "Bedroom 1 is (##.##) square feet"
		
		System.out.printf("Bedroom 1 is %.2f square feet \n", bedroom1SquareFeet);
		
		// ------------------------------------- Bedroom 2 ----------------------------------------------
		//create a Rectangle object named bedroom2
		
		Rectangle bedroom2 = new Rectangle();
		
		//set the length of bedroom2 to 12
		
		bedroom2.setLength(12);
		
		//set the width of bedroom2 to 12
		
		bedroom2.setWidth(12);
		
		//calculate the area of bedroom2 and save it in a variable named bedroom2SquareFeet

		double bedroom2SquareFeet = bedroom2.calculateArea();
		
		//print a message "Bedroom 2 is (##.##) square feet"
		
		System.out.printf("Bedroom 2 is %.2f square feet \n", bedroom2SquareFeet);
		
		// ------------------------------------- Kitchen ----------------------------------------------
		//create a Rectangle object named kitchen
		
		Rectangle kitchen = new Rectangle();
		
		//set the length of kitchen to 15
		
		kitchen.setLength(15);
		
		//set the width of kitchen to 20
		
		kitchen.setWidth(20);
		
		//calculate the area of kitchen and save it in a variable named kitchenSquareFeet
		
		double kitchenSquareFeet = kitchen.calculateArea();
		
		//print a message "Kitchen is (##.##) square feet"
		
		System.out.printf("Kitchen is %.2f square feet", kitchenSquareFeet);
	}
}