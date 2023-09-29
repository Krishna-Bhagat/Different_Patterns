// Pattern:-
// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15

import java.util.*;
public class floyds_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        int a=1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf(" %-2d",a);
                a++;
            }
            System.out.println("");
        }
        sc.close();
    }
}
