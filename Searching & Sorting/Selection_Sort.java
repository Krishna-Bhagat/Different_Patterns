import java.util.*;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {-6,98,34,234,-56,0,983,1344};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int tem = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
    }
}
