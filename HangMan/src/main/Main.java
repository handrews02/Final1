package main;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int  randomNum = rand.nextInt(5) + 1;
		String word = null;
		
		
		if(randomNum == 1)
		{
			word = "courageous";
		}
			else if(randomNum == 2)
			{
				word = "magnificent";
			}
				else if(randomNum == 3)
				{	
					word = "terrible";
				}
					else if(randomNum == 4)
					{
						word = "righteous";
					}
						else if(randomNum == 5)
						{
							word = "superficial";
						}
							
		
		System.out.println(randomNum);
		System.out.print(word);
		
		
		
		
	}
	
	
}
