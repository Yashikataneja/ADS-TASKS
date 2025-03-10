import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int x){val=x;}
}



public class leetcode94 {
    //given the root of a binary tree, return its inorder traversal 
    
    //Approach : use Recursion (DFS) to traverse to the left subtree,
    //then we are going to visit root, and finally traverse the right subtree.

    public static List<Integer>inOrderTrav(TreeNode root){
        List<Integer>res=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null||!stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;

    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(1);
        root.right.left=new TreeNode(3);
        System.out.println(inOrderTrav(root));
    }
}
