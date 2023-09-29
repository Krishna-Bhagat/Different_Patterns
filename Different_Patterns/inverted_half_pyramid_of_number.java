// Pattern:-
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3 
// 1 2
// 1

import java.util.*;
public class inverted_half_pyramid_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        for(int i=rows;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println("");
        }
        sc.close();
    }
}
