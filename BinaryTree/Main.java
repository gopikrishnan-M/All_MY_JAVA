package BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BTree bt=new BTree();
        Scanner sc=new Scanner(System.in);
        bt.populate(sc);
        bt.prettyPrint();
    }
}
