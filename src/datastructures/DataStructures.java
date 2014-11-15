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
        
        System.out.println("Add a third node:");
        LinkedListNode n3 = new LinkedListNode(7);
        list.add(n3);
        System.out.println(list.toString() + "\n\n");
        
        System.out.println("Add a fourth node:");
        LinkedListNode n4 = new LinkedListNode(10);
        list.add(n4);
        System.out.println(list.toString() + "\n\n");
        
        System.out.println("Remove a node:");
        list.remove(n2, (Integer) n2.getValue());
        System.out.println(list.toString() + "\n\n");
        
        System.out.println("Remove an end node:");
        list.remove(n4, (Integer) n4.getValue());
        System.out.println(list.toString() + "\n\n");
        
        System.out.println("Remove a head node:");
        list.remove(n1, (Integer) n1.getValue());
        System.out.println(list.toString() + "\n\n");
    }
    
}
