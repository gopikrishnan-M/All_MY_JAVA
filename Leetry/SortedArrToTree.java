package Leetry;

import BinaryTree.BSTree;

public class SortedArrToTree {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9};
        TreeNode ans=sortedArrToBST(arr,0,arr.length);
        display(ans,"root node : ");
    }
    private static TreeNode sortedArrToBST(int[] arr,int s,int e) {
        if(s>=e) {
            return null;
        }
        int mid=(s+e)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=sortedArrToBST(arr,s,mid);
        node.right=sortedArrToBST(arr,mid+1,e);
        return node;
    }

    private static void display(TreeNode node , String details){
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);
        display(node.left,"Left child of " + node.val + " : ");
        display(node.right,"right child of " + node.val + " : ");
    }
}

class TreeNode {




    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

