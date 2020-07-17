package bst;

class BinarySearchTree {

    class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        this.root = null;
    }

    void insert(int val) {
        root = insertValue(root, val);
    }

    Node insertValue(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertValue(root.left, val);
        } else if (val > root.val) {
            root.right = insertValue(root.right, val);
        }
        return root;
    }

    Node search(Node root, int val) {
        if (root == null || root.val == val)
            return root;

        if (val < root.val) {
            return search(root.left, val);
        }

        return search(root.right, val);
    }

    void preOrderTraversal(Node root) {
        if (root == null)
            return;

        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(2);
        bst.insert(10);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);

        bst.preOrderTraversal(bst.root);

        Node res = bst.search(bst.root, 10);
        System.out.println(res.val);
    }

}