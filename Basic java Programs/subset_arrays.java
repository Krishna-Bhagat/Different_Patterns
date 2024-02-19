import java.util.ArrayList;

public class subset_arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subset(arr));
    }
    private static  ArrayList<ArrayList<Integer>> subset(int[] arr){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        result.add(new ArrayList<>());
        
        for(int i=0; i<arr.length; i++){
            int n = result.size();
            for(int j=0; j<n; j++){
                ArrayList<Integer> list = new ArrayList<>(result.get(j));
                list.add(arr[i]);
                if(! result.contains(list))  result.add(list);
            }
        }
        return result;
    }
}
