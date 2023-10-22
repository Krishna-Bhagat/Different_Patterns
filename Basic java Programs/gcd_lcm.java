// GCD*LCM=a*b

import java.util.Scanner;
public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.print("Enter your first number:\t");
        float num1=sc.nextFloat();
        System.out.print("Enter your second number:\t");
        float num2=sc.nextFloat();
        int gcd=GCD((int)num1,(int)num2);
        System.out.println("Your numbers:  "+(int)num1+" and "+(int)num2);
        System.out.println("GCD:  "+gcd);
        int lcm=((int)num1*(int)num2)/gcd;
        System.out.println("LCM:  "+lcm);
        }
        catch(Exception e){
            System.out.println("Invalid Input");
            System.out.println("Error:  "+e);
        }
        sc.close();
    }

    static int GCD(int a,int b){
        int x=Math.min(a, b);
        int y=Math.max(a, b);
        while(true){
            if(y%x==0){
                return x;
            }
            else{
                return GCD(y%x,x);
            }
        }
        
    }
}