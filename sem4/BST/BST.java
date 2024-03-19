public class BST {
    // Node
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            System.out.println("Node to insert: " + data);
        }
    }

    public static Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        // System.out.println("current root: "+root.data);
        return root;
    }

    public static void inorderTraverse(Node root) {
        if (root == null) {
            return;
        }

        inorderTraverse(root.left);

        System.out.print("Current Node: " + root.data);
        if (root.left != null) {
            System.out.print("\tLeft: " + root.left.data);
        } else {
            System.out.print("\tLeft: " + null);
        }
        if (root.right != null) {
            System.out.print("\tRight: " + root.right.data);
        } else {
            System.out.print("\tRight: " + null);
        }
        System.out.println();

        inorderTraverse(root.right);
    }


    public static boolean searchTree(Node root, int key) {
        if (root == null) {
            return false;
        } else {
            if (key < root.data) {
                return searchTree(root.left, key);
            } else if (key == root.data) {
                return true;

            } else {
                return searchTree(root.right, key);
            }
        }
    }

    public static Node deleteNode(Node root, int key) {
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.right == null && root.left == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node inSc = inorderSuccessor(root.right);
            root.data = inSc.data;
            root.right = deleteNode(root.right, inSc.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int a[] = { 3, 5, 1, 4, 2 };
        for (int n : a) {
            root = insertNode(root, n);

        }
        System.out.println("Inorder traversal:");
        inorderTraverse(root);
    }
}
