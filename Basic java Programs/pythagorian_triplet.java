import java.util.*;

public class pythagorian_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your all three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        boolean flag;
        if (max == a)
            flag = (a * a) == (b * b) + (c * c);
        else if (max == b)
            flag = (b * b) == (a * a) + (c * c);
        else
            flag = (c * c) == (b * b) + (a * a);
        if (flag)
            System.out.println("They are Pythagorian Triplets.");
        else
            System.out.println("They are not Pythagorian Triplets");
        sc.close();
    }
}