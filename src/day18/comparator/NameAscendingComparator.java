package day18.comparator;

import java.util.Comparator;

public class NameAscendingComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        // negative if o1 is smaller, positive if o2 is smaller, zero if same
        return o1.getName().compareTo(o2.getName()); // compareTo -> compares String
    }
}
