import java.util.Scanner;

public class Sortingplusfindingduplicateelments {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int dup[]=new int[n];
        int temp = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { // Fix: Corrected the increment from i to j
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Duplicate elements");
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i+1])
            {
                dup[i]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(dup[i]);
        }
    }
}
