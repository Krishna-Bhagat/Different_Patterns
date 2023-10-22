import java.util.*;
public class prime_factorisation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:  ");
        int num=sc.nextInt();
        System.out.println("Your Prime Factors are: ");
        for(int i=1;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                if(isprime(i))System.out.print(i+", ");
                if(isprime(num/i))System.out.print(num/i +", ");
            }
        }
        System.out.println("");
        sc.close();
    }
    static boolean isprime(int a){
        if(a==1)return false;
        for(int i=2;i<=(int)Math.sqrt(a);i++){
            if(a%i==0)return false;
        }
        return true;
    }
}