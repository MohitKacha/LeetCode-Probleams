public class MergeBinaryTree {
  private class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int val;

    public TreeNode(int value) {
      this.val = value;
    }
  }

  public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    if (root1 == null) return root2;
    if (root2 == null) return root1;

    /*
    I could merge t2 into t1 and get t1 node as final result, but it's not good idea to modified original tree
    so created new node and merge result into new Node.
     */

    TreeNode newNode = new TreeNode(root1.val + root2.val);
    newNode.left = mergeTrees(root1.left, root2.left);
    newNode.right = mergeTrees(root1.right, root2.right);

    return newNode;
  }
}
