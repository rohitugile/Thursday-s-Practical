/*Que.2 Create a class named 'Rectangle' with two data members 'length' and 'breath' and two methods to print the area and perimeter of the rectangle respectively
         Its construtor having parameters respectively.Its constructor having parameters for length and breath is used for initialze lengh and breath of the rectangle 
	 print the area and perimeter of a rectangle*/

class Rectangle // class created with name Rectangle
{

	int length; /// data members and their type
	int breadth;

	Rectangle(int l, int b) // parameterized constructor for class Rectangle
	{
		this.length = l;
		this.breadth = b;
	}

	int calculateArea() // created method calculateArea() for area of rectangle
	{
		int area = length * breadth;
		return area;
	}

	int calculatePerimeter() // created method calculatPerimeter() for area of rectangle
	{
		int peri = 2 * (length + breadth);
		return peri;
	}
}

public class UseRectangle // create a main class here
{

	public static void main(String[] args) // here is main method in main class for program execution
	{
		Rectangle rect1 = new Rectangle(34, 23); // created an object of class Rectangle and passed the int paratemeter
													// to call parameterized constructor
		System.out.println("area of rectangle is : " + rect1.calculateArea()); // called method calculateArea() using
																				// constructor
		System.out.println("perimeter of rectangle is : " + rect1.calculatePerimeter()); // called method
																							// calculateArea() using
																							// constructor

	}

}
