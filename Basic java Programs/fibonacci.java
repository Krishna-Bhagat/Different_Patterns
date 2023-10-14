import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr =new ArrayList<>();
        System.out.print("Enter how many fibonacci number you want:  ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            if(i==0)arr.add(0);
            else if(i==1)arr.add(1);
            else arr.add(arr.get(i-1)+arr.get(i-2));
        }
        System.out.println(arr);
        sc.close();
    }
}
