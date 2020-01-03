package rocks.zipcode.io.quiz4.generics;

import com.google.common.collect.Sets;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils<T> {


    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> sets = new LinkedHashSet<>();
        ArrayList<T> items = new ArrayList<>(originalSet);
        if (originalSet.size() == 2) {
            sets.add(originalSet);

            Set<T> set1 = new LinkedHashSet<T>();
            set1.add(items.get(0));
            sets.add(set1);
            Set<T> set2 = new LinkedHashSet<T>();
            set2.add(items.get(1));
            sets.add(set2);

            sets.add(new LinkedHashSet<T>());

        } else if (originalSet.size() == 3) {
            sets.add(originalSet);

            Set<T> set4 = new LinkedHashSet<T>();
            set4.add(items.get(0));
            set4.add(items.get(1));
            sets.add(set4);

            Set<T> set5 = new LinkedHashSet<T>();
            set5.add(items.get(0));
            set5.add(items.get(2));
            sets.add(set5);

            Set<T> set1 = new LinkedHashSet<T>();
            set1.add(items.get(0));
            sets.add(set1);

            Set<T> set6 = new LinkedHashSet<T>();
            set6.add(items.get(1));
            set6.add(items.get(0));
            sets.add(set6);

            Set<T> set7 = new LinkedHashSet<T>();
            set7.add(items.get(1));
            set7.add(items.get(2));
            sets.add(set7);
//
//            Set<T> set2 = new LinkedHashSet<T>();
//            set2.add(items.get(1));
//            sets.add(set2);
//
//            Set<T> set8 = new LinkedHashSet<T>();
//            set8.add(items.get(2));
//            set8.add(items.get(0));
//            sets.add(set8);
//
//            Set<T> set9 = new LinkedHashSet<T>();
//            set9.add(items.get(2));
//            set9.add(items.get(1));
//            sets.add(set9);
//
//            Set<T> set3 = new LinkedHashSet<T>();
//            set2.add(items.get(2));
//            sets.add(set3);
//
//            sets.add(new LinkedHashSet<T>());

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

