package BinaryTree;

import java.util.*;

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

    //finds the maximum height of tree
    //this is only created for bfslevelAdder 😅
    public int maxHeight(){
        return maxHeight(this.root,0);
    }
    private int maxHeight(Node node,int max){
        if(node==null) return max;
        max=Math.max(max, node.height);
        maxHeight(node.left,max);
        maxHeight(node.right,max);
        return max;
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

    //contains method for tree
    public boolean contains(int num){
        return contains(this.root,num);
    }
    private boolean contains(Node node,int target){
        if (node == null) {
            return false;
        }
        return node.value==target||contains(node.left,target)||contains(node.right,target);
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

    //***********************************************************************//
    //**************Tree questions kunal ************************************//

    //BFS SUM OF EACH LEVEL - just giving it a try this may not be the good approach
    public void myBfsAdder(){
        int max=maxHeight();
        int[] arr=new int[max];
        myBfsAdder(arr,this.root,0);
        for(int i=0;i<arr.length;i++){
            System.out.println("sum of level "+ i + " is " + arr[i]);
        }
    }
    private void myBfsAdder(int[] arr,Node node,int ht){
        if (node == null) {
            return;
        }
        arr[ht]+= node.value;
        myBfsAdder(arr,node.left,ht+1);
        myBfsAdder(arr,node.right,ht+1);
    }

//    public void BFStraversal(){
//        Queue<Node> trav=new LinkedList<>();
//        trav.add(this.root);
//        this.BFStraversal(this.root,trav);
//    }
//    private void BFStraversal(Node node ,Queue<Node> traverse){
//        if (node == null) {
//            return;
//        }
//        System.out.println(traverse.remove().value);
//        traverse.add(node.left);
//        traverse.add(node.right);
//
//    }

    //simply does breath first search
    public void BFS(){
        for(List<Integer> level:BFS(this.root)){
            System.out.println(level);
        }
    }
    private List<List<Integer>> BFS(Node root){
        List<List<Integer>> result=new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);//similar to add but better than it returns false when given value is not added to the queue
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> currentLevel=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                Node cnode=queue.poll();
                currentLevel.add(cnode.value);
                if (cnode.left != null) {
                    queue.offer(cnode.left);
                }
                if (cnode.right != null) {
                    queue.offer(cnode.right);
                }
            }
            result.add(currentLevel);
        }
            return result;
    }


    //calculates the average of the level and prints that value
    public void BFSAverage(){
        System.out.println(BFSAverage(this.root));
    }
    private List<Integer> BFSAverage(Node root){
        List<Integer> result=new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);//similar to add but better than it returns false when given value is not added to the queue
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            int sum=0;
            for(int i=0;i<levelSize;i++){
                Node cnode=queue.poll();
                sum+=cnode.value;
                if (cnode.left != null) {
                    queue.offer(cnode.left);
                }
                if (cnode.right != null) {
                    queue.offer(cnode.right);
                }
            }
            result.add(sum/levelSize);
        }
        return result;
    }

    //gives the level order successor for a give node i.e the element next to it in a given binary tree
    public Node levelOrderSuccessor(Node root,Node node){
        if (root == null) {
            return node;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node cnode=queue.poll();
            if (cnode.left != null) {
                queue.offer(cnode.left);
            }
            if (cnode.right != null) {
                queue.offer(cnode.right);
            }
            if (cnode.value == node.value) {
                break;
            }

        }

        return queue.peek();
    }

    //zig-zag traversal of tree Nailed it🔥 in mah first try 🥶🥶🥶
    public List<List<Integer>> zigZag(){
        return zigZag(this.root);
    }
    private List<List<Integer>> zigZag(Node root){
        List<List<Integer>> result=new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> deque=new LinkedList<>();
        deque.offer(root);
        boolean forward=true;
        while (!deque.isEmpty()) {
            int levelSize=deque.size();
            List<Integer> currentLevel=new ArrayList<>();
            if (forward) {
                for(int i=0;i<levelSize;i++){
                    Node cnode=deque.removeFirst();
                    currentLevel.add(cnode.value);
                    if (cnode.left != null) {
                        deque.addLast(cnode.left);
                    }
                    if (cnode.right != null) {
                        deque.addLast(cnode.right);
                    }
                }
                result.add(currentLevel);
            }
            else {
                for (int i = 0; i < levelSize; i++) {
                    Node cnode=deque.removeLast();
                    currentLevel.add(cnode.value);
                    if (cnode.right != null) {
                        deque.addFirst(cnode.right);
                    }
                    if (cnode.left != null) {
                        deque.addFirst(cnode.left);
                    }
                }
                result.add(currentLevel);
            }
            forward=!forward;
        }
        return result;
    }

    // in LEETCODE populating next right  pointer int the tree of its level
    //.....


    // right side view
    public List<Integer> rightSideView(){
        return rightSideView(this.root);
    }
    private List<Integer> rightSideView(Node root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                Node cnode=queue.poll();
                if(cnode.left!=null){
                    queue.offer(cnode.left);
                }
                if(cnode.right!=null){
                    queue.offer(cnode.right);
                }
                if(i==levelSize-1){
                    ans.add(cnode.value);
                }
            }
        }
        return ans;
    }


    //given values are cousins  or not

    public boolean areCousins(int x,int y){
        return areCousins(this.root,x,y);
    }
    private boolean areCousins(Node root,int x,int y){
        Node xx=findNode(root,x);
        Node yy=findNode(root,y);

        return level(root,xx,0)==level(root,yy,0) && (!isSibling(root,xx,yy));
    }
    private Node findNode(Node node,int target){
        if (node == null) {
            return null;
        }
        if(node.value==target){
            return node;
        }
        Node n=findNode(node.left,target);
        if (n != null) {
            return n;
        }
        return findNode(node.right,target);
    }

    private boolean isSibling(Node node,Node x,Node y){
        if (node == null) {
            return false;
        }
        return (
                (node.left==x && node.right==y)
                ||(node.left==y && node.right==x)
                || isSibling(node.left,x,y)
                || isSibling(node.right,x,y)
                );
    }

    private int level(Node node,Node x,int lev){
        if (node == null) {
            return 0;
        }
        if (node == x) {
            return lev;
        }
        int l=level(node.left,x,lev+1);
        if (l != 0) {
            return l;
        }
        return level(node.right,x,lev+1);

    }

    //Symmetric tree or not
    public boolean isSymmetric(){
        return isSymmetric(this.root);
    }

    private boolean isSymmetric(Node root) {
        if (root == null) {
            return false;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            Node left=queue.poll();
            Node right=queue.poll();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.value != right.value) {
                return false;
            }
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }

    //********************************************************************************
    //***********************DEPTH FIRST SEARCH **************************************
    //********************************************************************************
    //  #dfs has basically types of traversal they are preorder,post order ,in order


    //below one we will solve using inorder
    private int longest;
    public int maxDiameter(){
        return maxDiameter(this.root);
    }
    private int maxDiameter(Node root) {
        depth(root);
        return longest;
    }
    private int depth(Node node){
        if (node == null) {
            return 0;
        }
        int left=depth(node.left);
        int right=depth(node.right);

        longest=Math.max(longest,left+right);
        return Math.max(left,right)+1;
    }


    //invert a binary tree
    public Node invert(){
        return invert(this.root);
    }
    private Node invert(Node node){
        if (node == null) {
            return null;
        }
        Node left=invert(node.left);
        Node right=invert(node.right);
        node.left=right;
        node.right=left;
        return node;
    }


    //maximum height length of path from root to any leaf
    public int maximumHeight(){
        return maximumHeight(this.root);
    }

    private int maximumHeight(Node node) {
        if (node == null) {
            return 0;
        }
        int left=maximumHeight(node.left);
        int right=maximumHeight(node.right);
        return Math.max(left,right)+1;
    }

    //FLATTEN BINARY TREE i.e into a linked list
    //this is a easy wey to understand but does not meet the requirements check flattenEff
    public void flatten(){
        flatten(this.root);
    }
    private void flatten(Node root) {
        Queue<Node> queue=new LinkedList<>();
        helper(queue,root);
        Node node=queue.poll();
        while(!queue.isEmpty()){
            node.right=queue.poll();
            node.left=null;
            node=node.right;
        }
    }
    private void helper(Queue<Node> queue,Node node){
        if(node==null){
            return;
        }
        queue.offer(node);
        helper(queue,node.left);
        helper(queue,node.right);
    }

    //flatten efficient
    public void flattenEff(){
        flattenEff(this.root);
    }
    private void flattenEff(Node root){
        if (root == null) {
            return;
        }
        Node current=root;
        while (current != null) {
            Node temp=current.left;
            if (temp != null) {
                while (temp.right != null) {
                    temp=temp.right;
                }
                temp.right=current.right;
                current.right=current.left;
                current.left=null;
            }
            current=current.right;
        }
    }

    // check the tree is valid BST or not
    public boolean isValidBST(){
        return isValidBST(this.root,null,null);
    }

    private boolean isValidBST(Node node,Integer low,Integer high) {
        if (node == null) {
            return true;
        }
        if (low != null && node.value <= low) {
            return false;
        }
        if (high != null && node.value >= high) {
            return false;
        }
        boolean left=isValidBST(node.left,low,node.value);
        boolean right=isValidBST(node.right,node.value,high);

        return left && right;
    }

    //lowest common ansister this means two nodes should have a common ansister ,of course root will be ansister but we
    //should find a node which is as lower as possible close to those two given nodes and also they should be the ansister
    public Node lowestCommonAnsister(Node x,Node y){
        return lowestCommonAnsister(this.root,x,y);
    }

    private Node lowestCommonAnsister(Node node,Node x,Node y) {
        if (node == null) {
            return null;
        }
        if (node == x || node == y) {
            return node;
        }
        Node left=lowestCommonAnsister(node.left,x,y);
        Node right=lowestCommonAnsister(node.right,x,y);
        if (left != null && right != null) {
            return node;
        }
        return left==null?right:left;
    }

    // find the kth smalllest element in a binary search tree
    //can easily be done with inorder traversal of tree and add it in the list finally get the kth element from the list
    public int kthSmallestBrute(int k){
        return kthSmallestBrute(this.root,k);
    }

    private int kthSmallestBrute(Node root, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        kthSmallestBrute(root,minHeap);
        //remove k elements
        int ans=0;
        for (int i = 0; i < k; i++) {
            ans=minHeap.poll();
        }
        return ans;
    }

    private void kthSmallestBrute(Node node, PriorityQueue<Integer> minHeap) {
        if (node == null) {
            return;
        }
        kthSmallestBrute(node.left,minHeap);

        minHeap.offer(node.value);

        kthSmallestBrute(node.right,minHeap);
    }

    // lets see the efficient one
    private int count=0;
    public int kthSmallest(int k){
        return kthSmallest(this.root,k).value;
    }
    private Node kthSmallest(Node node, int k) {
        if (node == null) {
            return null;
        }
        Node left=kthSmallest(node.left,k);
        if (left != null) {
            return left;
        }
        count++;
        if (count == k) {
            return node;
        }
        return kthSmallest(node.right,k);

    }

    //BINARY TREE SERIALIZE AND DE SERIALIZE ***** VERY *****VERY *********IMPORTANT*********
    public List<String> serialize(){
        List<String> list=new ArrayList<>();
        serialize(this.root,list);
        return list;
    }
    private void serialize(Node node, List<String> list) {
        if (node == null) {
            list.add("null");
        }
        list.add(String.valueOf(node.value));
        serialize(node.left,list);
        serialize(node.right,list);
    }
    public Node deserialize(List<String> list){
        Collections.reverse(list);//reversing save time and reduce complexity coz
        //after every remove every element should be moved front but if we reverse and remove then no issue
        return deserializer(list);
    }
    private Node deserializer(List<String> list) {
        String val=list.remove(list.size()-1);
        if (val.charAt(0) == 'n') {
            return null;
        }
        Node node=new Node(Integer.parseInt(val));
        node.left=deserializer(list);
        node.right=deserializer(list);
        return node;
    }


    //************ PATH SUM QUESTIONS ****************
    public boolean hasPathsum(int target){
        return hasPathsum(this.root,target);
    }
    private boolean hasPathsum(Node node, int target) {
        if (node == null) {
            return false;
        }
        if (node.value == target && node.left == null && node.right == null) {
            return true;
        }
        return hasPathsum(node.left,target-node.value) || hasPathsum(node.right,target-node.value);
    }

