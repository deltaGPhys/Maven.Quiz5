package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T> {

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void insert(T value) {
        if (this.list.size() == 0) {
            this.list.add(value);
        } else {
            for (int i = 0; i < this.list.size(); i++) {
                if (value.compareTo(this.list.get(i)) < 0) {
                    this.list.add(i, value);
                    break;
                }
            }
        }


    }

    @Override
    public void delete(T value) {
        this.list.remove(value);
    }

    public Integer indexOf(T value) {
        return this.list.indexOf(value);
    }
}
