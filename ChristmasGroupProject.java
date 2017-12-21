//ignore the package thing, it's just so that I can pull it up in eclipse without a problem.
//package com.Troy_Test.Troy;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;

public class ChristmasGroupProject
{

	public static void main(String[] args) throws FileNotFoundException
	{
		//grabGifts();
		grabKids();

		//Main Variables
		Integer Totalbudget = 0;
		Integer budgetLeft = 0;
		String[] t;
		//don't actually know what data type this should be
		//Time/Date class might make this an object, or an integer if it's days left for production
		String daysLeft = " ";

		//Creation of parallel arrays for the kids:
	//	String[] firstName = new String[Integer.MAX_VALUE];
		//could make this boolean if wanted
	//	String[] naughtyOrNice = new String[Integer.MAX_VALUE];
		//might have to parse Integer for the numeric values
	//	Integer[] age = new Integer[Integer.MAX_VALUE];

		//Creation of parallel arrays for the presents:
	//	String[] giftName = new String[Integer.MAX_VALUE];
		//could be set up to become an integer, would probably need to
	//	Double[] giftPrice = new Double[Integer.MAX_VALUE];
		//Could be set to an integer for simplicity: in days
	//	String[] giftTime = new String[Integer.MAX_VALUE];
	}

	public static String[] grabKids() throws FileNotFoundException
		{
			//Variballs
			int i = 0;
			int counter = 0;
			String line;
			String[] t;
			String[] massData = new String[1000];
			//Scanner
			Scanner reader = new Scanner(new File("kids.txt"));

			while(reader.hasNext())
			{
				//Grab the line
				line = reader.next();
				//Split each word with ','
				t = line.split(",");
				//Print out
				for (String str: t)
				{
					massData[counter] = str;
					System.out.println(massData[counter]);
					counter++;
				}
			}
			return massData;
		}//End of grabKids
	public static String[] grabGifts() throws FileNotFoundException
		{
			//Variballs
			int counter = 0;
			String line;
			String[] t = new String[10000];
			String[] massData = new String[1000];
			//Scanner
			Scanner reader = new Scanner(new File("gifts.txt"));

			while(reader.hasNext())
			{
				//Grab the line
				line = reader.next();
				//Print out
				for (String str: t)
				{
					massData[counter] = str;
					System.out.println(massData[counter]);
					counter++;
				}
			}
			return massData;
		}//End of grabGifts
}//End of Christ
