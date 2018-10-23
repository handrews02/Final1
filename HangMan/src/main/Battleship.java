package main;

import java.util.Scanner;

public class Battleship 
{

	public static void battleship() 
	{
		displayStart();
		displayShipPlacement();
		displayShotGuesses(null, null, null);
		displayEndGame();
		
		
		
		
	}
	public static void displayStart()
	{
		int start = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to battleship! press 1 to start");
		start = input.nextInt();
	
	
		if(start == 1)
		{
	
	String A1 = "X";
	String A2 = "X";
	String A3 = "X";
	String A4 = "X";
	String A5 = "X";
	String B1 = "X";
	String B2 = "X";
	String B3 = "X";
	String B4 = "X";
	String B5 = "X";
	String C1 = "X";
	String C2 = "X";
	String C3 = "X";
	String C4 = "X";
	String C5 = "X";
	String D1 = "X";
	String D2 = "X";
	String D3 = "X";
	String D4 = "X";
	String D5 = "X";
	String E1 = "X";
	String E2 = "X";
	String E3 = "X";
	String E4 = "X";
	String E5 = "X";
		
			System.out.println("A| " + A1 + "  " + A2 + "  " + A3 + "  " + A4 + "  " + A5);
			System.out.println("B| " + B1 + "  " + B2 + "  " + B3 + "  " + B4 + "  " + B5);
			System.out.println("C| " + C1 + "  " + C2 + "  " + C3 + "  " + C4 + "  " + C5);
			System.out.println("D| " + D1 + "  " + D2 + "  " + D3 + "  " + D4 + "  " + D5);
			System.out.println("E| " + E1 + "  " + E2 + "  " + E3 + "  " + E4 + "  " + E5);
			System.out.println("  ______________");
			System.out.println("   1  2  3  4  5");
			
		}	
		else
		{
			System.out.print("That's not an option:  " );
			displayStart();
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
		
		displayShotGuesses(ship1, ship2, ship3);

	}
	public static void displayShotGuesses(String ship1, String ship2, String ship3)
	{
		
		Scanner input = new Scanner(System.in);
		String[] shot = {"1", "2", "3", "4", "5"};
		System.out.println("Player 2, you will get 5 shots to sink all 3 ships.");
		//Player 2 will now enter 5 coordinates to "hit" player 1's ships
		
		for(int x = 0; x< 5; x++) {
			System.out.println("Shot " + shot[x]);
			shot[x] = input.nextLine();
	      {
			if (shot[x] == ship1 || shot[x] == ship2 || shot[x] == ship3) {
				System.out.println("You have hit a ship!");
	    	}		
			else {
				System.out.println("You have MISSED!");
			}
			// sequential search through array of coordinates, if ship coordinate matches shot coordinate, 
			// SOP (hit message) and display board with hit ship
			// if coordinates don't match, SOP (miss message) and continue on to next shot attempt 
		}
	}
}
		
		
		
		
	public static void displayEndGame()
	{
		// if all ships are shot down, SOP (Congrats you win blah blah blah)
		// if all ships aren't shot down, give option for other player to give them 5 more shots
		// if they decline or all ships aren't shot after second set, SOP (you lose and stuff)
	}

}
