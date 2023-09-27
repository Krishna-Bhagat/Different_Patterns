
// Pattern:-
// * * * * *
// *       *
// *       *
// * * * * *

import java.util.Scanner;

public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==0 || i==(rows-1) || j==0 || j==4){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
