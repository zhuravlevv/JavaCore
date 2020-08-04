package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(2);
        tree.add(3);
        tree.add(2);
        System.out.println(tree.contains(1));
        System.out.println(tree.contains(2));
        System.out.println(tree.contains(3));
        System.out.println(tree.contains(4));
    }
}
