import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Zoe Schmidt
 * CS 2420 - Fall 2019
 * Problem 21 from Chapter 7
 */

public class Ackermans {


	public static int Ackerman(int m, int n){
	
		
		if(m == 0) {
			
			return n += 1;
		}
		else if( n == 0) {
			
			return Ackerman(m-1,1);
		}
		else{
			return Ackerman(m - 1, Ackerman(m, n - 1));
		}
		
		
	}
	
public static int NumberOfOnes(int x) {

	
	if(x < 2) {
		return x;
	}
	else if(x % 2 == 0) {
		return NumberOfOnes(x/2);
	}
	else {
		return NumberOfOnes(x/2) + 1;
		}
	}

	
public static void printReverse(Scanner s) {

	if(!s.hasNextLine()) {
		
	}
	else {
		String line = s.nextLine();
		//System.out.println(line);
		printReverse(s);
		System.out.println(line);
	}
}



public static void main(String[] args) throws FileNotFoundException {
	
	//Testing Ackerman method
	Ackermans a = new Ackermans();
	System.out.println("Ackermans answer is: " + a.Ackerman(1,2)); //Should be 4 cause the result of 1 and 2 is 4
	System.out.println();
	
	//Testing number of ones
	System.out.println("7.23 - Number of ones: " + a.NumberOfOnes(200)); //Should be three cause there's three 1's in binary of 200
	System.out.println();
	
	//Testing Reverse String
	Scanner in = new Scanner (new File("reverse.txt"));
	printReverse(in); //Should print backwards cause it's spelled sdrawkcab on the file
	System.out.println();
	
	}
}
