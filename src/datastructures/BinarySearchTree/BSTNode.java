package datastructures.BinarySearchTree;

/**
 * Encapsulating structure for data.
 * @author Darshan Prasad
 */
public class BSTNode {
    
    private int value;
    private BSTNode left;
    private BSTNode right;
    
    public BSTNode(int val) {
        value = val;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int val) {
        value = val;
    }
    
    public BSTNode getLeft() {
        return left;
    }
    
    public void setLeft(BSTNode node) {
        left = node;
    }
    
    public BSTNode getRight() {
        return right;
    }
    
    public void setRight(BSTNode node) {
        right = node;
    }
}
