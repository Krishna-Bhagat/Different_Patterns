import java.util.*;
public class No_of_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        System.out.println("Number of bits in "+n+" is: "+bitting(n));
    }

    private static int bitting(int n) {
        return (int) ((Math.log(n)/Math.log(2))+1);
    }
}
