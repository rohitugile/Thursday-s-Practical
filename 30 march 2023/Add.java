/*Que 1 : Write a Java Program showing overloading od Add method with 2 parameter and 3 parameters.In the user passes 2 values method with 2 parameter should be called 
           if he passes 3 values method with 3 parameters should be called. */

class Add_method  // created a class here named as Add_method
	{
	  int a;   //data members created within a class
	  int b;
	  int c;
	  
	  int add(int a, int b) //created a add() method with two parameters 
	  {
	    int sum = a+b;    //arithmetic opration done on data member
	    return sum;       // return the addition as sum 
	  }
	  int add(int a, int b, int c) // created a add() method with three parameters
	  {
	    int sum = a+b+c;       // arithmetic operation done on data member
	    return sum;            //return their addition as sum 
	  }
	}
	public class Add  // created a public class
	{
	  public static void main(String args[])  //here is main method to start the execution
	  { 
	    Add_method a1 = new Add_method();  //created a object for class Add_method here 
	    System.out.println("The addition method with two parameter : "+a1.add(32, 340)); //here pass the two parameter to the object and add() method with two parameter get called.
	    System.out.println("The addition method with three parameter : "+a1.add(156, 50, 9)); //here pass the two parameter to the object and add() method with three parameter get called.
	  }
	}
