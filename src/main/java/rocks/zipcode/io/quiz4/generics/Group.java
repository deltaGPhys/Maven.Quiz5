package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> {

    ArrayList<T> items = new ArrayList<>();

    public Group(T... args) {
        this.items.addAll(Arrays.asList(args));
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return this.items.size();
    }

    public void insert(T value) {
        this.items.add(value);
    }

    public Boolean has(T value) {

        return this.items.contains(value);
    }

    public T fetch(int indexOfValue) {
        return this.items.get(indexOfValue);
    }

    public void delete(T value) {
        this.items.remove(value);
    }

    public void clear() {
        this.items.clear();
    }

    public Iterator<T> iterator() {
        return this.items.iterator();
    }
}
