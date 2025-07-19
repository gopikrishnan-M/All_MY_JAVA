package BinaryTree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        binarySearchTree tree=new binarySearchTree();
        int[] arr={1,2,3,4,5,6,7};
        tree.populate(arr);
        tree.prettyPrint();
        int value=tree.kthSmallest(5);
        System.out.println(value+" thats it");
    }
}
