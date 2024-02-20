public class QuickSort {
    public static void partition(int[] arr, int low, int high)
    {
        int pivot=arr[high];
        int i=low-1; //i=-1
        for(int j=low;j<high;j++)
        {
            if(arr[i]< pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }


    }
}
