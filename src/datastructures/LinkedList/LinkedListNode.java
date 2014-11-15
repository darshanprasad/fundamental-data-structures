package datastructures.LinkedList;

/**
 * Encapsulating structure for data.
 * 
 * @param <T> The type of value stored in the node.
 * @author Darshan Prasad
 */
public class LinkedListNode<T> {
    T value;
    LinkedListNode next;
    
    public LinkedListNode(T val) {
        value = val;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T val) {
        value = val;
    }
    
    public LinkedListNode getNext() {
        return next;
    }
    
    public void setNext(LinkedListNode node) {
        next = node;
    }
}
