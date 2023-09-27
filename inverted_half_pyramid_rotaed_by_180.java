// Pattern:-
//         *
//       * *
//     * * *
//   * * * *
// * * * * *

  import java.util.Scanner;

public class inverted_half_pyramid_rotaed_by_180 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        //loop for rows
        for (int i = 0; i < rows ; i++) {
            //loop for spaces
            for (int j = 0; j < rows-i ; j++) {
                System.out.print("  ");
            }
            //loop for star
            for (int j = 0; j <= i ; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        sc.close();
    }
}
