package BinaryTree;

import java.util.Arrays;

public class binarySearchTree {
    //constructor
    public binarySearchTree() {//constructor
    }

    // inner class node
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left=null;
            this.right=null;
            this.height=1;
        }

        public int getValue(){
            return value;
        }


    }

    //simply a variable with Node data type
    private Node root;

    //can call this function to get the root as Node data type
    public Node getRoot() {
        return root;
    }

    // Get height of a node
    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    //says weather the tree is empty or not
    public boolean isEmpty(){
        return root == null;
    }

    //display order wise
    public void display(){
        display(root," Root Node: ");
    }
    private void display(Node node ,String details){
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left,"Left child of " + node.getValue() + " : ");
        display(node.right,"right child of " + node.getValue() + " : ");
    }

    //custom-made by me
    public void show(){
        show(root,"root node : ");
    }
    private void show(Node node, String info){
        if(node==null) return;
        int ht= height(node)-1;
        System.out.println(info + node.value + " height is : " + ht);
        System.out.println();
        show(node.left,"left child of " + node.value + " is : ");
        show(node.right,"right child of " + node.value + " is : ");

    }

    //insert array of elemets
    public void populate(int[] arr){
        for(int n:arr){
            this.insert(n);
        }
    }

    //insert element into tree while maintaining the balance
    public void srtdPopulate(int[] arr){//this occupies lot memory space but logically works good
        if(arr.length==0) return;
        int n=arr.length;
        this.insert(arr[n/2]);
        srtdPopulate(Arrays.copyOfRange(arr,0,n/2));
        srtdPopulate(Arrays.copyOfRange(arr,n/2+1,n));
    }

    //this is an alternative for the above one which is efficient in terms of memory
    public void srtdPopulateEff(int[] arr){
        srtdPopulateEff(arr,0,arr.length);
    }
    private void srtdPopulateEff(int[] arr,int s,int e){
        if(s>=e) {
            return;
        }

        int mid=(s+e)/2;
        this.insert(arr[mid]);

        srtdPopulateEff(arr,s,mid);//call the left half
        srtdPopulateEff(arr,mid+1,e);//call the right  half

    }

    //insert function
    public void insert(int value){
        root=insert(value,root);
    }
    private  Node insert(int value,Node node){
        if (node == null) {
            return new Node(value);
        }
        // if the value is lesser than the current node then move left
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        //if the value is greater it will move right
        else if (value > node.value) {
            node.right=insert(value,node.right);
        }
        //if equal then do nothing just return the node at which it is
        else{
            return node;
        }
        updateHeight(node);
        return rotate(node);
    }

    // Update height of a node
    private void updateHeight(Node node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }

    // Get balance factor i.e left minus right
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    //check all four cases and rotate
    private Node rotate(Node node) {
        int balance=getBalance(node);

        if (balance > 1) {// Left-heavy case
            if (getBalance(node.left)<0)
                node.left=leftRotate(node.left);//LR case
            return rightRotate(node);//LL case here is the good part what ever happen this will be executed
            //if lr then left rotate and right rotate else only right rotate
        }

        else if (getBalance(node)< -1) {// Right-heavy case
            if (getBalance(node.right)>0)
                node.right=rightRotate(node.right);//RL
            return leftRotate(node);//RR
        }

        return node;// No rotation needed
    }

    //makes right rotation and return the C node
    private Node rightRotate(Node p){
        Node c=p.left;
        Node t=c.right;

        p.left=t;
        c.right=p;

        updateHeight(p);
        updateHeight(c);
        return c;
    }

    //makes left rotation and return the P node
    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        c.right = t;
        p.left = c;

        updateHeight(p);
        updateHeight(c);
        return p;
    }

    //checks the complete tree is balanced or not
    public boolean checkBalance(){
        return checkBalance(root);
    }

    //you can specifically check weather the tree is balanced from a node to leaf
    public boolean checkBalance(Node node){
        if (node == null) return true;
        boolean currBal=Math.abs(getBalance(node)) <= 1;
        boolean leftBal=checkBalance(node.left);
        boolean rightBal=checkBalance(node.right);
        return currBal && leftBal && rightBal;
    }

    //efficient version does same thing what above one does
    public boolean checkBalanceEff() {
        return checkBalanceEff(root) != -1;
    }
    private int checkBalanceEff(Node node) {
        if (node == null) return 0; // Height of null is 0

        int leftHeight = checkBalanceEff(node.left);
        if (leftHeight == -1) return -1; // Left subtree is unbalanced

        int rightHeight = checkBalanceEff(node.right);
        if (rightHeight == -1) return -1; // Right subtree is unbalanced

        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // Current node is unbalanced

        return Math.max(leftHeight, rightHeight) + 1; // Return height
    }

    //just print the tree in its form
    public void prettyPrint(){
        prettyPrint(root,0);
    }
    private void prettyPrint(Node node, int level){
        if(node==null) return;

        prettyPrint(node.right,level+1);//move to right end

        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t");
            }
            System.out.println("|-->"+node.value);
        }
        else{
            System.out.println(node.value);
        }
        prettyPrint(node.left,level+1);
    }

    //Node ,left ,right
    public void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.value+",");
        preOrder(node.left);
        preOrder(node.right);
    }

    //left ,node ,right
    public void inOrder(Node node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+",");
        inOrder(node.right);
    }

    //Left ,right ,node
    public void postOrder(Node node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+",");
    }
}
/*
* 💡 Optional Enhancements
A. Add a delete(int value) method
If you’re aiming for full AVL functionality, consider implementing deletion with rebalancing.

B. Add a contains(int value) method
To quickly check if a value exists in the tree — useful for testing and usability.

C. Consider toString() or array conversion
For serialization or comparisons, you might return the tree as an in-order list or string
* */
