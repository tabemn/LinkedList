// GitHub repository link: https://github.com/tabemn/LinkedList.git

public class Node {

    int data;

    Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node insertAtTheEnd(Node head, int data) {
        // Check if the linked list is currently empty
        if(head == null) {
            Node n =  new Node(data);
            head = n;
        }  else {
            Node n = new Node(data);

            Node temp;
            temp = head;

            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        return head;
    }
}

