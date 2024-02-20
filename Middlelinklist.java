public class Middlelinklist {
    Node head;
    class Node
    {
        int data;
        Node next;

    Node(int d)
    {
       int data=d;
       next=null;
    }
}
     void  addfirst(int d) {
         Node newnode = new Node(d);
         if (head == null) {
             newnode = head;
             return;
         }
         newnode.next = head;
         head = newnode;
     }
     void addlast(int d)
     {
         Node newnode= new Node(d);
         if(head==null)
         {
             head=newnode;
             return;
         }
         Node last=head;
         while(last.next!=null)
         {
             last=last.next;
         }
         last.next=newnode;
     }
     void getmiddle(int d) {
         int n = 0;
         Node temp = head;
         while (temp != null) {
             n++;
             temp = temp.next;
         }
         int half = n / 2;
         temp = head;
         for (int i = half; i > 0; i--) {
             temp = temp.next;

         }
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
    public static void main (String args[])
    {
        Middlelinklist obj= new Middlelinklist();
        obj.addfirst(5);
        obj.addfirst(6);
        obj.addfirst(7);
        obj.addfirst(9);
        obj.addfirst(10);
        obj.printlist();
        obj.addlast(12);
        obj.getmiddle(5);
        obj.printlist();
    }
}




