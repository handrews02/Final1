package main;
import java.util.Scanner;

public class Hangman {

	private static String[] words = {"courageous", "magnificent", "terrible", "righteous", "superficial" };
	private static String word = words[(int) (Math.random() * words.length)];
	//chooses a random word from the array above
	private static String replace = new String(new char[word.length()]).replace("\0", "*");
	//replaces every letter in the random word that is selected and replaces it with an asterisk
	private static int attempts = 0;

	public static void hangman() {
		Scanner input = new Scanner(System.in);

		while (attempts < 7 && replace.contains("*")) {
		//as long as the attempt number is less than 7 and there are still asterisks left, the user still can guess
			System.out.println("Welcome to Hangman!");
			System.out.println("Guess any letter in the word");
			System.out.println(replace);
			String guess = input.next();
		//the user will input a letter
			hang(guess);
		}
		input.close();
	}

	public static void hang(String guess) {
		String newreplace = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newreplace += guess.charAt(0);
			} else if (replace.charAt(i) != '*') {
				newreplace += word.charAt(i);
			} else {
				newreplace += "*";
			}
		}

		if (replace.equals(newreplace)) {
			attempts++;
			hangmanImage();
		//wrong letter entered =attempts goes up 1 and the hangman image will appear. Depending on the attempt number chooses the version of the hangman image that will appear
		} else {
			replace = newreplace;
		}
		if (replace.equals(word)) {
			System.out.println("Great job! You win! The word was " + word);
		}
	}

	public static void hangmanImage() {
		//when user enters the wrong attempt,the hangman image will appear
		if (attempts == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (attempts == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (attempts == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (attempts == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (attempts == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (attempts == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (attempts == 7) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! The word was " + word);
		}
	}
}
