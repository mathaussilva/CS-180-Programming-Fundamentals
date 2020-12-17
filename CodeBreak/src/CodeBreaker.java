
public class CodeBreaker {

	public static void main(String[] args) {
		
		// Create string variable message
		String message = "Zyngrats! Xyu Wryke The Zyde!";
		
		// Print encoded message
		System.out.println("The encoded message is: " + message);
		
		// String operation replace
		message = message.replace('Z','C');
		message = message.replace('y','o');
		message = message.replace('X','Y');
		message = message.replace('W','B');
		
		// Print decoded message
		System.out.println("The decoded message is: " + message);
		
		// String operation substring
		String message1 = message.substring(0,8);
		String message2 = message.substring(10,29);
		message1 = message1.toUpperCase();
		
		// Print messages
		System.out.println("Message 1 is: " + message1);
		
		message2 = message2.toLowerCase();
		System.out.println("Message 2 is: " + message2);
				
	}

}
