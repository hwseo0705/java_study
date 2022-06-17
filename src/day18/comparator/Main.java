package day18.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> pList = new ArrayList<>();
        pList.add(new Person("Haewon", 25));
        pList.add(new Person("Julie", 10));
        pList.add(new Person("Seo", 30));
        pList.add(new Person("Kang", 21));

        // 나이 순으로 오름차 정렬 (sort according to age)
        // pList.sort(new AgeAscendingComparator()); // Comparator : a functional interface (1 abstract method)

        // what if I want to sort in descending order
        // you don't want to create a new Comparator class for each
        // so you can just do the following

        /*pList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        // even better, use lambda
        // ascending
        pList.sort((o1, o2) -> (o1.getAge() - o2.getAge()));
        // descending
        pList.sort((o1, o2) -> (o2.getAge() - o1.getAge()));

        // what if I want to compare string?
        pList.sort(new NameAscendingComparator());

        // but this can also be done with anonymous class
        pList.sort(new Comparator<Person>() { // ascending, (descending = o2, o1 change positions)
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // but this can also be done with lambda
        // ascending
        pList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        // descending
        pList.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));

        for (Person p : pList) {
            System.out.println(p);
        }
    }
}
