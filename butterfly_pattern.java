import java.util.Scanner;

public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of rows:  ");
        int rows=sc.nextInt();
        boolean status=false;
        if(rows%2!=0) status = true;
        for(int i=1;i<=rows/2;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            for(int j=0;j<(rows-2*i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        if(status){
            for (int i = 0; i < rows; i++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }

         for(int i=rows/2;i>0;i--){
            for(int j=0;j< i;j++){
                System.out.print(" *");
            }
            for(int j=0;j<(rows-2*i);j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}