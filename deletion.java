import java.util.*;
public class deletion {
    public static void main(String args[]) {
        Scanner sc = new Scanner((System.in));
        int a[] = new int[50];
        System.out.println("enter the size ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array before deletion");
        for (int i = 0; i <n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("Enter the position where you want to delete");
        int ind=sc.nextInt();
        for(int i=ind;i<n;i++)
        {
            a[i]=a[i+1];
        }
        System.out.println("Array after deletion");
        for(int i=0;i<n-1;i++)
        {
            System.out.print(a[i]+",");
        }


    }
}