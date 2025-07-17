package BinaryTree;

public class Main {
    public static void main(String[] args) {
        binarySearchTree tree=new binarySearchTree();
        int[] arr={10,7,12,5,9,11,13};
        tree.populate(arr);
        tree.prettyPrint();
        tree.BFS();
        tree.BFSAverage();
    }
}
