package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T extends Comparable<T>> extends TreeSet<T> implements Comparable<ComparableTreeSet<T>> {

    TreeSet<T> tree = new TreeSet<>();

    public ComparableTreeSet(T... arr) {
        this.tree = new TreeSet<T>(Arrays.asList(arr));
    }


    public ComparableTreeSet() {

    }

    public int compareTo(ComparableTreeSet<T> o) {
        Iterator<T> iterator = this.tree.iterator();
        Iterator<T> iterator2 = o.iterator();

        while(iterator.hasNext()) {
            T item1 = iterator.next();
            T item2 = iterator2.next();

            if (item1.compareTo(item2) < 0) {
                return -1;
            } else if (item1.compareTo(item2) > 0) {
                return 1;
            }

        }


        return 0;
    }

    public Iterator<T> iterator() {
        return this.tree.iterator();
    }

    public int size() {
        return this.tree.size();
    }

    @Override
    public String toString() {
        return "" + tree;
    }
}
