public class RangeSumOfBST {
  private class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int val;

    public TreeNode(int value) {
      this.val = value;
    }
  }

  public int rangeSumBST(TreeNode root, int L, int R) {
    return sumBst(root, L, R);
  }

  /*
     DFS  Traverse
     Time O(n)
     Space O(h) h = height of tree
     Run Time  - 0 ms
  */
  private int sumBst(TreeNode root, int L, int R) {
    if (root == null) return 0;
    if (root.val > R) return sumBst(root.left, L, R);
    if (root.val < L) return sumBst(root.right, L, R);

    return root.val + sumBst(root.left, L, R) + sumBst(root.right, L, R);
  }
  /*
      DFS In-Order traverse
      Time O(n)
      Space O(h) h = height of tree
      Run Time  - 1 ms
  */
  private int sumBst2(TreeNode root, int L, int R) {
    if (root == null) return 0;
    var value = (root.val >= L && root.val <= R) ? root.val : 0;

    return value + sumBst(root.left, L, R) + sumBst(root.right, L, R);
  }
}
