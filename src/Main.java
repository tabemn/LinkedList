// GitHub repository link: https://github.com/tabemn/LinkedList.git

public class Main {

    public static void main(String[] args) {

        // Creating a variable
        Node head;
        head = null;

        System.out.println("Head value before invoking the method: " + head);
        head = Node.insertAtTheEnd(head, 10);
        Node.printList(head);
        System.out.println("Head value after invoking the method: " + head);
        head = head.insertAtTheEnd(head, 20);
        Node.printList(head);
     // head = head.insertAtTheEnd(head, 30);

    }
}