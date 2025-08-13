package BinaryTree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        binarySearchTree tree=new binarySearchTree();
        binarySearchTree tr=new binarySearchTree();
        int[] arr={1,2,3,4,5,6,7,8};
        tree.srtdPopulateEff(arr);
        tree.prettyPrint();
    }
}
