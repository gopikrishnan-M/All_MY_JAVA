package BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BSTree tree=new BSTree();
        for (int i = 0; i <=20; i++) {
            tree.insert(i);
        }
        tree.display();
        System.out.println(tree.balanced());
        tree.inOrder(tree.getRoot());
//        BSTree binarySearchTree=new BSTree();
//        binarySearchTree.srtdPopulate(new int[] {1,2,3,4,5,6,7,8,9,10});
//
//        binarySearchTree.inOrder(binarySearchTree.getRoot());
//        System.out.println();
//        binarySearchTree.preOrder(binarySearchTree.getRoot());
//        System.out.println();
//        binarySearchTree.postOrder(binarySearchTree.getRoot());
    }
}
