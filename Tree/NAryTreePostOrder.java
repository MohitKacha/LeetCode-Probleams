import java.util.*;

public class NAryTreePostOrder {
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

  /*
    Alternative  - using 2 stack
    stack1.push(root)
    while(stack1.empty())
        root = stack1.pop()
        stack2.push(root)
        for all children:
            stack1.push(child)


    traverse stack2 => pop element and add to list

   */

  public List<Integer> postorder(Node root) {
    LinkedList<Integer> list = new LinkedList<>();
    if (root == null) return list;

    Stack<Node> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      root = stack.pop();
      list.addFirst(root.val);
      for (Node child : root.children) stack.push(child);
    }
    return list;
  }

}
