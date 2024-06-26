package Railworld_India_PVT_Task;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList<I extends Number> {
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while (temp.next != null){
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


}
public class LinkedListProgram3 {
    public static void main(String[] args) {
        LinkedList<Number> list = new LinkedList<Number>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
    }
}
