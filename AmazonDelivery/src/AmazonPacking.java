import java.util.Scanner;

public class AmazonPacking {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Amazon's Truck Packing program...");
		System.out.println("We have 3 types of trucks used for package delivery: PickupTruck (6x6x12), BoxTruck (12x6x6), and TrailerTruck (18x6x6)");
		
		Cube PickupTruck = new Cube(6.0, 6.0, 12.0);
		Cube BoxTruck = new Cube(12.0, 6.0, 6.0);
		Cube TrailerTruck = new Cube(18.0, 6.0, 6.0);
		
		System.out.println("Here is a lot of our Trucks that are ready to deliver:");
		
		String PickupString = PickupTruck.toString();
		String BoxString = BoxTruck.toString();
		String TrailerString = TrailerTruck.toString();
		
		System.out.println("We have 3 types of boxes that are delivered in these trucks: smallBox 1x1x1, mediumBox 1x1x2, and largeBox 1x1x3");
		
		Cube smallBox = new Cube(1.0, 1.0, 1.0);
		Cube mediumBox = new Cube(1.0, 1.0, 2.0);
		Cube largeBox = new Cube(1.0, 1.0, 3.0);
		
		double smallBoxVolume = smallBox.calculateVolume();
		double mediumBoxVolume = mediumBox.calculateVolume(); 
		double largeBoxVolume = largeBox.calculateVolume();
		
		System.out.print("Enter the number of small boxes for this delivery (1-100): ");
		int numberOfSmallBoxes = input.nextInt();
		
		System.out.print("Enter the number of medium boxes for this delivery (1-100): ");
		int numberOfMediumBoxes = input.nextInt();
		
		System.out.print("Enter the number of large boxes for this delivery (1-100): ");
		int numberOfLargeBoxes = input.nextInt();
		
		double PickupTruckVolume = PickupTruck.calculateVolume();
		double BoxTruckVolume = BoxTruck.calculateVolume();
		double TrailerTruckVolume = TrailerTruck.calculateVolume();
		
		double totalVolume = (numberOfSmallBoxes * smallBoxVolume) +
				(numberOfMediumBoxes * mediumBoxVolume) + 
				(numberOfLargeBoxes * largeBoxVolume);
		
		String answer = null;
		
		if (totalVolume <= PickupTruckVolume)
		{
			answer = "Pickup";
		}
		else if (totalVolume <= BoxTruckVolume)
		{
			answer = "Box";
		}
		else
		{
			answer = "Trailer";
		}
		
		System.out.print("The " + answer + " Truck is the smallest truck that can be used for this delivery,");

	}

}
