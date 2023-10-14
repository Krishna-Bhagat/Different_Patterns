// Example of prefferable number:  15234, 7564312, 2413,312,.....
// Output for above example: 41235, 7564312,3142, 312..

import java.util.Scanner;
public class inverse_of_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:  ");
        int num=sc.nextInt();
        int result=0;
        boolean flag=true;

        String tem=Integer.toString(num);
        for(int i=1;i<=tem.length();i++){
            String tem_char=Integer.toString(i);
            if(tem.indexOf(tem_char)==-1){
                System.out.println("Sorry! Your number is not prefferable for inverse.");
                flag=false;
                break;
            }
        }

        if(flag){
            for(int i=1;i<=tem.length();i++){
                int rem=num%10;
                num/=10;
                result+=(i*Math.pow(10, rem-1));
            }
            System.out.println("Your inverse is: "+result);
        }
        sc.close();
    }
}
