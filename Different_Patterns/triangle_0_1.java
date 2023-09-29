// Pattern:-
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

import java.util.Scanner;

public class triangle_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        int a = 0;
        for (int i = 0; i < rows; i++) {
            if (a == 0)
                a = 1;
            else
                a = 0;
            int s = a;
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + s);
                if (s == 0)
                    s = 1;
                else
                    s = 0;
            }
            System.out.println("");
        }
        sc.close();
    }
}
