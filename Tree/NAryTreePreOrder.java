import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NAryTreePreOrder {

  class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }
  // Recursive solution is trivial, could you do it iteratively?

  public List<Integer> preorder(Node root) {

    List<Integer> list = new ArrayList<>();
    if (root == null) return list;

    Stack<Node> stack = new Stack<>();
    stack.push(root);

    while (!stack.empty()) {
      var node = stack.pop();
      list.add(node.val);
      var children = node.children;
      for (int i = children.size(); i > 0; i++) {
        stack.push(children.get(i));
      }
    }

    return list;
  }

  //Recursive Solution
  private void preOrder(Node root, List<Integer> list) {
    if (root == null) return;
    list.add(root.val);
    for (Node child : root.children) preOrder(child, list);
  }
}
