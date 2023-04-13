//Ques 1. Write a program to take input of marks of 3 subjects from the user. 
//Check if the total of marks given by the user is greater than 50 else throw an exception saying "You Failed". 
//Or else print Grade is A if the total is greater than 280. 
//Grade B if the total is greater than 200. 
//Grade C if the total is greater than 150. 
//Grade D if the total is greater than 50.

package April13;

import java.util.Scanner;				//importing Scanner class

public class Grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);		//creating object of Scanner class
        
        System.out.print("Enter marks for Subject 1: ");
        int m1 = s.nextInt();				 // Taking input of marks for subject 1
        
        System.out.print("Enter marks for Subject 2: ");
        int m2 = s.nextInt();				// Taking input of marks for subject 2
        
        System.out.print("Enter marks for Subject 3: ");
        int m3 = s.nextInt();				// Taking input of marks for subject 3
        
        int total = m1 + m2 + m3;		// Calculating total marks
        
        try {
            if (total <= 50) {			// Checking if total marks are greater than 50
                throw new Exception() ;		// throws an exception if the total marks are less than 50
            } else if (total > 280) {
                System.out.println("Grade is A");	//this statement will be executed if the total marks greater than 280
            } else if (total > 200) {
                System.out.println("Grade is B");	//this statement will be executed if the total marks greater than 200
            } else if (total > 150) {
                System.out.println("Grade is C");	//this statement will be executed if the total marks greater than 150
            } else if (total > 50) {
                System.out.println("Grade is D");	//this statement will be executed if the total marks greater than 50
            }
       } 
        catch (Exception e) {
            System.out.println("You Failed");    //this statement will be executed if the exception is thrown
        } 
        
        finally {
            s.close();							// closing scanner object
        }
    }
}
	