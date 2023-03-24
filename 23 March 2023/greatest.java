//WAP to take 3 numbers and find greatest of all

import java.util.Scanner;

public class greatest {
public static void main(String[] args) {
    
    int a,b,c;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 3 numbers");  //Asking user to give inputs

    a= sc.nextInt();    //Inputs will be stored in a,b,c
    b= sc.nextInt();
    c= sc.nextInt();

    if (a > b && a > c)                                 //Comparing if a is greater than b and c
    System.out.println("The largest number is: "+ a);  
    else if (b > a && b > c)                            //Comparing if b is greater than a and c
    System.out.println("The largest number is: "+ b);  
    else if (c > a && c > b)                            //Comparing if c is greater than a and b
    System.out.println("The largest number is: "+ c);  
    else                                                // else the two or more have same value
    System.out.println("Numbers are same.");  

    sc.close();

}
    
}
