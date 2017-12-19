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

	public static void grabKids() throws FileNotFoundException
	{
		//Variballs
		int i = 0;
		String line;
		String[] t;
		//Scanner
		Scanner reader = new Scanner(new File("kids.txt"));
		//Delimiter with ','
		reader.useDelimiter(", ");
		//loop
		while(reader.hasNext() && i < 99)
		{
			//Grab the line
			line = reader.next();
			//Split each word with ','
			t = line.split(",");
			//Print out
			for (String str: t)
			{
				System.out.println(str);
			}
			i++;//Loop
		}
	}//End of grabKids
}//End of ChristmasGroupProject
