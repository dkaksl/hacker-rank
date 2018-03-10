Node Insert(Node head,int x) {
    if (head == null) {
        head = new Node();
        head.data = x;
    } else {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        return newNode;
    }
    return head;
}
