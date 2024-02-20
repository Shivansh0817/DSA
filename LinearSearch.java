import java.util.*;
public class LinearSearch {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int n []=new int[10];
        System.out.println("Enter the value you want to find");
        int ele=sc.nextInt();
        int flag=-1,index=-1;
        for(int i=0;i<10;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(ele==n[i])
            {
                flag=1;
                index=i;
                break;
                }
        }
        if(index==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("found");
        }
    }
}
