public class SearchBinaryTree {
  private class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int val;

    public TreeNode(int value) {
      this.val = value;
    }
  }

  public TreeNode searchBST(TreeNode root, int val) {
      if (root == null) return root;
      if (root.val == val) return root;

      return (val < root.val) ? searchBST(root.left, val) : searchBST(root.right, val);
  }


}
