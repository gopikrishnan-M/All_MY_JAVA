package SegmentTree;

public class SegmentTree {
//this is the node class that defindes the variables of the node object
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        //constructor for node only in this way node can be created
        public Node(int startInterval,int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }

        Node root;

//this is similar to populate function in the linked list simply what it does is creates a segment tree for an array
//the good part is that it is also the constructor for the segment tree class
        public SegmentTree(int[] arr){
            //create a tree using this array
            this.root=constructTree(arr,0,arr.length-1);
        }
        private Node constructTree(int[] arr,int start,int end){
            if(start==end){
                //this the end of the tree then it is the leaf node
                Node leaf= new Node(start,end);
                leaf.data=arr[start];
                return leaf;
            }

            //creating a new node wiht the index we are currently at
            Node node=new Node(start,end);// while begining we will have a complete array so we create node with full s,e
            //now we have to make 3 values data,left ,right
            int mid=(start+ end)/2;

            node.left=this.constructTree(arr,start,mid);//start to mid is left
            node.right=this.constructTree(arr,mid+1,end);//mid plus one to end is right

            node.data=node.left.data+node.right.data;//now sum of values of left and right is data of current node
            return node;
        }

//will display the segment tree in L => P => R
        public void display(){
            display(this.root);
        }
        private void display(Node node){
            String str="";
            if(node.left!=null){
                str=str+"Interval ["+node.left.startInterval+ "-" + node.left.endInterval +"],data: "+node.left.data + " => ";
            }
            else{
                str="null => ";
            }

            str=str+"Interval ["+node.startInterval+ "-" + node.endInterval +"],data: "+node.data + " => ";

            if(node.right!=null){
                str=str+"Interval ["+node.right.startInterval+ "-" + node.right.endInterval +"],data: "+node.right.data;
            }
            else str=str+"null";

            System.out.println(str);
            if(node.left!=null) display(node.left);
            if(node.right!=null) display(node.right);
        }

//request the querry and get the ans like sum of integers form the given interval
        public int querry(int qsi,int qei){
            return this.querry(this.root,qsi,qei);
        }
        private int querry(Node node,int qsi ,int qei){
            //here the node's interval is completely inside the requested querry
            if(node.startInterval>=qsi && node.endInterval<=qei){
                return node.data;
            }
            //here the node's interval either start after querry end or ends before querry starts i.e lies  completely outside
            else if(node.startInterval>qei || node.endInterval<qsi){
                return 0;
            }
            else{
                int leftSum=this.querry(node.left,qsi,qei);
                int rightSum=this.querry(node.right,qsi,qei);
                return leftSum+rightSum;
            }
        }

//now we are going to write an update function for the segment tree
        public void update(int index,int value){
            this.root.data=update(this.root,index,value);
        }
        private int update(Node node,int index, int value){
            if(index >= node.startInterval && index<=node.endInterval){
                if(index== node.startInterval && index == node.endInterval){
                    node.data=value;
                    return node.data;
                }
                else{
                    int leftAns=update(node.left,index,value);
                    int rightAns=update(node.right,index,value);

                    node.data=leftAns+rightAns;
                    return node.data;
                }
            }
            return node.data;
        }
}
