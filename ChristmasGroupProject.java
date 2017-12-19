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

	//Begin finalLogic
	//Do not try to run this right now, it will absolutely not work. Don't worry, I just need to line up all the variables.
	public static void finalLogic()
	{
		//Declare variables
		//There is an int variable called counter. It will need to be set to the number of kids - 1. You want a full explanation? Just ask.
		double[] giftPrice = new double[kids];
		boolean balanced = false;

		//Begin for 1
		for(int a = 0; a < 25; a++)
		{
			//In the actual program, this will need to be a for (or maybe a while) loop, that way there is not a massive list of if/else if/else if/...
			//Begin if/else 1
			if(budget >= gift1 && (naughty[a] == false || age[a] < 15))
			{
				giftPrice[a] = gift1;
				budget = budget - gift1;
				balanced = true;
			}
			else
			{
				//Begin while 1
				while(!balanced)
				{
					//Begin if 5
					if(giftPrice[counter] > gift2 && (budget + (gift1 - gift2)) >= 0.00 && (naughty[a] == false || age[a] < 15))
					{
						giftPrice[a] = gift2;
						budget = budget + (gift1 - gift2);
						balanced = true;
					}
					//End if 5
					counter--;
				}
				//End while 1
				counter = 24; //THIS WILL NEED TO BE ALTERED
			}
			//End if/else 1
		}
		//End for 1
	}
	//End mafinalLogic
}
