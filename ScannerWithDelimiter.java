/*
Author: 		Tim Klopfer
Date:			2/24/2016
Contact:		tvk206@email.vccs.edu
Description:	Program that finds the average of ten integers.
*/

import java.util.Scanner;
public class ScannerWithDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n0, n1, n2, n3, n4, n5, n6 ,n7, n8, n9, sum; 		//Initializing integers to be input by user
		float average;											//Average may be decimal so must be float not int
		
		Scanner keyboard = new Scanner (System.in);				//Scanner is used but with delimiter of ","
		keyboard.useDelimiter(",");
		
		System.out.println ("Please input 10 whole integers to find an average");	//user inputs 10 integers delimited by ","
		System.out.println ("all delimited by commas, no spaces.");
		
		
		n0 = keyboard.nextInt(); 	//ten integers are assigned 
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		n3 = keyboard.nextInt();
		n4 = keyboard.nextInt();
		n5 = keyboard.nextInt();
		n6 = keyboard.nextInt();
		n7 = keyboard.nextInt();
		n8 = keyboard.nextInt();
		n9 = keyboard.nextInt();
		
		sum = n1+n2+n3+n4+n5+n6+n7+n8+n9+n0;	//sum is to be found
		average = sum/10;						//divide sum by 10 to find the average
		
		System.out.println ("Your sum is " + "\"" +sum + "\"" );		//escape character "\"" is used to put sum between quotation marks
		System.out.println ("The average of "+ "\n" + "your data" + "\n" + "is " + "\t"+ +average); //escape character "\n" to insert new line
																	//escape character "\t" to add whitespace
	}

}
