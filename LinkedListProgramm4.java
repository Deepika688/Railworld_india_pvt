package Railworld_India_PVT_Task;

class Node1 {
    int data;
    Node next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList12 {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }
}

public class LinkedListProgramm4 {

    public static void main(String[] args) {
        LinkedList12 list = new LinkedList12();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        System.out.println("Original linked list:");
        list.display();

        System.out.println("\nReversed linked list:");
        list.reverse();
        list.display();
    }
}
