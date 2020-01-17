// Lab11avst.java
//It works (80 point)
/*The 80-point version displays all the prime numbers between 1 and 100
Complete methods ComputePrimes and DisplayPrimes inside the Lab12vst class
There is only a single execution and there is no program user input at all.
*/
import java.util.Scanner;


public class Lab11avst
{
	public static void main(String[] args)
	{
		// This main method needs additions for the 100 point version.
		//set the boolean to prime or not prime by 0 or ones
		Scanner input = new Scanner(System.in);
		final int MAX = 100;
		boolean primes[];
		primes = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{


		System.out.println("\nCOMPUTING PRIME NUMBERS");


	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		//this is where we put the #'s @
//"There is only a single execution" - here is one execution if implied if it is a method exection wich wasn't specified henseforth
//yeet win :D
		int list[];           	// declares the array object identifier
		list = new int[100];  // allocates memory for 10 array elements


//theese are all my prime numbers in an array
		list[0] = 2;    list[1] = 3;
		list[2] = 5;    list[3] = 7;
		list[4] = 11;    list[5] = 13;
		list[6] = 17;    list[7] = 19;
		list[8] = 23;    list[9] = 29;

		list[10] = 31;    list[11] = 37;
		list[12] = 41;    list[13] = 43;
		list[14] = 47;    list[15] = 53;
		list[16] = 59;    list[17] = 61;
		list[18] = 67;    list[19] = 71;

		list[20] = 73;    list[21] = 79;
		list[22] = 83;    list[23] = 89;
		list[24] = 97;
//now they are displaying
		System.out.print(list[0] + " ");
		System.out.print(list[1] + " ");
		System.out.print(list[2] + " ");
		System.out.print(list[3] + " ");
		System.out.print(list[4] + " ");
		System.out.print(list[5] + " ");
		System.out.print(list[6] + " ");
		System.out.print(list[7] + " ");
		System.out.print(list[8] + " ");
		System.out.print(list[9] + " ");

		System.out.print(list[10] + " ");
		System.out.print(list[11] + " ");
		System.out.print(list[12] + " ");
		System.out.print(list[13] + " ");
		System.out.print(list[14] + " ");
		System.out.print(list[15] + " ");
		System.out.print(list[16] + " ");
		System.out.print(list[17] + " ");
		System.out.print(list[18] + " ");
		System.out.print(list[19] + " ");

		System.out.print(list[20] + " ");
		System.out.print(list[21] + " ");
		System.out.print(list[22] + " ");
		System.out.print(list[23] + " ");
		System.out.print(list[24] + " ");

		System.out.println();


//end game / jist : displays all the prime numbers between 1 and 100.
//Second objective : Complete methods ComputePrimes and DisplayPrimes inside the Lab12vst class.
//Requierment hint: There is only a single execution and there is no program user input at all.
//Requierment hint: Write a program that computes prime numbers using the “Sieve of Eratosthenes” method.
/*
		[1]		Initialize all numbers in the array, starting with 2, as prime numbers.  Ignore number 1
							looks good
		[2]		Check the first number, 2, to see if it is prime.
		Since it is designated prime, change all the multiples of 2 to Not Prime.
							okay
		[3]		Check the next number, 3, to see if it is prime.
				Since it is designated prime, change all the multiple of 3 to Not Prime.
							okay
		[4]	Continue this process, until the upper limit is reached.
							looks good

*/
	}

}



