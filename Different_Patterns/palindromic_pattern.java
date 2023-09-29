import java.util.Scanner;

public class palindromic_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of rows:  ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j>0 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j < 2+i-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
