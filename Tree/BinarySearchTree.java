import java.util.Stack;

public class BinarySearchTree {

  private class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
      this.value = value;
    }


  }

  private Node root;

  public boolean isValidBST(Node node) {
    return validateBST(node, null, null);

    // isValidBSTUsingStack(root);
  }

  private boolean validateBST(Node node, Integer min, Integer max) {
      /*
        Recursion method
       */
    if (node == null) {
      return true;
    }
    var value = node.value;
    if (min != null && value < min) return false;
    if (max != null && value > max) return false;

    if (!validateBST(node.left, min, value - 1)) return false;
    if (!validateBST(node.right, value + 1, max)) return false;

    return true;
  }

  private boolean isValidBSTUsingStack(Node root) {

    /*
        Traverse In-Order => Left -> Root -> Right
        Store in Stack -> Compare value of last two node.
     */

    Stack<Node> stack = new Stack<>();

    var value = Integer.MIN_VALUE;
    while (!stack.empty() || root != null) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }

      root = stack.pop();
      if (root.value <= value) return false;
      value = root.value;
      root = root.right;
    }

    return true;
  }
}
