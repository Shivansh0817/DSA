public class doublylinklist {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d)//constructor
        {
            data = d;//info stored in data
            next = null;//previous and last will be null
            prev = null;
        }
    }

    void addfirst(int d) {
        Node newnode = new Node(d);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    void addlast(int d) {
        Node newnode = new Node(d);
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newnode;
        newnode.prev = last;

    }

    void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.prev = null;
    }

    void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        Node curr = last.prev;
        head.next = null;
    }

    void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node last = head;
        while (last != null) {
            System.out.println(last.data + " ");
            last = last.next;

        }
    }

    public static void main(String args[]) {
        doublylinklist list = new doublylinklist();
        list.addfirst(5);
        list.addfirst(6);
        list.addfirst(7);
        list.addlast(8);
        list.printlist();
        System.out.println();
        list.deletefirst();
        list.deletelast();
        list.printlist();
    }
}