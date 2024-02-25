// possible combination that can generate 4 or add of 4.

import java.util.ArrayList;

public class dice_problem {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list =dice1(new ArrayList<Integer>(),4);
        System.out.println(list);
    }

    private static ArrayList<ArrayList<Integer>> dice1(ArrayList<Integer> p, int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(target ==0) {
            list.add(p);
            return list;
        }
        for(int i=1; i<=6 && i<=target; i++){
            ArrayList<Integer> copy = new ArrayList<>(p);
            copy.add(i);
            list.addAll(dice1(copy, target-i));
        }
        return list;
    }

}
