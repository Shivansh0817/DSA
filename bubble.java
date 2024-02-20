import java.util.*;
public class bubble {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
            for (int i = 0; i < 10; i++)
                System.out.println("Sorted array=" + a[i]);


    }
}
