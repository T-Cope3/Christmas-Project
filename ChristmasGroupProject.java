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
		Boolean[] naughtyOrNice = new Boolean[Integer.MAX_VALUE];
		//might have to parse Integer for the numeric values
		int[] age = new int[Integer.MAX_VALUE];

		//Creation of parallel arrays for the presents:
		String[] giftName = new String[Integer.MAX_VALUE];
		//could be set up to become an integer, would probably need to
		double[] giftPrice = new double[Integer.MAX_VALUE];
		//Could be set to an integer for simplicity: in days
		String[] giftTime = new String[Integer.MAX_VALUE];
		//Created for the elves to make the presents
		int[] daysToMake = new int[Integer.MAX_VALUE];
	}

<<<<<<< HEAD
	/* -TC-
	Short Desc: Grabs all the data from the 'kids' file and seporates it by the comma into seporate arrays.
	Parameters: f; The name of the child, n; whether the kid is naughty or nice [nice = true], a; age of the child.
	NOTE TO SELF: passed by reference because arrays are objects!
	*/
	//TRANSFER FROM ARRAYS TO ARRAY LISTS, can use the .split methods
	public static void assignKids(String[] f, Boolean[] n, int[] a)
	{
		//Would need while loops to check it, and would need a variable for counting to create the count to keep the loop in check
		//Basically what'll happen is it will split itself in half, or it will split by character and set into an array
		String[] s = new String[80];
		s = f[1].split(f[1]);
		//make sure it cuts out commas and make sure that there are no extra spaces! TESTING NEEDED!!!
		f[1].split(f[1], '_');
	}

	/* -TC-
	Short Desc: Grabs all the data from the 'kids' file and seporates it by the comma into seporate arrays.
	Parameters: n; name of the gift, p; the price of the gift, t; how long the gift takes to make, l; the age requirement of the present.
	*/
	public static void assignGifts(String[] n, double[] p, String[] t, int[] l)
	{

	}
}
=======
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
>>>>>>> IsiahSet
