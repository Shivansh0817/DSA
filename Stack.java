public class Stack {
    int top;
    int max;
    int a[];
    Stack(int size)
    {
        max=size;
        top=-1;
        a=new int[max];
    }
    void push(int ele)
    {
        if(top==max-1)
        {
            System.out.println("Stack is overflow");
            return;
        }
        top++;
        a[top]=ele;
    }
    void pop(int ele)
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow");
            return;
        }
        System.out.println("Element deleted is"+a[top]);
        top--;

    }
    void printlist()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.println(a[i]+" ");
        }
    }
    void peek()
    {
        System.out.println("Peek element"+a[top]);
    }
    boolean isFull()
    {
        if(top==max-1)
            return true;
        else
            return false;

    }
    boolean isEmpty()
    {
        if(top==-1)
          return true;
        else
            return false;
    }
    void Search(int ele)
    {
        int flag=-1;
        int index=-1;
        for(int i=0;i<10;i++)
        {
            if(ele==a[i])
            {
                flag=1;
                index=i;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found in Stack");
        }
        else
        {
            System.out.println("Not found");
        }

    }
    public static void main(String args[])
    {
        Stack obj=new Stack(10);
        System.out.println(obj.isEmpty());
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        System.out.println(obj.isFull());
        obj.printlist();
        System.out.println();
        obj.pop(3);
        obj.printlist();
        System.out.println("Enter the element to search in the stack");
        obj.Search(4);

    }
}
