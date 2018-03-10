Node Delete(Node head, int position) {
  if (position == 0) {
        if (head.next != null) {
            head = head.next;
            return head;
        }
        return null;
    } else {
        Node node = head;
        for (int i = 0; i < position - 1; i++) {
          node = node.next;
        }
        node.next = node.next.next;
    }
    return head;
}
