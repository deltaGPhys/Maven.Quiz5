package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {

    private String str;

    public StringEvaluatorObject(String str) {
        this.str = str;
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(this.str);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(this.str, secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(this.str, secondInput);
    }
}
