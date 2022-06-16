/**
 * INVERT BINARY TREE
 * Level: Easy
 * 
 * Given the root of a binary tree, invert the tree, and return its root.
 */

package java.easy.treesgraphs;

public class InvertBinaryTree {
    // DFS Approach
    // Time Complexity: O(log(n))
    // Space Complexity: O(1)
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        
        invertTree(root.left);
        invertTree(root.right);
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        return root;
    }
}
