//ignore the package thing, it's just so that I can pull it up in eclipse without a problem.
package com.Troy_Test.Troy;

import java.util.*;

public class ChristmasGroupProject
{

	public static void main(String[] args)
	{
		//Main Variables
		int Totalbudget = 0;
		int budgetLeft = 0;
		//don't actually know what data type this should be
		//Time/Date class might make this an object, or an integer if it's days left for production
		String daysLeft = " ";

		//Creation of parallel arrays for the kids:
		String[] firstName = new String[Integer.MAX_VALUE];
		//could make this boolean if wanted
		String[] naughtyOrNice = new String[Integer.MAX_VALUE];
		//might have to parse Integer for the numeric values
		int[] age = new int[Integer.MAX_VALUE];

		//Creation of parallel arrays for the presents:
		String[] giftName = new String[Integer.MAX_VALUE];
		//could be set up to become an integer, would probably need to
		double[] giftPrice = new double[Integer.MAX_VALUE];
		//Could be set to an integer for simplicity: in days
		String[] giftTime = new String[Integer.MAX_VALUE];
	}

	//Begin main1
	public static void main1(String[] args)
	{
		//Declare variables
		int kids = 25, counter = 24;
		double budget = 240.00;
		String[] names = new String[kids];
		double[] giftPrice = new double[kids];
		int[] age = new int[kids];
		boolean[] naughty = new boolean[kids];
		double gift1 = 10.00, gift2 = 5.00, highestPrice = 0.00;
		boolean balanced = false, naughtiesCut = false;

		//Begin for 1
		for(int a = 0; a < 25; a++)
		{
			names[a] = ("Holder" + a);
			age[a] = 13 + (a % 6);
			naughty[a] = true;
			//WE WILL NEED TO ORGANIZE PRESENTS FROM HIGHEST TO LOWEST PRICES
			//In the actual program, this will need to be a for (or maybe a while) loop, that way there is not a massive list of if/else if/else if/...
			//Begin if/else 1
			if(budget >= gift1)
			{
				giftPrice[a] = gift1;
				budget = budget - gift1;
				balanced = true;
			}
			else
			{
				balanced = false;
				//Begin while 1
				while(!balanced)
				{
					//Begin if 1
					if(giftPrice[counter] > gift2 && (budget + (gift1 - gift2)) >= 0.00 && naughtiesCut)
					{
						giftPrice[a] = gift2;
						budget = budget + (gift1 - gift2);
						balanced = true;
					}
					//End if 1
					counter--;
				}
				//End while 1
				counter = 24;
			}
			//End if/else 1
		}
		//End for 1
		//Begin for 3
		for(int c = 0; c < 25; c++)
		{
			System.out.println(names[c] + "is " + age[c] + " years old and got a present worth " + giftPrice[c]);
		}
		//End for 3
		System.out.println(budget);
	}
	//End main1
}
