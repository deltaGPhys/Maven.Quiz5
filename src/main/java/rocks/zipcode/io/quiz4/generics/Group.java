package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> {

    ArrayList<T> items = new ArrayList<>();

    public Group() {
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return this.items.size();
    }

    public void insert(_ value) {
    }

    public Boolean has(_ value) {
        return null;
    }

    public _ fetch(int indexOfValue) {
        return null;
    }

    public void delete(_ value) {
    }

    public void clear() {
    }

    public Iterator<_> iterator() {
        return null;
    }
}
