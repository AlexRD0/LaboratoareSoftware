package lab9;

import org.apache.commons.math3.random.AbstractRandomGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    static void main() {
        List<Integer> list;
        Random random = new Random();
        list = IntStream.range(0, 10).boxed().map(i -> 5 + random.nextInt(21)).toList();
        list.stream().forEach(i -> System.out.print(i + " "));
        System.out.println();
        //int sum = 0;
        //list.stream().forEach(i->sum+=list[i]);
        int sum = list.stream().reduce(0, (a, b) -> a + b).intValue();
        int min = list.stream().min(Comparator.naturalOrder()).get().intValue();
        int max = list.stream().max(Comparator.naturalOrder()).get().intValue();
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);

        List<Integer> list2;
        list2 = list.stream().filter((a) -> ((a >= 10) && (a <= 20))).toList();
        list2.stream().forEach(i -> System.out.print(i + " "));
    }
}
