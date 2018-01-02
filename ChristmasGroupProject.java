//package com.Troy_Test.Troy;
/*
Team JIT
Period 5
12/8/17 - 1/1/18
This is our work and our work alone. JIT
S A N T A
What went right: Communication from the beginning, planning, goal setting from the beginning. Immediate division of jobs. The project runs. Flexibility and general collaboration.
What went wrong: Time management. Lack of direction during meetings. Planning of specifics.
What we learned: Communication is KEY. Better to work individual and merge at the end. Easier with using parameters, 'function-oriented programming'.
*/
import java.util.*;
import java.io.*;

//Begin ChristmasGroupProject
public class ChristmasGroupProject
{
	//Begin main
	public static void main(String[] args) throws FileNotFoundException
	{
		//File Output Stuff - JIT
		File outputFile = new File ("Output.txt");
		PrintWriter writer = new PrintWriter(outputFile);

		//Main Variables
		Integer Totalbudget = 0;
		String[] t;
		Integer daysLeft = 0;
		Double budget = 0.00;

		//Scanner
		Scanner scan = new Scanner(System.in);

		//Kid parallel arrays
		List<String> names = new ArrayList<String>();
		List<Boolean> NorN = new ArrayList<Boolean>();
		List<Integer> age = new ArrayList<Integer>();


		//Creation of parallel arrays for the presents:
		List<String> gameName = new ArrayList<>();
		List<Integer> startingAge = new ArrayList<>();
		List<Integer> endingAge = new ArrayList<>();
		List<Double> gamePrice = new ArrayList<>();
		List<Integer> daysToBuild = new ArrayList<>();

		//Get info from user
		System.out.println("Please enter the current budget.");
		budget = Double.parseDouble(scan.nextLine());

		System.out.println("How many days are left till Christmas Eve?");
		daysLeft = Integer.parseInt(scan.nextLine());

		//Call methods
		kidSorted(trimArray(grabKids()), names, NorN, age);
		System.out.println("Assigning Kids Done");
		giftSorted(trimArray(grabGifts()), gameName, startingAge, endingAge, gamePrice, daysToBuild);
		System.out.println("Assigning Gifts Done");
		sortGifts(gameName, gamePrice, startingAge, endingAge, daysToBuild);
		System.out.println("Sorting Arrays Done");
		giveGifts(gamePrice, budget, NorN, age, names, startingAge, endingAge, gameName, daysLeft, daysToBuild, writer);
		System.out.println("Giving Gifts Done");
		//closing of the writer -TC
		writer.close();
	}

