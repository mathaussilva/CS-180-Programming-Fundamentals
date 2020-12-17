// Mathaus Silva - Project 3

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Authenticator {

	public static void main(String[] args) {
		
		// Scanner for login.txt 
		Scanner fileIn = null;
		try
		{
			fileIn = new Scanner(
					new FileInputStream("login.txt"));
					
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
			
		}
		
		// Assigning variables from login.txt
		String username1 = fileIn.next();
		String password1 = fileIn.next();
		fileIn.nextLine();
		
		String username2 = fileIn.next();
		String password2 = fileIn.next();
		fileIn.nextLine();
		
		String username3 = fileIn.next();
		String password3 = fileIn.next();
		fileIn.nextLine();
		
		
		Scanner keyboard = new Scanner(System.in);
		
		// User input
		System.out.println("Please enter your username and password seperated by a space: ");
		String username = keyboard.next();
		String password = keyboard.next();
		
		// Algorithm that checks keyboard input validity
		if (username.equals(username1) || username.equals(username2) || username.equals(username3))
	      {
	         if (password.equals(password1) || password.equals(password2) || password.equals(password3))
	         {
	        	 System.out.println("You have successfully logged in... Welcome!!");
	         }
	      }
	      else
	      {
	         System.out.println("Sorry, incorrect login information. Access denied.");
	      }
	}

}
