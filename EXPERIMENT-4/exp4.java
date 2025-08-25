// Java program for Doubly and Circular Linked List

class DoublyLinkedList {
    static class DNode {
        int data;
        DNode prev, next;

        DNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private DNode head;

    public DoublyLinkedList() {
        head = null;
    }

    public void insertAtBeg(int data) {
        DNode newNode = new DNode(data);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteAtBeg() {
        if (head == null) return;
        head = head.next;
        if (head != null) head.prev = null;
    }

    public void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        DNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.prev.next = null;
    }

    public void display() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class CircularLinkedList {
    static class CNode {
        int data;
        CNode next;

        CNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private CNode last;

    public CircularLinkedList() {
        last = null;
    }

    public void insertAtBeg(int data) {
        CNode newNode = new CNode(data);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
    }

    public void insertAtEnd(int data) {
        CNode newNode = new CNode(data);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }

    public void deleteAtBeg() {
        if (last == null) return;
        CNode temp = last.next;
        if (last == temp) {
            last = null;
        } else {
            last.next = temp.next;
        }
    }

    public void deleteAtEnd() {
        if (last == null) return;
        if (last.next == last) {
            last = null;
            return;
        }
        CNode temp = last.next;
        while (temp.next != last) temp = temp.next;
        temp.next = last.next;
        last = temp;
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        CNode temp = last.next;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("(back to head)");
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("=== Doubly Linked List Demo ===");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeg(10);
        dll.insertAtEnd(20);
        dll.insertAtBeg(5);
        dll.insertAtEnd(30);
        System.out.print("DLL: ");
        dll.display();

        dll.deleteAtBeg();
        dll.deleteAtEnd();
        System.out.print("DLL after deletion: ");
        dll.display();

        System.out.println("\n=== Circular Linked List Demo ===");
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBeg(10);
        cll.insertAtEnd(20);
        cll.insertAtBeg(5);
        cll.insertAtEnd(30);
        System.out.print("CLL: ");
        cll.display();

        cll.deleteAtBeg();
        cll.deleteAtEnd();
        System.out.print("CLL after deletion: ");
        cll.display();
    }
}

