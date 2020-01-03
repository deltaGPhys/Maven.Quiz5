package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        HashSet<String> pals = new HashSet<>();
        for (int i = 0; i < string.length()-1; i++) {
            for (int j=i+1; j <= string.length(); j++) {
                String seg = string.substring(i, j);

                if (isPalindrome(seg)) {
                    pals.add(seg);
                }
            }
        }
        return pals.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
