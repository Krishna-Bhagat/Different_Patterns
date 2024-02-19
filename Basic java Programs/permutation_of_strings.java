import java.util.ArrayList;

public class permutation_of_strings {
    public static void main(String[] args) {
        String st = "abc";
        System.out.println(permutation(st, ""));
    }

    private static ArrayList<String> permutation(String st, String tem) {
        ArrayList<String> l = new ArrayList<>();
        if (st.isEmpty()) {
            // System.out.println(tem);
            l.add(tem);
            return l;
        }

        for (int i = 0; i < tem.length() + 1; i++) {
            l.addAll(permutation(st.substring(1), tem.substring(0, i) + st.charAt(0) + tem.substring(i)));
        }
        return l;
    }
}