import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr ={202, -34, 13, 5, 101, 54, 34, 98, 3,0};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionsort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j=i-1;
            while(j>=0 && arr[j]>arr[j+1]){
                    int tem = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tem;
                    j--;
            }
        }
    }
}
