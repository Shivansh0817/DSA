import java.util.*;
public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Array before Reversing");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

        int b[] = new int[n];
        int j = n;

        for (int i = 0; i < n; i++) {
            b[j- 1] = a[i];
            j = j - 1;
        }
        System.out.println("Array after reversing");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}



