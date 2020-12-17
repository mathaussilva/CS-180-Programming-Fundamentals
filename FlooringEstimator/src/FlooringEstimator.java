import java.util.Scanner;

public class FlooringEstimator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Frank's Flooring Company!!");
		System.out.println("We have the best prices for hardwood flooring and carpeting");
		System.out.println("Let's get an estimate of how much it would cost to renovate your home with new hardwood flooring or carpeting...\n");
		
		System.out.println("1. Oak Hard Wood         $15 per sq ft");
		System.out.println("2. Maple Hard Wood       $12 per sq ft");
		System.out.println("3. Plush Carpeting       $8 per sq ft");
		System.out.println("4. Berbers Carpeting     $6 per sq ft\n");
		
		System.out.print("Enter what type of flooring you wish to install: ");
		String typeOfFlooring = input.next();
		
		int cost = 0;
		
		if (typeOfFlooring.equalsIgnoreCase("Oak"))
		{
			cost = 15;
		}
		else if (typeOfFlooring.equalsIgnoreCase("Maple"))
		{
			cost = 12;
		}
		else if (typeOfFlooring.equalsIgnoreCase("Plush"))
		{
			cost = 8;
		}
		else if (typeOfFlooring.equalsIgnoreCase("Berbers"))
		{
			cost = 6;
		}
		else
	    {
			System.out.println("Flooring type is currently unavailable.");
            System.exit(0);
	    }
		
		System.out.print("Enter the number of rooms you wish to renovate: ");
		int numberOfRooms = input.nextInt();
		System.out.println("\n");
		
		Rectangle[] rooms = new Rectangle[numberOfRooms];
		
		for (int i = 0; i < rooms.length; i++) {
			
			System.out.println("Room #" + (i+1) + ":");
			
			System.out.print("Enter the length of the room: ");
			double length = input.nextDouble();
			
			System.out.print("Enter the width of the room: ");
			double width = input.nextDouble();
			
			rooms[i] = new Rectangle(length, width);
			System.out.println("\n");

		}
		
		double sum = 0;
		
		for (int i = 0; i < rooms.length; i++)
		{
			System.out.printf("The cost to renovate room " + (i+1) + " is: $");
			System.out.println(rooms[i].calculateArea() * cost);
			
			sum = sum +(rooms[i].calculateArea() * cost);
		}

		double totalTax = sum * 1.0625;
		
		System.out.printf("The cost to renovate " + numberOfRooms + 
				" rooms with " + typeOfFlooring + 
				" flooring type is: $" + totalTax);
		


	}
	
}
