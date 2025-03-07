/* 
 * PROBLEM STATEMENT :
 * 
 * The diameter of a binary tree is the length of the        between any two nodes.
 * 
 * Approach : use recursion to find the height of the left and right subtrees.
 * 
 * Update the maximum diamter encountered.
 * 
 */



public class DiameterOfBinary {
    static int diameter=0;
    public static int doBT(TreeNode root){
        height(root);
        return diameter;

    }
    private static int height(TreeNode node){
        if(node==null) return 0;
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        diameter=Math.max(diameter,leftHeight+rightHeight);
        return 1+Math.max(leftHeight,rightHeight);

    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(1);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println(doBT(root));
    }

}
