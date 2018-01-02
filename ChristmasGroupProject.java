//package com.Troy_Test.Troy;

import java.util.*;
import java.io.*;

//Begin ChristmasGroupProject
public class ChristmasGroupProject
{
	//Begin main
	public static void main(String[] args) throws FileNotFoundException
	{

		//Main Variables
		Integer Totalbudget = 0;
		String[] t;

		Scanner scan = new Scanner(System.in);

		//don't actually know what data type this should be
		//Time/Date class might make this an object, or an integer if it's days left for production
		Integer daysLeft = 0;
		Double budget = 0.00;

		List<String> names = new ArrayList<String>();
		List<Boolean> NorN = new ArrayList<Boolean>();
		List<Integer> age = new ArrayList<Integer>();


		//Creation of parallel arrays for the presents:
		List<String> gameName = new ArrayList<>();
		List<Integer> startingAge = new ArrayList<>();
		List<Integer> endingAge = new ArrayList<>();
		List<Double> gamePrice = new ArrayList<>();
		List<Integer> daysToBuild = new ArrayList<>();

		System.out.println("Please enter the current budget.");
		budget = Double.parseDouble(scan.nextLine());

		System.out.println("How many days are left till Christmas Eve");
		daysLeft = Integer.parseInt(scan.nextLine());

		kidSorted(trimArray(grabKids()), names, NorN, age);
		giftSorted(trimArray(grabGifts()), gameName, startingAge, endingAge, gamePrice, daysToBuild);
		//List<Integer> minAge, List<Integer> maxAge, List<String> giftName, Integer days, Integer daysLeft) throws FileNotFoundException
		sortGifts(gameName, gamePrice, startingAge, endingAge, daysToBuild);
		giveGifts(gamePrice, budget, NorN, age, names, startingAge, endingAge, gameName, daysLeft, daysToBuild);
	}
	//End main
	/* -TC-
	Short Desc: Grabs all the data from the 'kids' file and seporates it by the comma into seporate arrays.
	Parameters: f; The name of the child, n; whether the kid is naughty or nice [nice = true], a; age of the child.
	NOTE TO SELF: passed by reference because arrays are objects!
	*/
	//TRANSFER FROM ARRAYS TO ARRAY LISTS, can use the .split methods
	public static void kidSorted(String[] e, List<String> a, List<Boolean> b, List<Integer> c)
	{
		int placeholder = 3;
		int current = 0;
		/*
		 * 3 - place
		 * 0
		 * 1
		 * 2
		 * 6 - place
		 * 3
		 * 4
		 * 5
		 * 9 - place
		 */
		for(; placeholder <= e.length-1; placeholder+=3)
		{
			while(current < placeholder)
			{
				if (placeholder-current == 3)
					a.add(e[current]);

				else if (placeholder-current == 2)
				{
					//instead of having the extra statements, I could just put if, else, NorN.add(true, false) instead of taking it in twice
					if(e[current].equalsIgnoreCase("nice"))
						e[current] = "true";
					else
						e[current] = "false";
					//will grab the boolean value, needs to be converted to the actual boolean earlier
					b.add(Boolean.valueOf(e[current]));
				}
				else if(placeholder-current == 1)
				{
					//stores integer value
					c.add(Integer.parseInt(e[current]));
				}
				current++;
			}
		}
	}
	/* -TC-
	Short Desc: Grabs all the data from the 'kids' file and seporates it by the comma into seporate arrays.
	Parameters: n; name of the gift, p; the price of the gift, t; how long the gift takes to make, l; the age requirement of the present.
	*/
public static void giftSorted(String[] e, List<String> a, List<Integer> b, List<Integer> c, List<Double> d, List<Integer> f)
	{
		//starts out at 0 when looping so counter would have an extra 1
		int placeholder = 5;
		int current = 0;
		//no longer need the for loop because it will constantly loop
		for(; placeholder <= e.length; placeholder+=5)
		{
			while(current < placeholder)
			{
					if (placeholder-current == 5)
						a.add(e[current]);

					else if (placeholder-current == 4)
					{
						//will grab the boolean value, needs to be converted to the actual boolean earlier
						b.add(Integer.parseInt(e[current]));
					}
					else if(placeholder-current == 3)
					{
						c.add(Integer.parseInt(e[current]));
					}
					else if(placeholder-current == 2)
					{
						//stores integer value
						d.add(Double.parseDouble(e[current]));
					}
					else if(placeholder-current == 1)
					{
						//stores integer value
						f.add(Integer.parseInt(e[current]));
					}
					//System.out.println(a);
					//System.out.println(b);
					//System.out.println(c);
					//System.out.println(d);
					//System.out.println(f);
				current++;
			}
		}
	}

