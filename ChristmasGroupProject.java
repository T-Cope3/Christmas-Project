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

		//Just used to test my code
		grabLine();

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

	public static String grabLine() throws FileNotFoundException
	{
		int i = 0;
		Scanner reader = new Scanner(new File("kids.txt"));
		//Delimiter with ','
		reader.useDelimiter(", ");
		//ArrayList
		ArrayList<String> firstName = new ArrayList<String>();
		ArrayList<String> niceORnot = new ArrayList<String>();
		ArrayList<String> kidAge = new ArrayList<String>();
		//loop
		while(i < 100)
		{
			firstName.add(reader.next());
			niceORnot.add(reader.next());
			kidAge.add(reader.next());
			i++;
		}
		//Print out to test
		for(String s: firstName)
			System.out.println(s);
		for(String s: niceORnot)
			System.out.println(s);
		//Close Scanner
		reader.close();

		return ",";
	}

}
