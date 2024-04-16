import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String a = "abc";
        ArrayList<String> str = new ArrayList<>();
        str = subseq2("",a);
        System.out.println(str);
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    public static ArrayList<String> subseq1(String p, String up, ArrayList<String> str) {
        if (up.isEmpty()) {
            str.add(p); // Add the current subsequence to the ArrayList
            return str; // Return the updated ArrayList
        }

        char ch = up.charAt(0);

        // Include the current character in the subsequence
        subseq1(p + ch, up.substring(1), str);

        // Exclude the current character from the subsequence
        subseq1(p, up.substring(1), str);

        return str; // Return the ArrayList after all processing
    }

    public static ArrayList<String> subseq2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // Include the current character in the subsequence
        ArrayList<String> left = subseq2(p + ch, up.substring(1));

        // Exclude the current character from the subsequence
        ArrayList<String> right = subseq2(p, up.substring(1));


        left.addAll(right);
        return left; // Return the ArrayList after all processing
    }
}
