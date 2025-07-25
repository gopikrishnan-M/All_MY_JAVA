package BinaryTree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        binarySearchTree tree=new binarySearchTree();
        int[] arr={10,8,12,7,9,11,13};
        tree.populate(arr);
        tree.prettyPrint();
        System.out.println(tree.verticalTraversal());

    }
}