	//TC: Basically sorts the mass amount of data into ArrayLists that are returned by 'reference.'
	//Parameters: e: massData, a: names, b: Naughty Or Nice, c: child's age
	//Begin kidSorted
	public static void kidSorted(String[] e, List<String> a, List<Boolean> b, List<Integer> c)
	{
		//has to be three because it runs once before integration
		int placeholder = 3;
		int current = 0;

		//integrates by 'three' for each set so it assigns it to parallel arrayLists
		//Begin for 1
		for(; placeholder <= e.length-1; placeholder+=3)
		{
			//Begin while 1
			while(current < placeholder)
			{
				//Begin if/else if/else if 1
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
				//End if/else if/else if 1
				current++;
			}
			//End while 1
		}
		//End for 1
	}
	//End kidSorted
	//TC: Sorting of the mass data that puts it into arrayLists
	//Parameters: e: massData, a: gift name, b: minimum age, c: maximum age, d: game price, f: how long it will take to produce
	//Begin giftSorted
	public static void giftSorted(String[] e, List<String> a, List<Integer> b, List<Integer> c, List<Double> d, List<Integer> f)
	{
		//starts out at 0 when looping so counter would have an extra 1
		int placeholder = 5;
		int current = 0;

		//incrementation for the 'five' each time so it works like a ladder and switch statement
		//Begin for 1
		for(; placeholder <= e.length; placeholder+=5)
		{
			//functions as a big switch statement
			//Begin while 1
			while(current < placeholder)
			{
				//Begin if/else if/else if/else if/else if 1
				if (placeholder-current == 5)
					a.add(e[current]);
				else if (placeholder-current == 4)
				{
					b.add(Integer.parseInt(e[current]));
				}
				else if(placeholder-current == 3)
				{
					c.add(Integer.parseInt(e[current]));
				}
				//assigning it's parallel array
				else if(placeholder-current == 2)
				{
					//stores double value
					d.add(Double.parseDouble(e[current]));
				}
				else if(placeholder-current == 1)
				{
					//stores integer value
					f.add(Integer.parseInt(e[current]));
				}
				//Begin if/else if/else if/else if/else if 1
				current++;
			}
			//End while 1
		}
		//End for 1
	}
	//End giftSorted
	//TC: trimArray is basically a method that cuts off the null from the end of the String array.
	//Parameter:
	public static String[] trimArray(String[] a)
	{
		//Declare variables
		int numberOfUsed = 0;
		//Begin for 1
		for(int i = 0; i < a.length; i++)
		{
			//Totals the amount of spots used
			//Begin if 1
			if(a[i] != null)
			{
				numberOfUsed++;
			}
			//End if 1
		}
		//End for 1
		//cuts down the array to only the spaces used
		String[] newbie = new String[numberOfUsed];
		//stops when all squares are used
		//Begin for 2
		for(int i = 0; i < newbie.length; i++)
		{
			newbie[i] = a[i];
		}
		//End for 2
		return newbie;
	}
	//End trimArray
	//JH: This determines what the kids will get, and has more parameters than stars in the sky.
	//Begin giveGifts
	public static void giveGifts(List<Double> gP, Double b, List<Boolean> NorN, List<Integer> age, List<String> name, List<Integer> minAge, List<Integer> maxAge, List<String> giftName, Integer days, List<Integer> daysLeft, PrintWriter w) throws FileNotFoundException
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
			while(!newGift && (NorN.get(a) == true || age.get(a) < 16))
			{
				//Begin for 2
				for(int c = gP.size() - 1; c >= 0; c--)
				{
					//Begin if 1
					//This is where we go if we have the budget for the most expensive gift. You can imagine how much use this gets.
					if(gP.get(c) < b && age.get(c) <= maxAge.get(c) && age.get(c) >= minAge.get(c) && days > daysLeft.get(c))
					{
						giftPrice[a] = gP.get(c);
						giftName1[a] = giftName.get(c);
						newGift = true;
						b = b - gP.get(c);
						break;
					}
					//End if 1
				}
				//End for 2
				//Begin if 2
				//This is where we go if we don't have enough for the most expensive gift.
				if(!newGift)
				{
					//Begin for 3
					for(int d = a - 1; d >= 0; d--)
					{
						//Begin for 4
						for(int e = gP.size() - 1; e >= 0; e--)
						{
							//Begin if 3
							//Translation: If there is enough for the gift after the price swap, is less than the current gift, if in the age range, it can be produced in the time, and if the person is nice/less than 16 years old.
							if(gP.get(e) < b + (giftPrice[d] - gP.get(e)) && gP.get(e) < giftPrice[d] && age.get(d) <= maxAge.get(e) && age.get(d) >= minAge.get(e) && days > daysLeft.get(e) && (NorN.get(d) == true || age.get(d) < 16))
							{
								b = (b + giftPrice[d]) - gP.get(e);
								giftPrice[d] = gP.get(e);
								giftName1[d] = giftName.get(e);
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
			//Begin if/else 1
			if(giftName1[f] == null)
			{
				//Nothing happens.
			}
			else
			{
				holder = name.get(f) + " got a " + giftName1[f] + ".";
				printToFile(w, holder);
			}
			//End if/else 1
		}
		//End for loop 5
		holder = "The remaining budget was $" + b + ".";
		printToFile(w, holder);
	}
	//End giveGifts
	//Begin printToFile
	//TC: prints the file or something like that
	//Parameter: w: the file you want to print from, t: the string you want to print
	public static void printToFile(PrintWriter w, String t) throws FileNotFoundException
	{
		//Prints to the file
		w.write(t);
		//Extra line for spacing
		w.println();
	}
	//End printToFile
	//Begin grabKids
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
				//System.out.println(massData[counter]);
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
				//System.out.println(massData[counter]);
				counter++;
			}
			//End for 1
		}
		//End while 1
		return massData;
	}
	//End of grabKids

	//Begin sortGifts
	//JH: Sorts the gifts from lowest to highest price. Another mile of parameters.
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
				if(sortCounter + 1 >= sortedPrices.size())
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
			//System.out.println(sortedNames.get(c));
			//System.out.println(sortedPrices.get(c));
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