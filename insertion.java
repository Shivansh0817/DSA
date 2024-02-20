import java.util.*;
public class insertion {
    public static void main(String args[]) {
        Scanner sc = new Scanner((System.in));
        int a[] = new int[50];
        System.out.println("enter the size ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array before insertion");
        for (int i = 0; i <n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("Enter the no. you want to insert");
        int x=sc.nextInt();
        System.out.println("Enter the position where you want to insert");
        int ind=sc.nextInt();
        for(int i=n;i>ind;i--)
        {
            a[i]=a[i-1];
        }
        a[ind]=x;
        System.out.println("Array after insertion");
        for(int i=0;i<n+1;i++)
        {
            System.out.print(a[i]+",");
        }


    }
}
