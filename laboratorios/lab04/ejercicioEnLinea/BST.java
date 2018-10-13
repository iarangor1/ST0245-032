
import java.util.*;

public class BST
{
    class Node {
        int value;

        Node left, right;

        public Node(int n) {
            value = n;
            left = right = null;
        }
    }

    Node root;

    public BST(){
        root = null;
    }

    public void insert (int n) {
        root = insertAux(root, n);
    }

    private Node insertAux (Node root, int n) {
        if (root == null) {
            return root = new Node(n);
        }
        if (n < root.value) {
            root.left = insertAux(root.left, n);
        } else if (n > root.value) {
            root.right = insertAux(root.right, n);
        }
        return root;
    }

    public int elements() {
        return elementsAux(root);
    }

    private int elementsAux(Node root){
        if (root == null) {
            return 0;
        } else {
            return elementsAux(root.left) + elementsAux(root.right) + 1;
        }
    }

    public int maxHeight() {
        return maxHeightAux(root);
    }

    private int maxHeightAux(Node root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxHeightAux(root.left), maxHeightAux(root.right)) + 1;
        }
    }

    public boolean exists (int n) {
        return existsAux(root, n);
    }

    private boolean existsAux (Node root, int n) {
        if (root == null) {
            return false;
        } else {
            return root.value == n || existsAux(root.left, n) || existsAux(root.right, n);
        }
    }

    public void preorder() {
        preorderAux(root, "");
    }

    private void preorderAux (Node root, String prefix) {
        if (root != null) {
            System.out.println(prefix + root.value);
            if (root.left != null) preorderAux(root.left, prefix + "  ");
            if (root.right != null) preorderAux(root.right, prefix + "  ");
        }
    } 

    public void postorder() {
        postorderAux(root, "");
    }

    private void postorderAux (Node root, String prefix) {
        if (root != null) {
            if (root.left != null) postorderAux(root.left, prefix + "  ");
            if (root.right != null) postorderAux(root.right, prefix + "  ");
            System.out.println(prefix + root.value);
        }
    }

    public void inorder() {
        inorderAux(root, "");
    }

    private void inorderAux (Node root, String prefix) {
        if (root != null) {
            if (root.left != null) inorderAux(root.left, prefix + "  ");
            System.out.println(prefix + root.value);
            if (root.right != null)inorderAux(root.right, prefix + "  ");
        }
    } 

    public void pre_post(String str) {
        // LinkedList<Integer> queue = new LinkedList();
        Scanner scan = new Scanner(str);
        while (scan.hasNextInt()){
            int n = scan.nextInt();
            //queue.add(n);
            insert(n);
        }
        postorder();
    }
    
    public void byLevels() {
        LinkedList<Node> queue = new LinkedList();
        if (root != null) {
            queue.add(root);
        }
        while (queue.size() != 0) {
            Node node = queue.pop();
            System.out.println(node.value);
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
    }
}