//take digits from root to leaves and sum all the values and return
    public int sumOfRootToLeaves(){
        return sumOfRootToLeaves(this.root,0);
    }
    private int sumOfRootToLeaves(Node node,int sum){
        if (node == null) {
            return 0;
        }
        sum=sum*10+node.value;
        if (node.left == null && node.right == null) {
            return sum;
        }
        int left=sumOfRootToLeaves(node.left,sum);
        int right=sumOfRootToLeaves(node.right,sum);
        return left+right;
    }

    //HARD PROBLEM RETURN THE MAXIMUM SUM PATH (the path not necessarily contain root)
    private int answer=Integer.MIN_VALUE;
    public int maximumSumPath(){
        maximumSumPath(this.root);
        return answer;
    }

    private int maximumSumPath(Node node) {
        if (node == null) {
            return 0;
        }
        int left=maximumSumPath(node.left);
        int right=maximumSumPath(node.right);

        left=Math.max(0,left);
        right=Math.max(0,right);

        int pathsum= left+right+node.value;
        answer=Math.max(answer,pathsum);
        return Math.max(left,right)+node.value;
    }

    //find path exist in the tree or not question by kunal
    public boolean findPath(int[] arr){
        return findPath(this.root,arr,0);
    }

    private boolean findPath(Node node, int[] arr,int position) {
        if (node == null) {
            return false;
        }
        if (position>=arr.length || arr[position] != node.value) {
            return false;
        }
        if (node.left == null && node.right == null && position == arr.length - 1) {
            return true;
        }
        return findPath(node.left,arr,position+1) ||findPath(node.right,arr,position+1);
    }

    //return the total number of paths that exists for the given totalvalue
    //this is clearly a savage i didn't even solve it i just simply typed this from kunal and just trying ot understand
    public int numberOfPathSum(int val){
        List<Integer> path=new ArrayList<>();
        return numberOfPathSum(this.root,val,path);
    }

    private int numberOfPathSum(Node node, int sum, List<Integer> path) {
        if (node == null) {
            return 0;
        }
        path.add(node.value);
        int count=0;
        int s=0;
        // how many paths can be made from current obtained path
        ListIterator<Integer> iterator=path.listIterator(path.size());
        while(iterator.hasPrevious()){
            s+= iterator.previous();
            if (s == sum) {
                count++;
            }
        }
        count+=numberOfPathSum(node.left,s,path)+numberOfPathSum(node.right,s,path);
        //backtrack
        path.remove(path.size()-1);
        return count;

    }
    //let's print and see the below function
    public void preInPrint(int[] preOrder,int[] inOrder){
        Node root=preIn(preOrder,inOrder);
        prettyPrint(root,0);
    }

    //building tree using array of integers of preorder and inorder
    private int index=0;// this is the global index value of preorder traversing array we can even pass this as argument
    private Node preIn(int[] preOrder,int[] inOrder){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i],i);//mapping the value to its index 🤯 so, when we ask for index it will return
            //the index without even thinking i.e O(1) time complexity
        }
            return preIn(inOrder,preOrder,0,inOrder.length-1,map);
    }
    private Node preIn(int[] inOrder, int[] preOrder, int left, int right, HashMap<Integer, Integer> map) {
        if (left > right) {//the left and right pointers help in traversal of inorder array but without even traversing
            return null;
        }
        int current=preOrder[index++]; //get the integer value of current int in preorder
        Node node=new Node(current);//with tat value make a node
        if (left == right) {
            return node;
        }
        int mapIndex=map.get(current);//this is the inorder index which improves eff by hash map
        //in constant time  rather than completely traversing the array
        node.left=preIn(inOrder,preOrder,left,mapIndex-1,map);
        node.right=preIn(inOrder,preOrder,mapIndex+1,right,map);
        return node;

    }
    //vertical order traversal of tree
    //here we can use hash map also but ,it won't store it in sorted order so, we will maintain a minimum
    //and a maximum value and use  loop to traverse from min to max and get the nodes in it
    //as we move left and right we will -1 and +1 respectively
    //there instead of using a "Map.Entry<Node,Integer>" we can simply use a class specific for that
    /*
     class pair{
      Node node;
      int col;

       private pair(Node node,int col){
            this.node=node;
            this.col=col;
       }
      }
     */
    public List<List<Integer>> verticalTraversal(){
        return verticalTraversal(this.root);
    }

    private List<List<Integer>> verticalTraversal(Node node) {
        List<List<Integer>> ans=new ArrayList<>();
        if(node==null){
            return ans;
        }
        int col=0;

        Queue<Map.Entry<Node,Integer>> queue=new ArrayDeque<>();
        Map<Integer,ArrayList<Integer>> indexToList =new HashMap<>();

        queue.offer(new AbstractMap.SimpleEntry<>(node,col));

        int min=0;
        int max=0;

        while (!queue.isEmpty()) {
            Map.Entry<Node,Integer> removed=queue.poll();
            node=removed.getKey();
            col=removed.getValue();

            if (node != null) {
                if (!indexToList.containsKey(col)) {
                    indexToList.put(col,new ArrayList<Integer>());
                }
                indexToList.get(col).add(node.value);

                min=Math.min(min,col);
                max=Math.max(max,col);

                queue.offer(new AbstractMap.SimpleEntry<>(node.left,col-1));
                queue.offer(new AbstractMap.SimpleEntry<>(node.right,col+1));
            }
        }

        for (int i = min; i <=max; i++) {
            ans.add(indexToList.get(i));
        }
        return ans;
    }

    //WORD LADDER LEETCODE
    public int ladderLenght(String start,String end,List<String> words){
        if(!words.contains(end)){
            return 0;
        }
        Set<String> visited=new HashSet<>();
        Queue<String> queue=new LinkedList<>();

        queue.offer(start);
        int lenght=0;
        while (!queue.isEmpty()) {
            int size= queue.size();
            lenght++;

            for(int i=0;i< size;i++){
                String current= queue.poll();

                for(int j=0; j<current.length();j++){
                    char[] temp=current.toCharArray();
                    for(char ch='a'; ch<='z';ch++){
                        temp[j]=ch;
                        String nWord=new String(temp);
                        if(nWord.equals(end)){
                            return lenght+1;
                        }
                        if(words.contains(nWord) && !visited.contains(nWord)){
                            queue.offer(nWord);
                            visited.add(nWord);
                        }
                    }
                }
            }
        }
        return 0;
    }

    //TWO-IV
    public boolean twoSum(Node root,int k){
        HashSet<Integer> set=new HashSet<>();
        return twoSum(root,k,set);
    }

    private boolean twoSum(Node node, int k, HashSet<Integer> set) {
        if (node == null) {
            return false;
        }
        if (set.contains(k - node.value)) {
            return true;
        }
        set.add(node.value);
        return twoSum(node.left,k,set) || twoSum(node.right,k,set);
    }

    // two nodes swapped in a bst
    Node first;
    Node second;
    Node prev;
    public void twoNodesSwapped(Node node){
        if (node == null) {
            return ;
        }
        twoNodesSwapped(node.left);

        if (prev != null && prev.value > node.value) {
            if (first == null) {
                first =prev;
            }
            second=node;
        }
        prev=node;

        twoNodesSwapped(node.right);
    }
    
    

}
// planning to create methods for deletion with reabalancing
