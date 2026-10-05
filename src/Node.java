// GitHub repository link: https://github.com/tabemn/LinkedList.git

public class Node {
// To store the data
    int data;
// To hold a reference of Node type
    Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node insertAtTheEnd(Node head, int data) {
        // Check if the linked list is currently empty
        if(head == null) {
            Node n =  new Node(data);
            head = n;
            System.out.println("Head Value is: " + head);
            System.out.println("Node n value is: " + n);
        }  else {
            Node n = new Node(data);

            Node temp;
            temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        System.out.println("Returning head value is: " + head);
        return head;
    }

    public static void printList(Node head) {
        if(head == null) {
            System.out.println("List is empty");
        } else {
            Node temp;
            temp = head;
            while(temp != null) {
            System.out.print("Data value is: " + head.data + "-->");
            temp = temp.next;
        }
    }
        System.out.println();
}

