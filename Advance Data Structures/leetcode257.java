
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class leetcode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) dfs(root, "", paths);
        return paths;
    }

    private void dfs(TreeNode node, String path, List<String> paths) {
        path += node.val;
        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            path += "->";
            if (node.left != null) dfs(node.left, path, paths);
            if (node.right != null) dfs(node.right, path, paths);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        leetcode257 solution = new leetcode257();
        System.out.println(solution.binaryTreePaths(root)); 
    }
}
