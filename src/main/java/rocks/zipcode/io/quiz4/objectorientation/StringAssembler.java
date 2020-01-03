package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private Character delimeter;
    private String accumulator;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        this.accumulator = "";
    }

    public StringAssembler(Character delimeter, String accumulator) {
        this.delimeter = delimeter;
        this.accumulator = accumulator;
    }


    public StringAssembler append(String str) {
        return new StringAssembler(delimeter, accumulator + String.valueOf(delimeter) + str);
    }

    public String assemble() {
        return this.accumulator.substring(1);
    }
}
