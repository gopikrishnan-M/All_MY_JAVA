package BinaryTree;

public class Main {
    public static void main(String[] args) {
        binarySearchTree tree=new binarySearchTree();
        for (int i = 0; i <=100; i++) {
            tree.insert(i);
        }
        tree.prettyPrint();
    }
}
