//WAP to Create a class Calculation add methods addition,substraction,multiplication,division in it. Create objects and access those methods.


import java.util.Scanner;

public class calculation {
    int a,b,result ;

    calculation()
    {
        Scanner sc= new Scanner(System.in);     // creating object of Scanner 
        System.out.println("Enter two numbers");     // asking user to give input
    a= sc.nextInt();
    b= sc.nextInt();
    sc.close();                                 //closing sc
    }

    void addition()
    {
        result = a+b;
        System.out.println("The Addition is:" + result);
    }

    void substraction()
    {
        result = a-b;
        System.out.println("The Substraction is:" + result);
    }

    void multiplication()
    {
        result = a*b;
        System.out.println("The multiplication is :" + result);
    }

    void division()
    {
        result = a/b;
        System.out.println("The Division is :" + result);
    }    
}



class cal {
    public static void main(String[] args) {

        calculation C = new calculation();  //creating object C for calculation
        
        C.addition();       // addition method call
        C.substraction();   // substraction method call 
        C.multiplication(); // multipication method call
        C.division();       // division method call
    }
}
