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
<<<<<<< HEAD
		Boolean[] naughtyOrNice = new Boolean[Integer.MAX_VALUE];
=======
	//	String[] naughtyOrNice = new String[Integer.MAX_VALUE];
>>>>>>> IsiahSet
		//might have to parse Integer for the numeric values
	//	Integer[] age = new Integer[Integer.MAX_VALUE];

		//Creation of parallel arrays for the presents:
	//	String[] giftName = new String[Integer.MAX_VALUE];
		//could be set up to become an integer, would probably need to
	//	Double[] giftPrice = new Double[Integer.MAX_VALUE];
		//Could be set to an integer for simplicity: in days
<<<<<<< HEAD
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

<<<<<<< HEAD
	/* -TC-
	Short Desc: Grabs all the data from the 'kids' file and seporates it by the comma into seporate arrays.
	Parameters: n; name of the gift, p; the price of the gift, t; how long the gift takes to make, l; the age requirement of the present.
	*/
	public static void assignGifts(String[] n, double[] p, String[] t, int[] l)
	{

	}
=======
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
>>>>>>> JohnSet
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
=======
	//	String[] giftTime = new String[Integer.MAX_VALUE];
	}

	public static String[] grabKids() throws FileNotFoundException
>>>>>>> IsiahSet
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
<<<<<<< HEAD
			i++;//Loop
		}
	}//End of grabKids
}//End of ChristmasGroupProject
>>>>>>> IsiahSet
=======
			return massData;
		}//End of grabGifts
}//End of Christ
>>>>>>> IsiahSet
