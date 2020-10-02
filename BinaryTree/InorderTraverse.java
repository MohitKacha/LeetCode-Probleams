import java.util.ArrayList;
import java.util.List;

public class InorderTraverse {
  private class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int val;

    public TreeNode(int value) {
      this.val = value;
    }
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    inOrder(root, list);
    return list;
  }

  private void inOrder(TreeNode root, List<Integer> list) {
    if (root == null) return;
    inOrder(root.left, list);
    var value = (Integer) root.val;
    if (value != null) list.add(root.val);
    inOrder(root.right, list);
  }
}
