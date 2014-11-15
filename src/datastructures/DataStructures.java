package datastructures;

import datastructures.LinkedList.*;

/**
 * Working with Data Structures
 * 
 * @author Darshan Prasad
 */
public class DataStructures {

    public static void main(String[] args) {
        // Linked Lists
        
        System.out.println("Add a head node:");
        LinkedList<Integer> list = new LinkedList();
        LinkedListNode n1 = new LinkedListNode(5);
        list.add(n1);
        System.out.println(list.toString() + "\n\n");
        
        System.out.println("Add a second node:");
        LinkedListNode n2 = new LinkedListNode(8);
        list.add(n2);
        System.out.println(list.toString() + "\n\n");
        
        System.out.println("Remove a head node:");
        list.remove(n1, (Integer) n1.getValue());
        System.out.println(list.toString() + "\n\n");
    }
    
}
