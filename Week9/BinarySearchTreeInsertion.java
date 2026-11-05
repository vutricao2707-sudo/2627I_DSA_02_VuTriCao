class Node {
    int data;
    Node left;
    Node right;
}
public class BinarySearchTreeInsertion  {
    public static Node insert(Node root, int data) {
        if(root == null){
            Node newNode = new Node();
            newNode.data = data;
            return newNode;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static void main (String[] args) {
        Node root = new Node();
        root.data = 8;

        root.left = new Node();
        root.left.data = 3;

        root.right = new Node();
        root.right.data = 10;

        root.left.left = new Node();
        root.left.left.data = 1;

        root.left.right = new Node();
        root.left.right.data = 6;
        root = insert(root, 5);
    }
}