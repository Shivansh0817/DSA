public class countlinklist {
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
    int count(int ele)
    {
        int count=0;
        Node curr=head;
        while(curr!=null)
        {
            if(curr.data==ele)
            {
                count++;
            }
            curr=curr.next;
        }
        return count;
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
        countlinklist list=new countlinklist();
        list.addfirst(5);
        list.addfirst(5);
        list.addfirst(6);
        list.addfirst(7);
        list.addfirst(8);
        list.addfirst(7);
        list.printlist();
        System.out.println();
        System.out.println("Count of 7"+"-"+list.count(7));
    }
}
