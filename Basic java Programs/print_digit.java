import java.util.Scanner;

public class print_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:  ");
        long number=sc.nextLong();
        int digit=(int) (Math.log10(number));
        // System.out.println(digit);
        for(int i=digit;i>=0;i--){
            long tem=number;
            number=(long)(number%Math.pow(10, i));
            System.out.println((int)(tem/Math.pow(10, i)));
        }
        sc.close();
    }
}