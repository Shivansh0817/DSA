
import java.util.Scanner;
public class Kdanealgo {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size");
            int n = sc.nextInt();
            int arr[] = new int[n];

            // Input array elements
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer

            // Loop to find the maximum subarray sum
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    System.out.print(sum + " ");
                    max = Math.max(max, sum);
                }
            }

            System.out.println("Maximum Subarray Sum: " + max);
        }
    }

