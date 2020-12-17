import java.util.Scanner;

public class CarlsKennel {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Carls Kennel...");
		System.out.println("We board up to 10 puppies a day.");
		
		Puppy[] PupVisitors = new Puppy[3];
		
		for (int i=0; i < PupVisitors.length; i++) {
			System.out.println("Puppy Check-in...");
			System.out.print("Enter the pup's name: ");
			String PupName = input.next();
			System.out.print("Enter the pup's breed: ");
			String PupBreed = input.next();
			System.out.print("Enter the pup's age: ");
			int PupAge = input.nextInt();
			System.out.print("Enter the pup's weight: ");
			double PupWeight = input.nextDouble();
			PupVisitors[i] = new Puppy(PupName, PupBreed, PupAge, PupWeight);
			System.out.println("\n");
		}
			
			for (int i=0; i < PupVisitors.length; i++)
			{
				System.out.println(PupVisitors[i]);
			}
			
			System.out.print("\n");
			PupVisitors[2].setName("Rascal");
			PupVisitors[1].setAge(4);
			System.out.print("The updated name for the third puppy is: \n" + PupVisitors[2]);
			System.out.print("\n");
			System.out.print("The updated age for the second puppy is: \n" + PupVisitors[1]);
	}

}
