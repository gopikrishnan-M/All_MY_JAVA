package BinaryTree;

public class BSTtoDoublyLinkedList {
    LLNode head;
    LLNode tail;

    public LLNode convertToLL(TreeNode root){
        if (root == null) {
            return null;
        }
        convertHelper(root);
        return head;
    }

    public void convertHelper(TreeNode node){
        if (node == null) {
            return;
        }
        convertHelper(node.left);
        LLNode current=new LLNode(node.val);
        if (head == null) {
             head=current;
             tail=current;
        }
        else{
            tail.next=current;
            current.prev=tail;
            tail=current;
        }
        convertHelper(node.right);
    }
}
class LLNode{
    int val;
    LLNode prev;
    LLNode next;

    public LLNode(int val){
        this.val=val;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
