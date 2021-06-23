package com.revature;

import java.util.Scanner;

public class Menu {
	
	GymLogin gym = new GymLogin();
	
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
			//System.out.println("0. Apply for a position?"); If I have time I will add this feature.
			System.out.println("1. Greetings/Information about my gym!");
			System.out.println("2. Sign up as a new member");
			System.out.println("3. Sign in");
			System.out.println("4. Check the cost of a membership");
			System.out.println("5. Exit the menu");
			
			//integer input since the menu options are numbered and the scan.nextLine() because i'm using an int and not a string.
			int input = scan.nextInt();
			scan.nextLine();
			
			//switch statement to go through the menu options and be able to sign up for or sign in to the gym.
			switch(input) {
			
			case 1: {
				
				//Gives a quick detailed summary of the gym
				System.out.println("Welcome to Nicks gym!");
				System.out.println("I created this gym in 2020 when the pandemic started.");
				System.out.println("This gym is for people who have sat inside for the last year and need a little pick me up!");
				System.out.println("We offer complimentary snacks and I've hired motivational speakers to yell at you when you seem defeated!");
				System.out.println("My goal is to make everyone feel better about the fact that the world is dying.");
				System.out.println("So don't get sick, come visit Nick! ");
				break;
			}
			case 2:{
				System.out.println("Thank you for choosing to sign up at my gym!");
				System.out.println("Please follow the steps to get a successful sign up!");
				
				//user input for first and last name
				System.out.println("Please Enter your first and last name: ");
				String name = scan.nextLine().toUpperCase();
				
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
			case 3:{
				System.out.println("Please enter your username: ");
				break;
			}
			case 4:{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("      Gym Prices      ");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Daily:   $14.99");
				System.out.println("Monthly: $9.99");
				System.out.println("Yearly:  $89.99");
				break;
			}
			case 5: {
				System.out.println("Have a great day!");
				System.out.println("Please come back to visit soon :)");
				displayMenu = false;
			}
			
			}
			
			
		}
	}



}
