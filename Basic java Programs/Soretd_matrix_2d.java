
public class Soretd_matrix_2d {
    public static void main(String[] args) {
        int[][] arr = {
            {2,5,8,11},
            {12,14,15,18},
            {20,25,29,31},
            {34,37,39,43}
        };
        int target = 1;
        int[] result = new int[2];
        result = search(arr,target);
        System.out.println("Your element is present in row no."+result[0]+" ,column no."+result[1]+".");
    }
    static int[] search(int[][] arr, int target){
        int column = arr[0].length -1;
        int start =0, end = arr.length -1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(target == arr[mid][column]){
                return new int[]{mid,column};
            }
            else if(target < arr[mid][column]){
                end = mid;
            }
            else if(target > arr[mid][column]){
                start = mid+1;
            }
        }
        int row = end;
        start = 0; end = column;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[row][mid]){
                return new int[]{row,mid};
            }
            if(target < arr[row][mid]){
                end = mid-1;
            }
            if(target > arr[row][mid]){
                start = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
