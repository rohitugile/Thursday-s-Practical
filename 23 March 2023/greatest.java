//WAP to take 3 numbers and find greatest of all

public class greatest {
public static void main(String[] args) {
    
    int a,b,c;

    a= 100;
    b= 100;
    c= 20;


    if (a > b && a > c)  
    System.out.println("The largest number is: "+ a);  
    else if (b > a && b > c)  
    System.out.println("The largest number is: "+ b);  
    else if (c > a && c > b)  
    System.out.println("The largest number is: "+ c);  
    else  
    System.out.println("Numbers are same.");  

}
    
}