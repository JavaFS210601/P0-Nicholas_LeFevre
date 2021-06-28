package com.revature.models;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.MemberDao;

public class Menu {
	
	MemberDao md = new MemberDao();
	
	public void display() {
		
		boolean displayMenu = true;
		
		Scanner scan = new Scanner(System.in);
		
		final Logger log = LogManager.getLogger(Menu.class);
		
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
			System.out.println("2. Show all members");
			System.out.println("3. Sign up as a new member");
			System.out.println("4. Cancel your membership");
			System.out.println("5. Check the cost of a membership");
			System.out.println("6. Change membership");
			System.out.println("7. Exit the menu");
			
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
			
			//Show all members at the gym
			case 2:{
				log.info("User selected to get see all the members.");
				System.out.println("Getting all the swol people...");
				
				List<Member> members = md.getMembers();
				for(Member m : members) {
					System.out.println(m);
				}
				break;
			}
			
			//Sign up for a new gym membership
			case 3:{
				log.info("User selected to sign up as a new member.");
				System.out.println("Please enter your fisrt name: ");
				String f_name = scan.nextLine();
				
				System.out.println("Please enter your last name: ");
				String l_name = scan.nextLine();
				
				System.out.println("Please enter your address: ");
				String address = scan.nextLine();
				
				System.out.println("Please enter the city: ");
				String city = scan.nextLine();
				
				System.out.println("Please enter the state (Ex. Pennsylvania --> pa): ");
				String state = scan.nextLine().toUpperCase();
				
				System.out.println("Please enter your zip code: ");
				String zip = scan.nextLine();
				
				System.out.println("Please enter your phone number (Ex. 888-888-8888 --> 8888888888: ");
				String phone_number = scan.nextLine();
				
				System.out.println("Membership tier 1)Elite 2)Gold 3)Premium 4)Standard: ");
				int membership_id = scan.nextInt();
				scan.nextLine();
				
				Member newMember = new Member(f_name, l_name, address, city, state, zip, phone_number, membership_id);
				
				md.addMember(newMember);
				break;
			}
			
			//Cancel your membership
			case 4:{
				log.info("User selected to cancel their membership...nerds");
				System.out.println("The members currently at my gym are... ");
				
				List<Member> members = md.getMembers();
				
				for(Member m : members) {
					System.out.println(m);
				}
				
				System.out.println("Enter your member id to cancel your membership: ");
				
				int membership_input = scan.nextInt();
				scan.nextLine();
				
				md.cancelMember(membership_input);
				break;
			}
			
			//Show gym membership tiers and pries
			case 5: {
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
			
			//Change your membership tier
			case 6: {
				System.out.println("The members currently at the gym...");
				
				List<Member> members = md.getMembers();
				
				for(Member e : members) {
					System.out.println(e);
				}
				
				System.out.println("Enter your Id for changing your role: ");
				int member_id = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Enter your new membership tier 1)Elite 2)Gold 3)Premium 4)Standard: ");
				int membership_id = scan.nextInt();
				scan.nextLine();
				
				md.changeMembership(member_id, membership_id);
				
				break;
			}
			
			//Exit the program
			case 7: {
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
