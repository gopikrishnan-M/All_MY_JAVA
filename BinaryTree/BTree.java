package BinaryTree;

import java.util.Scanner;

class BTree {

    public BTree() {
    }

    private class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    Node root;

    public void populate(Scanner scanner){
        System.out.print("Enter the value of root node : ");
        int val=scanner.nextInt();
        root=new Node(val);
        populate(scanner,root);
    }

    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter the value to the left of "+ node.val);
        boolean Left=scanner.nextBoolean();
        if(Left) {
            System.out.print("Enter the value of left node : ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter the value to the right of "+ node.val);
        boolean Rit=scanner.nextBoolean();
        if(Rit){
            System.out.print("Enter the value of right node : ");
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner , node.right);
        }
    }

    public void display(){
        display(root,"");
    }
    private void display(Node node,String space){
        if(node == null){
            return;
        }
        System.out.println(space+ node.val);
        display(node.left,space+"\t");
        display(node.right,space+"\t");
    }


    public void prettyPrint(){
        prettyPrint(root,0);
    }
    public void prettyPrint(Node node,int level){
        if(node==null) return;

        prettyPrint(node.right,level+1);//move to right end

        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.val);
        }
        else{
            System.out.println(node.val);
        }
        prettyPrint(node.left,level+1);
    }

    public void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.val+",");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+",");
        inOrder(node.right);
    }

    public void postOrder(Node node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+",");
    }

}
