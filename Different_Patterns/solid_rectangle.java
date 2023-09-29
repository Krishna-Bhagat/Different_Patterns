
// Pattern:-

    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *



import java.util.*;
public class solid_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        // outer loop
        for(int i=0;i<rows;i++){
            // inner loop
            for(int j=0;j<5;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        sc.close();  //closing the scanner class
    }
}
