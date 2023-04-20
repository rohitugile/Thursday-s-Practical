/*Write a java program to create an ArrayList (Name of Vehicles) with 10 elements and do the following things:
1. Print the ArrayList.
2. Iterate through the Array List and print the arraylist
3. Insert an element at start and end of arraylist.
4. retrieve an element at index number 4.
5. update the element at index number  7 with vehicle name XUV300.
6. Search for the element "verna" if it is found just print 'found the vehicle' else print 'not found'
7. Copy this arraylist to the new arraylist */

package April20;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
       
        ArrayList<String> vehicles = new ArrayList<>();		 // Creating an ArrayList of vehicles
        vehicles.add("Hyundai i10");								// Adding elements to the ArrayList
        vehicles.add("Tata");
        vehicles.add("Swift");
        vehicles.add("Creta");
        vehicles.add("XUV500");
        vehicles.add("Fortuner");
        vehicles.add("Honda City");
        vehicles.add("Verna");
        vehicles.add("Range Rover");
        vehicles.add("Audi");

        System.out.println("ArrayList of Vehicles: " + vehicles);		 // 1. Print the ArrayList

        
        System.out.println("ArrayList:");			
        for (String vehicle : vehicles) {			// 2. Iterate through the ArrayList
            System.out.println(vehicle);			// 2. Printing the ArrayList
        }

        vehicles.add(0, "BMW");					 // 3. Insert an element at the start of the ArrayList
        vehicles.add("Rolls Royce");						 // 3. Insert an element at the end of the ArrayList

        String vehicleAtIndex4 = vehicles.get(4);						    // 4. Retrieve an element at index number 4	
        System.out.println("Vehicle at index 4: " + vehicleAtIndex4);

        vehicles.set(7, "XUV300");						// 5. Update the element at index number 7 with vehicle name XUV300

        
        if (vehicles.contains("Verna")) {				// 6. Searching for "verna" if it is found just print 'found the vehicle' else print 'not found'
            System.out.println("Found the vehicle");
        } else {
            System.out.println("Not found");
        }
        
        ArrayList<String> vehicles2 = new ArrayList<>(vehicles);	 // 7. Copy this ArrayList vehicles to a new ArrayList vehicles2
        System.out.println("Copied ArrayList: " + vehicles2);
    }
}
