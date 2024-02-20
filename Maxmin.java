import java.util.*;
public class Maxmin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[5];
        for (int i = 0; i < 5; i++) {
            m[i] = sc.nextInt();
        }
        int max,min;
        min=m[0];
        max=m[0];
        for(int i=0;i< 5;i++) {
            if (max < m[i])
                max = m[i];
        }

        System.out.println(max);
        for(int i=0;i< 5;i++)
        {
            if(min > m[i])
                min=m[i];
        }
        System.out.println(min);
    }
}

