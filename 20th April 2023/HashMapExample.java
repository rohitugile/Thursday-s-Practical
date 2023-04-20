/* Write a program to create HashMap (Key-Value) of Students and perform following operations on it:
1. Check if the map contains the mapping for specified key(105)
2. Count the number of key-value(size) mapping in a map.
3. Copy the mapping from specified map to another map */

package April20;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<Integer, String> students = new HashMap<>();		// creating a HashMap of Students (Key-Value)
        
        students.put(101, "Rohit");			 // adding key-value mappings to the HashMap
        students.put(102, "Rahul");
        students.put(103, "Nikhil");
        students.put(104, "Vijay");
        students.put(105, "Ajay");
        
        if(students.containsKey(105)) {								//1. Check if the map contains the mapping for specified key(105)
            System.out.println("Map contains mapping for key 105");
        }
        else {
            System.out.println("Map doesn't contain mapping for key 105");
        }
        
        System.out.println("Number of key-value mappings in the map: " + students.size());	 // 2. counting the number of key-value mappings in the map
        
        HashMap<Integer, String> NewStudent = new HashMap<>(students);	  // 3. copying the mapping from specified map to another map
        System.out.println("Copy of the map: " + NewStudent);
    }
}
