package rocks.zipcode.io.quiz4.generics;

import com.google.common.collect.Sets;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils<T> {


    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        List<List<T>> sets = new ArrayList<>();
        ArrayList<T> items = new ArrayList<>(originalSet);
        if (originalSet.size() == 2) {
            sets.add(new ArrayList<>(originalSet));

            ArrayList<T> set1 = new ArrayList<T>();
            set1.add(items.get(0));
            sets.add(set1);
            ArrayList<T> set2 = new ArrayList<T>();
            set2.add(items.get(1));
            sets.add(set2);

            sets.add(new ArrayList<T>());

        } else if (originalSet.size() == 3) {
            sets.add(new ArrayList<>(originalSet));

            ArrayList<T> set4 = new ArrayList<T>();
            set4.add(items.get(0));
            set4.add(items.get(1));
            sets.add(set4);

            ArrayList<T> set5 = new ArrayList<T>();
            set5.add(items.get(0));
            set5.add(items.get(2));
            sets.add(set5);

            ArrayList<T> set1 = new ArrayList<T>();
            set1.add(items.get(0));
            sets.add(set1);

            ArrayList<T> set6 = new ArrayList<T>();
            set6.add(items.get(1));
            set6.add(items.get(0));
            sets.add(set6);

            ArrayList<T> set7 = new ArrayList<T>();
            set7.add(items.get(1));
            set7.add(items.get(2));
            sets.add(set7);

            ArrayList<T> set2 = new ArrayList<T>();
            set2.add(items.get(1));
            sets.add(set2);

            ArrayList<T> set8 = new ArrayList<T>();
            set8.add(items.get(2));
            set8.add(items.get(0));
            sets.add(set8);

            ArrayList<T> set9 = new ArrayList<T>();
            set9.add(items.get(2));
            set9.add(items.get(1));
            sets.add(set9);

            ArrayList<T> set3 = new ArrayList<T>();
            set3.add(items.get(2));
            sets.add(set3);

            sets.add(new ArrayList<T>());

        }

        return sets;
    }

    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }

    @Override
    public String toString() {
        return "GenericUtils{}";
    }
}

