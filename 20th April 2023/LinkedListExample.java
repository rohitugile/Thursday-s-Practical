/* Write a program to create a LinkedList(Colors) using collections in java and perform following operations on them:
1. Append "Red" at the end of the linked list
2. Iterate through all the elements of the linkedlist starting from the element 4
3. Iterate the linked list in the reverse order. */

package April20;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        
        LinkedList<String> colors = new LinkedList<>();  // creating a linked list of colors
        
        colors.add("Yellow");							// adding elements to the linked list
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Pink");
        colors.add("White");
        colors.add("Grey");
        colors.add("Purple");
        colors.add("Orange");
        colors.add("Brown");
        
        colors.addLast("Red");							 // 1. Appending "Red" at the end of the linked list
        
        System.out.println(colors);
        
        System.out.println("Elements from index 4 to end:" + colors.subList(4, colors.size( )));	 
        													//2. iterating through all the elements of the linked list from the element at index 4

        System.out.print("Elements in reverse order: ");			//3. Iterating the linked list in reverse order
        ListIterator<String> iterator = colors.listIterator(colors.size());
        while(iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
