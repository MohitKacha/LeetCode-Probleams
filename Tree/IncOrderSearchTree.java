package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncOrderSearchTree {
  private class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int val;

    public TreeNode(int value) {
      this.val = value;
    }
  }

  TreeNode current;

  public TreeNode increasingBST(TreeNode root) {

    TreeNode newNode = new TreeNode(0);
    current = newNode;
    inOrderTraverse(root);

    return newNode.right;
  }

  private void inOrderTraverse(TreeNode root) {
    if (root == null) return;
    inOrderTraverse(root.left);
    current.left = null;
    current.right = root;
    current = root;
    inOrderTraverse(root.right);
  }
}
