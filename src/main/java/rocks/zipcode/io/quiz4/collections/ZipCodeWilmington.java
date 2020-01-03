package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private ArrayList<Student> students = new ArrayList<>();

    public void enroll(Student student) {
        this.students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return this.students.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student s: this.students) {
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        LinkedHashMap<Student,Double> map = new LinkedHashMap<>();
        for (Student s: this.students) {
            map.put(s,s.getTotalStudyTime());
        }
        return map;
    }
}
