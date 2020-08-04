package Tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;

    public Tree() {
    }

    public void add(Integer value){
        root = addRecursive(value, root);
    }

    public boolean contains(Integer value){
        return containsRecursive(value, root);
    }

    private boolean containsRecursive(Integer value, Node current){
        if(current == null){
            return false;
        }
        if(value.equals(current.value)){
            return true;
        }
        return value < current.value
                ? containsRecursive(value, current.left)
                : containsRecursive(value, current.right);
    }

    private Node addRecursive(Integer value, Node current){
        if(current == null){
            return new Node(value);
        }

        if (value < current.value){
            current.left = addRecursive(value, current.left);
        }
        else{
            current.right = addRecursive(value, current.right);
        }

        return current;
    }

    public List<Node> getAll(){
        return new ArrayList<Node>();
    }

}

class Node {
     Node left;
     Node right;
     Integer value;

    public Node(Integer value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}