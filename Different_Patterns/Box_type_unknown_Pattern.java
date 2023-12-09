// Box_type_unknown_Pattern
// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444



public class Box_type_unknown_Pattern {
    public static void main(String[] args) {
        pattern(7);
    }
    static void pattern(int n){
        for(int i=1; i<2*n; i++){
            for(int j=1; j<2*n; j++){
                int tem= Math.max(Math.abs(n-i), Math.abs(n-j));
                System.out.print(tem+1);
            }
            System.out.println("");
        }
    }
}
