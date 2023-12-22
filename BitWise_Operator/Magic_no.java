import java.util.Scanner;

// 1 ==> 001 ==> 5^1
// 2 ==> 010 ==> 5^2
// 3 ==> 011 ==> 5^2 + 5^1
// 4 ==> 100 ==> 5^3

public class Magic_no {
    static int magic(int n){
        int result =0;
        for(int i=0; i<32; i++){
            int mask = 1<<i;
            if((n&mask) != 0) result+=(int)Math.pow(5, i+1);
        }
        return result;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which magic number do you want?  ");
        n=sc.nextInt();
        int result = magic(n);
        System.out.println("Your required magic number is: "+result);
        sc.close();
    }
}
