import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {34,87,12,83,23,5,83,46,35,38,9};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr,int s, int e) {
        if(e<=s) return;
        int pivot = arr[s+ (e-s)/2];
        int low = s, high = e;
        while(s<=e){
            if(arr[s]<pivot) s++;
            else if(arr[e]>pivot) e--;
            else{
                int tem = arr[s];
                arr[s] = arr[e];
                arr[e] = tem;
                s++;
                e--;
            }
        }
        quicksort(arr, low, e);
        quicksort(arr, s, high);
    }
}
