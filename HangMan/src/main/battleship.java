package main;

import java.util.Scanner;

public class battleship 
{

	public static void main(String[] args) 
	{
		displayStart();
		displayShipPlacement();
		
		
		
		
	}
	public static void displayStart()
	{
		int start = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to battleship! press 1 to start");
		start = input.nextInt();
	
	
		if(start == 1)
		{
	
		
			System.out.println("A| X  X  X  X  X");
			System.out.println("B| X  X  X  X  X");
			System.out.println("C| X  X  X  X  X");
			System.out.println("D| X  X  X  X  X");
			System.out.println("E| X  X  X  X  X");
			System.out.println("  ______________");
			System.out.println("   1  2  3  4  5");
			
		}	
		else
		{
			System.out.print("quit");
		}
		
	}
	
	public static void displayShipPlacement()
	{
		Scanner input = new Scanner(System.in);
		String ship1 = null;
		String ship2 = null;
		String ship3 = null;
		System.out.println("Player 1, choose coordinates for 3 ships. Please use capital letters and no spaces. "
				+ "Example: A3");
		System.out.println("Ship 1: ");
		ship1 = input.nextLine();
		System.out.println("Ship 2: ");
		ship2 = input.nextLine();
		System.out.println("Ship 3: ");
		ship3 = input.nextLine();
		System.out.println(ship1 + ship2 + ship3);
	}

}
