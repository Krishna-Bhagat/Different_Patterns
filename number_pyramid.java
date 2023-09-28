import java.util.Scanner;

public class number_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for(int j=0; j<rows-i; j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.printf("%2d ",i);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}