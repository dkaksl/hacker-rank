void ReversePrint(Node head) {
    if (head == null) {
        return;
    } else {
        int nodeCount = 1;
        Node node = head;
        while (node.next != null) {
            nodeCount++;
            node = node.next;
        }

        Node[] nodes = new Node[nodeCount];
        node = head;
        nodes[0] = node;
        for (int i = 1; i < nodeCount; i++) {
            nodes[i] = node.next;
            node = node.next;
        }
        for (int i = nodes.length - 1; i >= 0; i--) {
            System.out.println(nodes[i].data);
        }
    }
}
