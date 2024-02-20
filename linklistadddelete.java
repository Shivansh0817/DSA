public class linklistadddelete {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

        void addfirst(int d) {
            Node newnode = new Node(d);
            if (head == null) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        void addlast(int d) {
            Node newnode = new Node(d);
            if (head == null) {
                head = newnode;
                return;
            }
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newnode;

        }

        void deletefirst() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            head = head.next;
        }

        void deletelast() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node last = head;
            Node prev = head;
            while (last.next != null) {
                prev = last;
                last = last.next;
            }
            prev.next = null;

        }

        void printlist() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node last = head;
            while (last != null) {
                System.out.print(last.data + " ");
                last = last.next;
            }
        }
        public static void main(String args[])
        {
            linklistadddelete list=new linklistadddelete();
            list.addfirst(5);
            list.addfirst(6);
            list.addlast(7);
            list.printlist();
            System.out.println();
            list.deletefirst();
            list.deletelast();
        }

    }

