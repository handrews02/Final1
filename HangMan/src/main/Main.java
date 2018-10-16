

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// Asks user which game they want to play
		Scanner sc = new Scanner(System.in);
		int gameChoice = 0;
		System.out.print("Welcome! Enter 1 to play Hangman, Enter 2 to play Battleship");
		gameChoice = sc.nextInt();
		
		// Sends user to the game they picked  
		if(gameChoice == 1)
		{
			Hangman.hangman();
		}
		else if(gameChoice == 2) 
		{
			Battleship.battleship();
		}
		else
		{
			System.out.println("That's not a choice");
		}
	}

}

