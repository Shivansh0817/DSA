import java.util.Scanner;
public class Secondlargest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int arr []=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest=arr[0];
        int second= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                second=largest;
                largest=arr[i];
            }
        }

        System.out.println("largest"+largest);
        System.out.println("Second"+second);

    }
}
