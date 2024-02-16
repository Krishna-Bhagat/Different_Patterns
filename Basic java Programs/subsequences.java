import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class subsequences {
    public static void main(String[] args) {
        String st = "abcde";
        ArrayList<String> result = new ArrayList<String>();
        subseq(st, "", result);
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compare strings by length
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println(result);
        System.out.println(result.size());
    }

    private static void subseq(String st, String tem, ArrayList<String> result) {
        if (st.length() == 0) {
            result.add(tem);
            return;
        } else {
            subseq(st.substring(1), tem + st.charAt(0), result);
            subseq(st.substring(1), tem, result);
        }
    }
}
