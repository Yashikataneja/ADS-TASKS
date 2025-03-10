import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class leetcode105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inToIndex = new HashMap<>();
        for (int i = 0; i < inorder.length; ++i)
            inToIndex.put(inorder[i], i);

        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inToIndex);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart,
                           int inEnd, Map<Integer, Integer> inToIndex) {
        if (preStart > preEnd)
            return null;

        int rootVal = preorder[preStart];
        int rootInIndex = inToIndex.get(rootVal);
        int leftSize = rootInIndex - inStart;

        TreeNode root = new TreeNode(rootVal);
        root.left = build(preorder, preStart + 1, preStart + leftSize, inorder, inStart,
                          rootInIndex - 1, inToIndex);
        root.right = build(preorder, preStart + leftSize + 1, preEnd, inorder, rootInIndex + 1, inEnd,
                           inToIndex);

        return root;
    }

    public static void main(String[] args) {
        leetcode105 solution = new leetcode105();

        int[] preorder1 = {3, 9, 20, 15, 7};
        int[] inorder1 = {9, 3, 15, 20, 7};
        TreeNode root1 = solution.buildTree(preorder1, inorder1);
        printTree(root1);  

        int[] preorder2 = {-1};
        int[] inorder2 = {-1};
        TreeNode root2 = solution.buildTree(preorder2, inorder2);
        printTree(root2);  // Output: [-1]
    }

    private static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
 