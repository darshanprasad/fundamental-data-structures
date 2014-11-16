package datastructures.LinkedList;

/**
 * Linked List (singly) implementation.
 * 
 * @param <T> The type of data stored in the list.
 * @author Darshan Prasad
 */
public class LinkedList<T> {
    LinkedListNode<T> head;
    
    /**
     * Add node to list.
     * @param node 
     */
    public void add(LinkedListNode<T> node) {
        // Empty list? node becomes head.
        if (head == null) {
            head = node;
        } else {
            // Iterate through list; append to tail node.
            LinkedListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            
            current.setNext(node);
            node.setNext(null);            
        }
    }
    
    /**
     * Accepts node + value for duplicates.
     * @param node
     * @param value
     * @return The node that was removed.
     */
    public LinkedListNode remove(LinkedListNode<T> node, T value) {
        // Case 1: Empty list, return null.
        if (head == null) return null;
        
        // Case 2: Remove head node.
        if (head == node && head.getValue() == value) {
            if (head.getNext() == null) {
                head = null;
            } else {
                head = head.getNext();
            }
            
            return node;
        }
        
        // Case 3: Remove non-head node.
        LinkedListNode current = head;
        LinkedListNode returnNode;
        
        while (current != null && current.getNext() != node) {
            current = current.getNext();
        }
        
        if (current == null) {
            return null;
        } else {
            if (current.getNext().getValue() == value) {
                returnNode = current.getNext();
                current.setNext(current.getNext().getNext());

                return returnNode;                
            }
        }
        
        return null;
    }
    
    /**
     * Simple String representation for testing.
     * @return String form of list.
     */
    @Override
    public String toString() {
        if (head != null) {
            LinkedListNode current = head;
            StringBuilder sb = new StringBuilder();
            
            while (current != null) {
                sb.append(current.getValue().toString());
                sb.append("->");
                current = current.getNext();
            }
            
            sb.append("end");
            
            return sb.toString();
        }
        
        return null;
    }
}
