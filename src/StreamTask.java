import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamTask {
    public static void main(String[] args) {
        int[] array = {9, 3, 5, 7, 2, 8, 2, 1, -2, -7, 0, 0};
        int number = 4;

        System.out.println(IntStream.of(array).average().getAsDouble());

        IntStream.range(0, array.length)
                .mapToObj(i->i)
                .collect(Collectors.toMap(i->i, i->array[i]))
                .entrySet()
                .stream()
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((k,v)-> System.out.println(v + "["+ k + "]"));

        System.out.println(IntStream.of(array).filter(p -> p > 0).count());

        System.out.println(IntStream.of(array).filter(p -> p == 0).count());

        IntStream.of(array).map(x -> x * number).forEach(x -> System.out.print(x + " "));



    }
}
