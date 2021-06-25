package com.revature.models;

import java.util.Scanner;

import com.revature.daos.MemberDao;

public class Menu {
	
	MemberDao md = new MemberDao();
	
	public void display() {
		
		boolean displayMenu = true;
		
		Scanner scan = new Scanner(System.in);
		
		//printing the welcome home screen
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("*                        *");				   						
		System.out.println("*  Welcome To Nicks Gym! *");
		System.out.println("*                        *");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		while(displayMenu) {
			
			//First display to tell the user to pick an option
			System.out.println("-----------------------");
			System.out.println("Please Choose an Option");
			System.out.println("-----------------------");
			
			
			//Options for the user to choose
			//If I have time, I want to add an apply method for people to apply for positions
			//Also, I want to have the member sign in when they get to the gym
			System.out.println("1. Greetings/Information about my gym!");
			System.out.println("2. Sign up as a new member");
			System.out.println("3. Cancel your membership");
			System.out.println("4. Check the cost of a membership");
			System.out.println("5. Exit the menu");
			
			//integer input since the menu options are numbered and the scan.nextLine() because i'm using an int and not a string.
			int input = scan.nextInt();
			scan.nextLine();
			
			//switch statement to go through the menu options and be able to sign up for or sign in to the gym.
			switch(input) {
			
			
			//Gives a quick detailed summary of the gym
			case 1: {
				System.out.println("Welcome to Nicks gym!");
				System.out.println("I created this gym in 2020 when the pandemic started.");
				System.out.println("This gym is for people who have sat inside for the last year and need a little pick me up!");
				System.out.println("We offer complimentary snacks and I've hired motivational speakers to yell at you when you seem defeated!");
				System.out.println("My goal is to make everyone feel better about the fact that the world is dying.");
				System.out.println("So don't get sick, come visit Nick! ");
				break;
			}
			
			//Sign up as a new member
			case 2:{
				System.out.println("Thank you for choosing to sign up at my gym!");
				System.out.println("Please follow the steps to get a successful sign up!");
				
				//user input for first and last name
				System.out.println("Please Enter your first name: ");
				String name = scan.nextLine();
				
				//user input for address
				System.out.println("Please Enter your address: ");
				int address = scan.nextInt();
				scan.nextLine().toUpperCase();
				
				//user input for the city 
				System.out.println("Please Enter the city you live in: ");
				String city = scan.nextLine().toUpperCase();
				
				//user input for state
				System.out.println("Please Enter the state you live in (Ex.Pennsylvania --> pa): ");
				String state = scan.nextLine().toUpperCase();
				
				
				System.out.println("Please Enter your 5 digit zip code: ");
				int zip = scan.nextInt();
				scan.nextLine();
				break;
			}
			
			//Cancel your membership
			case 3:{
				
				break;
			}
			
			//Check membership prices
			case 4:{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("*      Gym Memberships    *");
				System.out.println("*        (per month)      *");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Elite:    $39.99 --> includes Gold Membership + free protein shake every time you come!");
				System.out.println("Gold:     $29.99 --> includes Premium Membership + bring unlimited guests");
				System.out.println("Premium:  $19.99 --> includes Standard Membership + tanning and massages");
				System.out.println("Standard: $9.99  --> includes full gym access");
				break;
			}
			
			//Exit the program
			case 5: {
				System.out.println("Have a great day!");
				System.out.println("Please come back to visit soon :)");
				displayMenu = false;
				break;
				}
			
			//Default case to check if the user inputs something that doesn't exist
			default: {
				System.out.println("I'm sorry, that function doesn't exist, please try again!");
				break;
			}
			}	
		}
	}
}
