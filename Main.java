// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for loop");
        int m;
        m=sc.nextInt();
        int n []=new int[10];
        for(int i=0;i<m;i++)
        {
            n[i]= sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            System.out.println(n[i]);
        }

    }
}