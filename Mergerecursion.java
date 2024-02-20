public class Mergerecursion {
    public static void Conqurer(int arr[],int in,int mid,int fin) {
        int merge[] = new int[fin - in + 1];
        int indx1 = in;
        int indx2 = mid + 1;
        int x = 0;
        while (indx1 <= mid && indx2 <= fin) {
            if (arr[indx1] <= arr[indx2]) {
                merge[x] = arr[indx1];
                x++;
                indx1++;
            }
            else {
                merge[x]= arr[indx2];
                x++;
                indx2++;
            }
        }
        while (indx1 <= mid) {
            if (arr[indx1] <= arr[indx2]) {
                merge[x] = arr[indx1];
                x++;
                indx1++;
            }
        }
        while (indx2 <= fin) {
            merge[x] = arr[indx2];
            x++;
            indx2++;
        }
        for(int i=0, j=in; i< merge.length;i++,j++)
        {
            arr[j]=merge[i];
        }
    }
        public static void divide(int arr[],int in,int fin)
        {
            if(in>=fin) {
                return;
            }
           int mid=in+(fin-in)/2;
            divide(arr,in,mid);
            divide(arr,mid+1,fin);
            Conqurer(arr,in,mid,fin);

        }
        public static void main(String args[])
        {
            int arr[]={6,3,9,8,2,5};
            int n= arr.length;
            divide(arr,0,n-1);
            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        }


}
