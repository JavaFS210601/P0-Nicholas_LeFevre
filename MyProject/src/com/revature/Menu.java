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
				System.out.println("Welcome to Nicks gym!");
				System.out.println("I created this gym in 2020 when the pandemic started.");
				System.out.println("This gym is for people who have sat inside for the last year and need a little pick me up!");
				System.out.println("We offer complimentary snacks and I've hired motivational speakers to yell at you when you seem defeated!");
				System.out.println("My goal is to make everyone feel better about the fact that the world is dying.");
				System.out.println("So don't get sick, come visit Nick! ");
				break;
			}
			case 2:{
				
				break;
			}
			
			}
			
			
		}
	}



}
