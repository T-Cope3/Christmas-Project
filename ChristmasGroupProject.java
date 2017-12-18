//ignore the package thing, it's just so that I can pull it up in eclipse without a problem.
package com.Troy_Test.Troy;

import java.util.*;

public class ChristmasGroupProject
{

	public static void main(String[] args)
	{
		//Main Variables
		Integer Totalbudget = 0;
		Integer budgetLeft = 0;
		//don't actually know what data type this should be
		//Time/Date class might make this an object, or an integer if it's days left for production
		String daysLeft = " ";

		//Creation of parallel arrays for the kids:
		String[] firstName = new String[Integer.MAX_VALUE];
		//could make this boolean if wanted
		String[] naughtyOrNice = new String[Integer.MAX_VALUE];
		//might have to parse Integer for the numeric values
		Integer[] age = new Integer[Integer.MAX_VALUE];

		//Creation of parallel arrays for the presents:
		String[] giftName = new String[Integer.MAX_VALUE];
		//could be set up to become an integer, would probably need to
		Double[] giftPrice = new Double[Integer.MAX_VALUE];
		//Could be set to an integer for simplicity: in days
		String[] giftTime = new String[Integer.MAX_VALUE];
	}

}
