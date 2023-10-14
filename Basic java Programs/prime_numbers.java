import java.util.ArrayList;
import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> prime=new ArrayList<>();
        System.out.print("Enter any number upto where you want Prime number:  ");
        int num=sc.nextInt();
        for(int i=2;i<=num;i++){
            int count=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0) prime.add(i);
        }
        System.out.println(prime);
        sc.close();
    }
    
}