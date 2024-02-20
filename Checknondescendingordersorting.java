import java.util.*;
public class Checknondescendingordersorting
    {
        public static void main(String args [])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size");
            int n=sc.nextInt();
            int arr[]=new int [n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();

            }
            for(int i=1;i<n;i++)
            {
                if(arr[i]>=arr[i-1])
                {
                    System.out.println("sorted");
                }
                else
                {
                    System.out.println("Not Sorted");
                }
            }
        }

}
