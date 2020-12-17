import java.util.Scanner;

public class SmartTVShopper {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Enter your full name: ");
		String name = input.next();
		
		String nextline = input.nextLine();
		
		System.out.print("Enter the make/model of the first 40\" TV along with the price: ");
		String model1 = input.next();
		Double price1 = input.nextDouble();
		
		System.out.print("Enter the make/model of the second 40\" TV along with the price: ");
		String model2 = input.next();
		Double price2 = input.nextDouble();
		
		System.out.print("Enter the make/model of the third 40\" TV along with the price: ");
		String model3 = input.next();
		Double price3 = input.nextDouble();
		
		double subtotal1, subtotal2, subtotal3;
			subtotal1 = price1 * 0.9;
			subtotal2 = price2 * 0.85;
			subtotal3 = price3 * 0.8;
		
		System.out.printf("The price of the " + model1 
				+ " with a 10%% coupon applied is: $%.2f \n", subtotal1);
		
		System.out.printf("The price of the " + model2 
				+ " with a 15%% coupon applied is: $%.2f \n", subtotal2);
		
		System.out.printf("The price of the " + model3 
				+ " with a 20%% coupon applied is: $%.2f \n", subtotal3);
		
		double total = (subtotal1 + subtotal2 + subtotal3);
		total = total + (total * 6.25 / 100);

		System.out.println("Good luck in choosing a TV!!");
	}

}
