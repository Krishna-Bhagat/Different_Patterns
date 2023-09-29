import java.util.Scanner;

public class diamond_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:  ");
        int rows=sc.nextInt();
        if(rows%2!=0) rows++;
        for (int i = 0; i < rows/2; i++) {
            for (int j = 1;j < (rows/2)-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        int a=0;
        for (int i =rows/2;i>0; i--) {
            a++;
            for (int j = 1;j <= a; j++) {
                if(j==1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}