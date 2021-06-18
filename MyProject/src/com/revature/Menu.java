package com.revature;

import java.util.Scanner;

public class Menu {
	
	GymLogin gym = new GymLogin();
	
	public void display() {
		
		boolean displayMenu = true;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("*                        *");				   						
		System.out.println("*  Welcome To Nicks Gym! *");
		System.out.println("*                        *");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		while(displayMenu) {
			
			System.out.println("-----------------------");
			System.out.println("Please Choose an Option");
			System.out.println("-----------------------");
			
		}
	}



}
