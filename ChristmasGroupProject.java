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
		Integer Totalbudget = 0;
		Integer budgetLeft = 0;
		String[] t;
		//don't actually know what data type this should be
		//Time/Date class might make this an object, or an integer if it's days left for production
		String daysLeft = " ";

		List<String> names = new ArrayList<String>();
		List<Boolean> NorN = new ArrayList<Boolean>();
		List<Integer> age = new ArrayList<Integer>();


		//Creation of parallel arrays for the presents:
		List<String> gameName = new ArrayList<>();
		List<Integer> startingAge = new ArrayList<>();
		List<Double> gamePrice = new ArrayList<>();
		List<Integer> daysToBuild = new ArrayList<>();
	}
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
	//Begin finalLogic
	//Do not try to run this right now, it will absolutely not work. Don't worry, I just need to line up all the variables.
	//Prarameter list: gP: gamePrice, b: budget, NorN = Naughty or Nice (NorN) a: age,
	public static void finalLogic(List<Double> gP, double b, List<Boolean> NorN, List<Integer> age)
	{
		//Declare variables
		//There is an int variable called counter. It will need to be set to the number of kids - 1. You want a full explanation? Just ask.

	//--edit generics
		boolean balanced = false;
		double[] giftPrice = new double[age.size()];
		int counter = age.size() - 1;

		//Begin for 1
		for(int a = 0; a < 25; a++)
		{
			//In the actual program, this will need to be a for (or maybe a while) loop, that way there is not a massive list of if/else if/else if/...
			//Begin if/else 1
			if(b >= gift1 && (NorN.get(a) == false || age.get(a) < 15))
			{
				giftPrice[a] = gift1;
				b = b - gift1;
				balanced = true;
			}
			else
			{
				//Begin while 1
				while(!balanced)
				{
					//Begin if 5
					if(giftPrice[counter] > gift2 && (b + (gift1 - gift2)) >= 0.00 && (NorN.get(a) == false || age.get(a) < 15))
					{
						giftPrice[a] = gift2;
						b = b + (gift1 - gift2);
						balanced = true;
					}
					//End if 5
					counter--;
				}
				//End while 1
				counter = age.size() - 1;
			}
			//End if/else 1
		}
		//End for 1
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

				t = line.split("\n");
				//Print out
				for (String str: t)
				{
					massData[counter] = str;
					System.out.println(massData[counter]);
					counter++;
				}
				return massData;
			}
		}//End of grabKids
	}

/*
/*
John Hayes
Period 5, Team JIT
12/21/17, 12/22/17
This is my work and my work alone. JH
It's practically a bubble sort.
//Import packages
import java.util.*;

//Begin SortTest
public class SortTest
{
	//Begin main
	public static void main(String[] args)
	{
		//Declare variables
		List<String> names = new ArrayList<String>();
		List<Double> prices = new ArrayList<Double>();
		List<String> sortedNames = new ArrayList<String>();
		List<Double> sortedPrices = new ArrayList<Double>();
		double priceHolder = 0.00;
		boolean sorted = false;
		int sortCounter = 0;

		//Fill arrays
		//Obviously, these are just for testing purposes.
		names.add("Meme");
		names.add("Michael");
		names.add("Sam");
		prices.add(69.69);
		prices.add(5.00);
		prices.add(10.00);

		//Begin for 1
		for(int a = 0; a < 3; a++)
		{
			sortedPrices.add(prices.get(a));
		}
		//End for 1

		//Begin while 1
		//Practically a bubble sort.
		while(!sorted && sortCounter + 1 < sortedPrices.size())
		{
			//Begin if/else 1
			//If the price one higher than the price we are looking at, the two are swapped.
			if(sortedPrices.get(sortCounter) > sortedPrices.get(sortCounter + 1))
			{
				priceHolder = sortedPrices.get(sortCounter);
				sortedPrices.set(sortCounter, sortedPrices.get(sortCounter + 1));
				sortedPrices.set(sortCounter + 1, priceHolder);
			}
			else //Increments sort counter, and loops it back because you are not gonna sort all the prices in one go.
			{
				sortCounter++;
				//Begin if 1
				if(sortCounter + 1 > sortedPrices.size())
				{
					sortCounter = 0;
				}
				//End if 1
			}
			//End if/else 1
			sorted = true;
			//Begin for 2
			//Checks to see if the prices are sorted
			for(int b = 0; b < sortedPrices.size() - 1; b++)
			{
				//Begin if 2
				if(sortedPrices.get(b) > sortedPrices.get(b + 1))
				{
					sorted = false;
				}
				//End if 2
			}
			//End for 2
		}
		//End while 1

		//Begin for 3
		for(int c = 0; c < names.size(); c++)
		{
			sortedNames.add(names.get(prices.indexOf(sortedPrices.get(c))));
			System.out.println(sortedNames.get(c));
			System.out.println(sortedPrices.get(c));
		}
		//End for 3
	}
	//End main
}
//End SortTest
*/