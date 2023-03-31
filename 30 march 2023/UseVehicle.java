/*Que3. Create a Parent class "Vehicle" with attributes such as brand,model,year,and a method called "drive".Create a child class called "Car" that inherits from
         Vehicle and has additional attribute called "color" and a method called "Type". Create an object of the cCar class and call both the "drive" and "Type" methods*/

class Vehicle // create a parent class Vehicle
{
	String brand; // created attributes or data members in parent class Vehicle
	String model;
	int year;

	void drive(String brand, String model, int year) // created a method Drive within parent class Vehicle and passed
														// attribute to it
	{
		this.brand = brand;
		this.model = model;
		this.year = year;
		System.out.println("I love to buy vehicle");
		System.out.println("favorite Vehicle is " + brand + " " + model + " launch in :" + year);
	}
}

class Car extends Vehicle // create a child class Car inherited the parent class Vehicle
{
	String color; // created attribute here

	void type(String color) // created a type()method and pass the attribute over here
	{
		this.color = color;
		System.out.println("This is a car and it comes in " + color + " color");
	}

}

public class UseVehicle // here created a main class here
{

	public static void main(String[] args) // here is the main method for program execution
	{
		Car car = new Car(); // created an object of child class Car

		car.drive("Audi", "Q3", 2010); // Calling method from the parent class and initialized the attribute of parent
										// class vehicle
		car.type("White"); // Calling method from the child class and initialized the attribute of chile
							// class Car.

	}

}
