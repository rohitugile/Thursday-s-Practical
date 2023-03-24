//WAP to Create a class Calculation add methods addition,substraction,multiplication,division in it. Create objects and access those methods.


import java.util.Scanner;

public class calculation {
    int a,b,result ;

    calculation()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
    a= sc.nextInt();
    b= sc.nextInt();
    sc.close();
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

        calculation C = new calculation();
        
        C.addition();
        C.substraction();
        C.multiplication();
        C.division();
    }
}