		public static String[] trimArray(String[] a)
	{
		int numberOfUsed = 0;

		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != null)
			{
				numberOfUsed++;
			}
		}

		System.out.println(numberOfUsed);

		String[] newbie = new String[numberOfUsed];

		for(int i = 0; i < newbie.length; i++)
		{
			newbie[i] = a[i];
		}

		return newbie;
	}

	//Prarameter list: gP: gamePrice, b: budget, NorN = Naughty or Nice (NorN) age: age,
	public static void giveGifts(List<Double> gP, Double b, List<Boolean> NorN, List<Integer> age, List<String> name, List<Integer> minAge, List<Integer> maxAge, List<String> giftName, Integer days, List<Integer> daysLeft) throws FileNotFoundException
	{
		//Declare variables
		boolean balanced = false, newGift = false, booleanHolder = false;
		double[] giftPrice = new double[age.size()];
		String[] giftName1 = new String[age.size()];
		String holder = "";

		//Begin for 1
		for(int a = 0; a < age.size(); a++)
		{
			newGift = false;
			//Begin while 1
			while(!newGift && NorN.get(a) == true)
			{
				//Begin for 2
				for(int c = gP.size() - 1; c >= 0; c--)
				{
					//Begin if 1
					if(gP.get(c) < b && age.get(c) <= maxAge.get(c) && age.get(c) >= minAge.get(c) && days > daysLeft.get(c))
					{
						giftPrice[a] = gP.get(c);
						giftName1[a] = giftName.get(c);
						newGift = true;
						break;
					}
					//End if 1
				}
				//End for 2
				//Begin if 2
				if(!newGift)
				{
					//Begin for 3
					for(int d = a - 1; d >= 0; d--)
					{
						//Begin for 4
						for(int e = gP.size() - 1; e >= 0; e--)
						{
							//Begin if 3
							if(gP.get(e) < b && age.get(e) <= maxAge.get(e) && age.get(e) >= minAge.get(e) && days < daysLeft.get(e))
							{
								giftPrice[a] = gP.get(e);
								giftName1[a] = giftName.get(e);
								newGift = true;
								break;
							}
							//End if 3
						}
						//End for 4
					}
					//End for 3
				}
				//End if 2
				//Begin if 4
				if(!newGift)
				{
					newGift = true;
				}
				//End if 4
			}
			//End while 1
		}
		//End for 1
		//Begin for loop 5
		for(int f = 0; f < age.size(); f++)
		{
			//Begin if 5
			if(giftName1[f].equals("null"))
			{
				giftName1[f] = "lack of a present due to being naughty";
			}
			//End if 5
			holder = name.get(f) + " got a " + giftName1[f] + ".";
			System.out.println(holder);
			printToFile(holder);
		}
		//End for loop 5
		holder = "The remaining budget was $" + b + ".";
		printToFile(holder);
	}
	//End giveGifts
	//Begin grabKids

	public static void printToFile(String t) throws FileNotFoundException
	{
		File outputFile = new File ("Output.txt");
		PrintWriter writer = new PrintWriter(outputFile);

		// cost, remainder, list of what kids and their gifts, and total days needed
		writer.write(t);
      writer.close();
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

		//Begin while 1
		while(reader.hasNext())
		{
			//Grab the line
			line = reader.next();
			//Split each word with ','
			t = line.split(",");
			//Print out
			//Begin for 1
			for (String str: t)
			{
				massData[counter] = str;
				System.out.println(massData[counter]);
				counter++;
			}
			//End for 1
		}
		//End while 1
		return massData;
	}
	//End of grabKids
	//Begin grabGifts
	public static String[] grabGifts() throws FileNotFoundException
	{
		//Variballs
		int counter = 0;
		String line;
		String[] t = new String[1500];
		String[] massData = new String[1500];
		//Scanner
		Scanner reader = new Scanner(new File("gifts.txt"));

		//Begin while 1
		while(reader.hasNext())
		{
			//Grab the line
			line = reader.nextLine();

			t = line.split("\n");
			//Print out
			//Begin for 1
			for (String str: t)
			{
				massData[counter] = str;
				System.out.println(massData[counter]);
				counter++;
			}
			//End for 1
		}
		//End while 1
		return massData;
	}
	//End of grabKids

	//Begin sortGifts
	public static void sortGifts(List<String> names, List<Double> prices, List<Integer> lowAge, List<Integer> highAge, List<Integer> productionTime)
	{
		List<String> sortedNames = new ArrayList<String>();
		List<Double> sortedPrices = new ArrayList<Double>();
		List<Integer> sortedLowAge = new ArrayList<Integer>();
		List<Integer> sortedHighAge = new ArrayList<Integer>();
		List<Integer> sortedProductionTime = new ArrayList<Integer>();
		double priceHolder = 0.00;
		boolean sorted = false;
		int sortCounter = 0;

		//Begin for 1
		for(int a = 0; a < prices.size(); a++)
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
			sortedLowAge.add(lowAge.get(prices.indexOf(sortedPrices.get(c))));
			sortedHighAge.add(highAge.get(prices.indexOf(sortedPrices.get(c))));
			sortedProductionTime.add(productionTime.get(prices.indexOf(sortedPrices.get(c))));
			System.out.println(sortedNames.get(c));
			System.out.println(sortedPrices.get(c));
		}
		//End for 3
		//Begin for 4
		for(int d = 0; d < sortedNames.size(); d++)
		{
			names.set(d, sortedNames.get(d));
			prices.set(d, sortedPrices.get(d));
			lowAge.set(d, sortedLowAge.get(d));
			highAge.set(d, sortedHighAge.get(d));
			productionTime.set(d, sortedProductionTime.get(d));
		}
		//End for 4
	}
	//End sortGifts
}
//End ChristmasGroupProject