class Node1{
    int data;
    Node1 left;
    Node1 right;
}
public class IsThisaBinaryTree {
    public static boolean checkBST(Node1 root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max ){
            return false;
        }
        if (!checkBST(root.left, min, root.data)) {
            return false;
        }
        if (!checkBST(root.right, root.data, max)){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Node1 root = new Node1();
        root.data = 8;
        
        root.left = new Node1();
        root.left.data = 3;

        root.right = new Node1();
        root.right.data = 10;

        root.left.left = new Node1();
        root.left.left.data = 1;

        root.left.right = new Node1();
        root.left.right.data = 6;

        boolean result = checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(result);
    }
}