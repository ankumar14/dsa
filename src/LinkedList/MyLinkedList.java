package LinkedList;

public class MyLinkedList {

    Node head;

    public MyLinkedList(){
        this.head = null;
    }

    public void insertNode(int data){
        Node node = new Node(data);

        if(head==null){
            head = node;
        }
        else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void printList(){
        Node current = head;

        while (current!=null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
    }
}

class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}