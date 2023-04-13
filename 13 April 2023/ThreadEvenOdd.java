//Ques 2. Write a program to create thread. Where you will take the input from the user and find if the number is odd or even.

package April13;

import java.util.Scanner;		//importing Scanner class 

class EvenOdd extends Thread {		//Extending Thread class

    public void run() {				//overriding run method from Thread class

            Scanner s = new Scanner(System.in);		// creating Scanner object
            System.out.print("Enter a number: ");	// Asking user to give a input
            int a = s.nextInt();		// Taking Input from user
            if (a % 2 == 0)				// checking if the remainder is 0 then is statement will be executed
            {System.out.println("The given number " + a + " is Even" );
            }
            else						// if the remainder is 1 else will be executed
            {System.out.println("The given number " + a + " is Odd" );
            }
            s.close();					// closing scanner object
    }
}

public class ThreadEvenOdd{
	public static void main(String[] args) {		// main Thread
    	EvenOdd t = new EvenOdd();					// creating thread t
        t.start();									// calling start method 
    }
}
