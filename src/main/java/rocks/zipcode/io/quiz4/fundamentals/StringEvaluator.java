package rocks.zipcode.io.quiz4.fundamentals;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        HashSet<String> subs = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j=i+1; j <= string.length(); j++) {
                String seg = string.substring(i, j);
                subs.add(seg);
            }
        }
        return subs.toArray(new String[0]);

    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        ArrayList<String> common = new ArrayList<>();
        ArrayList<String> subs1 = new ArrayList(Arrays.asList(getAllSubstrings(string1)));
        ArrayList<String> subs2 = new ArrayList(Arrays.asList(getAllSubstrings(string2)));
        for (String str : subs1) {
            if (subs2.contains(str)) {
                common.add(str);
            }
        }
        return common.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String largest = "";
        for (String str : getCommonSubstrings(string1,string2)) {
            if (str.length() > largest.length())  {
                largest = str;
            }
        }
        return largest;
    }
}
