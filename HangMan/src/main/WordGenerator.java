package main;

import java.util.Random;

public class WordGenerator {

	private static String[] arrayWordGenerator =  {"courageous","magnificent","terrible","righteous","superficial"};
	
	
	public static String displayWords() {
		String word = null;
		Random rand = new Random();
		int  randomNum = rand.nextInt(5) + 1;
		if(randomNum == 1)
		{
			word = arrayWordGenerator[0];
		}
		else if(randomNum == 2)
		{
			word = arrayWordGenerator[1];
		}
		else if(randomNum == 3)
		{
			word = arrayWordGenerator[2];
		}
		else if(randomNum == 4)
		{
			word = arrayWordGenerator[3];
		}
		else if(randomNum == 5)
		{
			word = arrayWordGenerator[4];
		}
		
		
		return word;
	
	}
}
