package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    private Double hours;
    private Integer id;

    public Student() {
        this(null);
        this.hours = 0.;
    }

    public Student(Integer id) {
        this.id = id;
        this.hours = 0.;
    }

    public void learn(Double amountOfHours) {
        this.hours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.hours;
    }
}
