import java.util.*;
public class square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        float result = square(num);
        System.out.println("Square root of "+num+" is: "+result);
        sc.close();
    }

    private static float square(float num) {
        float start =0;
        float end = num;
        while (start<end) {
            float mid = ((end-start)/2)+start;
            if(mid*mid == num) return mid;
            else if((mid*mid)>num && ((mid*mid)-num)<0.00001) return mid;
            else if((mid*mid)<num && (num-(mid*mid))<0.00001) return mid;
            else if(mid*mid > num) end=mid;
            else start = mid;
        }
        return 0;
    }
}
