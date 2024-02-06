/*-------------------------------------------------------------------------
// AUTHOR: your name.
// FILENAME: title of the source file.
// SPECIFICATION: your own description of the program.
// FOR: CS 1400 - Lab #6
// TIME SPENT: how long it took you to complete the assignment.
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab6
{
    public static void main(String[] args)
    {
        // ========== Declaring variables ==========

        // An integer for the array size.
        int size;

        // A double for the current element.
        double usr;


        // A scanner object for requesting input from System.in.
    	Scanner scan=new Scanner(System.in);


        // ========== Request Array size from user ==========

        // Print this message "How many elements in the array: "
        System.out.println("How many elements in the array: ");

        // Request an integer from the user using the Scanner object
        // and store the inputted value in the integer declared above.
        size=scan.nextInt();


        // ========== Declare the array ==========

        // Declare a new array of double values. 
        // The size of the array is equal to the size requested
        double[] list;
        list=new double[size];


        // ========== Fill in the array ==========

        // Use a for loop to prompt the user for the content of the array
        for(int i=0; i<size; i++) {
        	int num=i+1;
        	System.out.println("Input "+num+": " );
        	usr=scan.nextDouble();
        	list[i]=usr;
        	
        }
        // ========== Display the array's elements backward ==========

        // Construct a for loop that runs backwards through the array,
        // starting at the last element and ending at the first.
        for(int i=size-1; i>=0; i--) {
        	System.out.println(list[i]);
        }


        // ========== Display the sum ==========

        // Call the method sumArray with the user's array and display the sum
        // end with a newline character.
        System.out.println(sumArray(list));
        
        //Close Scanner object 
        scan.close();
    } // end main

    
    //This method calculates and returns the sum of arr 
    //DO NOT print out any message in this method 
    public static double sumArray(double[] arr)
    {
    	double result=0;
    	for(int i=0; i<arr.length; i++) {
    		result=result+arr[i];
    		
    	}
    	return result;
    }
} // Close the Lab6 class.