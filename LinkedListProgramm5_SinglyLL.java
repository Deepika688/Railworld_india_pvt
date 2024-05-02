package Railworld_India_PVT_Task;

public class LinkedListProgramm5_SinglyLL {
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
        public void display() {
            Node n = head;
            while (n != null) {
                System.out.println(n.data + "\n");
                n = n.next;
            }
        }

        public static void main(String[] args) {
            LinkedListProgramm5_SinglyLL list = new LinkedListProgramm5_SinglyLL();
            list.head = new Node(100);
            Node second = new Node(200);
            Node third = new Node(300);

            list.head.next = second;
            second.next = third;
            list.display();
        }

}
