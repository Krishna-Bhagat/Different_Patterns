import java.util.Scanner;

public class prime_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        boolean[] state = new boolean[n+1];
        checking_prime(n,state);
        System.out.println("Our Prime Numbers till "+n+": ");
        for(int i=2;i<=n;i++){
            if(!state[i]) System.out.print(i + "\t");
        }
    }

    private static void checking_prime(int n, boolean[] state) {
        for(int i=2; i<=n; i++){
            if(!state[i]){
                for(int j=i+i;j<=n;j+=i){
                    state[j]=true;
                }
            }
        }
    }
}