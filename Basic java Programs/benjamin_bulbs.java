
// https://www.youtube.com/watch?v=_F7ejdDCpyg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=33
import java.util.*;

public class benjamin_bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bulbs: ");
        int n = sc.nextInt();
        System.out.print("On Bulb are: ");
        for (int j = 1; j*j <= n; j++) {
            System.out.print("Bulb no." + j*j + ",  ");
        }
        sc.close();
    }
}