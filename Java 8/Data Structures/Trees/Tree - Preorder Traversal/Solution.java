void preOrder(Node root) {
    Node node = root;
    System.out.print(node.data + " ");
    if (node.left != null) {
        preOrder(node.left);
    }
    if (node.right != null) {
        preOrder(node.right);
    }
}
