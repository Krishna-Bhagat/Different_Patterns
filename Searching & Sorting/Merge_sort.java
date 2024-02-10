import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int arr[] = {24,8,13,56,28,5,2,67,45};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1) return arr;
        int mid = (arr.length)/2;
        int[] arr1 = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] arr2 = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(arr1,arr2);
    }
    private static int[] merge(int[] first, int[] second) {
        int[] result =  new int[first.length + second.length];
        int a = 0, b=0,i=0;
        while(a<first.length && b<second.length){
            if(first[a]<second[b]){
                result[i] = first[a];
                a++;
            }
            else{
                result[i] = second[b];
                b++;
            }
            i++;
        }
            while(a<first.length){
                result[i] = first[a];
                i++;
                a++;
            }
            while(b<second.length){
                result[i] = second[b];
                i++;
                b++;
            }
        return result;
    }
    
}
