public class DeleteNelementsStack
{
        int max;
        int top;
        int a[];

        DeleteNelementsStack(int size) {
            max = size;
            top = -1;
            a = new int[max];
        }

        void push(int ele) {
            if (top == max - 1) {
                System.out.println("Stack is overflow");
                return;
            }
            top++;
            a[top] = ele;
        }

        void pop(int ele,int n)
        {
            if(top==-1)
            {
                System.out.println("Stack is underflow");
                return;
            }
            for(int i=0;i<n;i++)
            {
                System.out.println("Element deleted is"+a[top]);
                top--;

            }
        }

        void printlist() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }
            for (int i = top; i >= 0; i--) {
                System.out.println(a[i] + " ");
            }
        }

        boolean isFull() {
            if (top == max - 1)
                return true;
            else
                return false;

        }

        boolean isEmpty() {
            if (top == -1)
                return true;
            else
                return false;
        }

        public static void main(String args[]) {
            DeleteNelementsStack obj = new DeleteNelementsStack(10);
            System.out.println(obj.isEmpty());
            obj.push(4);
            obj.push(5);
            obj.push(6);
            obj.push(7);
            obj.push(8);
            obj.push(9);
            obj.printlist();
            obj.pop(6,2);
            obj.printlist();
        }
    }





