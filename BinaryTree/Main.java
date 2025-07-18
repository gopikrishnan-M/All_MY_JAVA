package BinaryTree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        binarySearchTree tree=new binarySearchTree();
        int[] arr={10,7,12,5,9,11,13};
        tree.populate(arr);
        tree.prettyPrint();
        for(List<Integer> level:tree.zigZag()){
            System.out.println(level);
        }
    }
}
