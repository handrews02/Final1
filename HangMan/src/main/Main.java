package main;

import java.util.Scanner;
import java.util.Random;


public class Main {
	private static String[] words = {"courageous", "magnificent", "terrible", "righteous", "superficial" };
	private static String word = words[(int) (Math.random() * words.length)];
	private static String replace = new String(new char[word.length()]).replace("\0", "*");
	private static int attempts = 0;

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (attempts < 7 && replace.contains("*")) {
			System.out.println("Guess a letter in the word>> ");
			System.out.println(replace);
			String guess = input.next();
			game(guess);}
		
		
}
public static void game(String guess) {
	String newReplace = "";
	for (int i = 0; i < word.length(); i++) {
			if(guess == word) {
				newReplace += guess;
			}
		
		
		}
	
	}
}
