package day19.lambda;

import java.util.ArrayList;
import java.util.List;

import static day19.lambda.Apple.Color.GREEN;
import static day19.lambda.Apple.Color.RED;
import static java.util.Comparator.comparing;

public class Sorting {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, GREEN));
        inventory.add(new Apple(155, GREEN));
        inventory.add(new Apple(120, RED));
        inventory.add(new Apple(90, GREEN));
        inventory.add(new Apple(110, RED));
        inventory.add(new Apple(50, RED));
        
        // 가벼운 사과 순으로 정렬
        /*inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) { // o1 < o2 --> negative : o1 comes first
                return o1.getWeight() - o2.getWeight();
            }
        });*/

        // anonymous class in lambda
        // inventory.sort((o1, o2) -> o1.getWeight() - o2.getWeight());

        // above code in more simple form
        // inventory.sort(Comparator.comparing(a -> a.getWeight()));

        // in simpler form
        inventory.sort(comparing(Apple::getWeight)); // can also do Apple::getPrice
        inventory.forEach(System.out::println);
    }
}
