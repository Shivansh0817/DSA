public class Linkedlist1
    {
        Node head;
        class Node {

            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }
            void addfirst(int d)
            {
                Node newnode=new Node(d);
                if(head==null)
                {
                    head=newnode;
                    return;
                }
                newnode.next= head;
                head= newnode;
            }
            void printlist()
            {
                if(head==null) {
                    System.out.println("List is empty");

                    return;
                }
            Node last=head;
            while(last!= null)
            {
                System.out.println(last.data);
                last=last.next;
            }
        }
        public static void main(String args[])
        {
        Linkedlist1 list =new Linkedlist1();
        list.printlist();
        list.addfirst(3);
        list.addfirst(4);
        list.printlist();
        }
        }


