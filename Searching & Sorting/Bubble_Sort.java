import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {9, 17, 3, 1, 13, 19, 7};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
    }
}
