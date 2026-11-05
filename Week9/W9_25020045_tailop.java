
public class W9_25020045_tailop {

    static class Node {
        int id;
        String info;
        int firstChild;
        int nextSibling;

        Node(int id, String info) {
            this.id = id;
            this.info = info;
            this.firstChild = -1;
            this.nextSibling = -1;
        }
    }

    static Node[] nodes = new Node[100];
    static int n = 0;

    static int findNode(int id) {
        for (int i = 0; i < n; i++) {
            if (nodes[i].id == id) {
                return i;
            }
        }
        return -1;
    }

    static void createNode(int id, String info) {
        nodes[n] = new Node(id, info);
        n++;
    }

    static void addChild(int parentId, int childId) {

        int parentIndex = findNode(parentId);
        int childIndex = findNode(childId);

        if (parentIndex == -1 || childIndex == -1) {
            return;
        }

        if (nodes[parentIndex].firstChild == -1) {
            nodes[parentIndex].firstChild = childId;
        } else {
            int currentId = nodes[parentIndex].firstChild;

            while (true) {
                int currentIndex = findNode(currentId);

                if (nodes[currentIndex].nextSibling == -1) {
                    nodes[currentIndex].nextSibling = childId;
                    break;
                }

                currentId = nodes[currentIndex].nextSibling;
            }
        }
    }

    static Node parent(int id) {

        for (int i = 0; i < n; i++) {

            int childId = nodes[i].firstChild;

            while (childId != -1) {

                if (childId == id) {
                    return nodes[i];
                }

                int childIndex = findNode(childId);
                childId = nodes[childIndex].nextSibling;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        createNode(1, "A");
        createNode(2, "B");
        createNode(3, "C");
        createNode(4, "D");
        createNode(5, "E");
        createNode(6, "F");

        addChild(1, 2);
        addChild(1, 3);
        addChild(1, 4);

        addChild(2, 5);
        addChild(2, 6);

        Node p = parent(6);

        if (p != null) {
            System.out.println("Parent ID: " + p.id);
            System.out.println("Parent Info: " + p.info);
        } else {
            System.out.println("Parent not found");
        }
    }
}
