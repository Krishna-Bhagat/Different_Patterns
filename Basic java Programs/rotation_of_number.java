// output for 12345 & 1 : 51234

import java.util.Scanner;

public class rotation_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neg = 0;
        System.out.print("Enter any number for Rotation:   ");
        int num = sc.nextInt();
        int digit = (int) Math.log10(num);
        System.out.print("Enter the number of times for rotation; ie. factor for rotation:   ");
        int k = sc.nextInt();
        // if(k<0){
        // neg=1;
        // k*=-1;
        // }
        k %= (digit + 1);
        if (k < 0)
            k = (digit + 1) + k;
        int rem = num % (int) Math.pow(10, k);
        num /= (int) Math.pow(10, k);
        num = (rem * (int) Math.pow(10, digit + 1 - k)) + num;
        
        // if(k>0){
        // int rem=num%(int)Math.pow(10,k);
        // num/=(int)Math.pow(10,k);
        // num=(rem*(int)Math.pow(10,digit+1-k))+num;
        // }
        // else{
        // k*=-1;
        // int rem=num/(int)Math.pow(10,digit+1-k);
        // num=num%(int)Math.pow(10,digit+1-k);
        // num=(num*(int)Math.pow(10,k))+rem;
        // }

        // for(int i=1;i<=k;i++){
        // if(neg==0){
        // int rem=num%10;
        // num/=10;
        // num=(rem*(int)Math.pow(10,digit))+num;
        // }
        // else{
        // int rem=num/(int)Math.pow(10,digit);
        // num=num%(int)Math.pow(10,digit);
        // num=(num*10)+rem;
        // }
        // }
        System.out.println("Your rotated number is: " + num);
        sc.close();
    }
}