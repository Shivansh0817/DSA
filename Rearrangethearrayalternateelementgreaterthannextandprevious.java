

import java.io.*;
import java.util.*;
public class Rearrangethearrayalternateelementgreaterthannextandprevious
{

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int temp=0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            for(int i=1;i<n;i=i+2)
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }

        }
    }

