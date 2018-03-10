Node InsertNth(Node head, int data, int position) {
    if (head == null) {
        head = new Node();
        head.data = data;
    } else {
        Node newNode = new Node();
        newNode.data = data;
        if (position == 0) {
            newNode.next = head;
            return newNode;
        } else {
            Node node = head;
            for (int i = 0; i < position - 1; i++) {
                node = node.next;
            }
            Node newNextNode = node.next;
            newNode.next = newNextNode;
            node.next = newNode;
        }
    }
    return head;
}
