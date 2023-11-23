public class Binary_search_2D_matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {2,6,8,9},
            {3,8,9,11},
            {5,12,13,16},
            {7,16,17,19}
        };
        int target = 13;
        search_element(arr, target);

    }

    static void search_element(int[][] arr, int target){
        int row=0, column=arr[0].length-1;
        while(row<arr.length && column >=0){
            if(arr[row][column]>target) column--;
            if(arr[row][column]<target) row++;
            if(arr[row][column]==target) {
                System.out.println("Your targeted element is in row no. "+(row+1)+", column no. "+(column+1)+".");
                return ;
            }
        }
        System.out.println("Your targeted element is not found here in this 2D array.");
    }
}
