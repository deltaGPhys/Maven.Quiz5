package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable{

    private ArrayList<String> strings = new ArrayList<>();

    public SimpleStringGroup(String... args) {
        this.strings = new ArrayList<String>(Arrays.asList(args));
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return this.strings.size();
    }

    public void insert(String string) {
        this.strings.add(string);
    }

    public Boolean has(String string) {
        return this.strings.contains(string);
    }

    public String fetch(int indexOfValue) {
        return this.strings.get(indexOfValue);
    }

    public void delete(String string) {
        this.strings.remove(string);
    }

    public void clear() {
        this.strings.clear();
    }

    @Override
    public Iterator iterator() {
        return this.strings.iterator();
    }

    @Override
    public void forEach(Consumer action) {
//        Objects.requireNonNull(action);
//        for (String t : this) {
//            action.accept(t);
//        }

    }

    @Override
    public Spliterator spliterator() {
        return this.strings.spliterator();
    }
}
