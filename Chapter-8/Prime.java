//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;



	public Prime()
	{
		number = 0;
	}
	
	

	public Prime(int num)
	{
		setPrime(num);
	}



	public void setPrime(int num)
	{
		number = num;
	}



	public boolean isPrime()
	{
		// NOTE: This is not the most efficient algorithm
		
		// count the number of factors
		// from 1 to number
		int count = 0;
		
		
		// use a loop and loop through all possible factors
		// of number (from 1 to number)
		
		// each time through the loop see if your number is
		//    divisible by the loop variable (i.e. a possible factor)
		//    if it is divisible, add 1 to your count
		

		for (int i = number - 1; i > 1; i--)
		
			if(number % i == 0)
				return false;
				
		return true;
	
	}



	public String toString()
	{
		String output="";

		if ( isPrime() == true )
			output = number + " is a prime.";
		else
			output = number + " is not a prime.";
		// store in output 
		// number is prime.  or number is NOT prime  where 
		//    number is the value of your number variable
		// use an if else and call a method to determine 
		//    if number is prime (true or false)
		
		// if (?????())
		//    output = ?;
		// else
		//    output = ?;




		return output;
	}
}
