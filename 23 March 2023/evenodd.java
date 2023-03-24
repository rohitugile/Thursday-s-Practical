//WAP to find if the number is even or odd

import java.util.Scanner;

class evenodd {
 public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);  // creating object of Scanner class 

    System.out.println("Enter the number :");   // asking for input
    a = sc.nextInt();      // input is strored in variable a 

    if(a%2==0)             // mod will return remainder if its even then remainder should be 0
    System.out.println("The number is even");
    else
    System.out.println("The number is Odd");
    sc.close();            
 }   
}
