/**
 * CS 105 Theory & Practice
 * CRN: 62498
 * Assignment: IntegerSign
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Allan Knight
 */
package edu.sbcc.cs105;

import java.util.Scanner;

/**
 * This code is a solution for the IntegerSign assignment.
 *
 */
public class IntegerSign {
	/**
	 * Determine the sign, positive, negative or zero, of the given integer.
	 * 
	 * @param integer The value to determine the sign of.
	 * @return The sign as a string, either positive, negative or zero.
	 */
	public static String determineSign(int integer) {
		String result = "zero";
		if(integer > 0) {
			result = "positive";
		} else if(integer < 0) {
			result = "negative";
		}
		
		return result;
	}
	
    /**
     * This code runs by asking for a number, then prints out if it
     * is positive, negative or zero.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		System.out.println(determineSign(in.nextInt()));
		
		in.close();
	}
}
