import java.util.*;
public class power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();  //n=0 is the exception case.
        if((n&(n-1)) == 0) System.out.println("Yes, your entered number is power of 2.");
        else System.out.println("Your entered number is not power of 2.");
        sc.close();
    }
}
