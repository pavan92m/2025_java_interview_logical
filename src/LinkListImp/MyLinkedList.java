package LinkListImp;

public class MyLinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
