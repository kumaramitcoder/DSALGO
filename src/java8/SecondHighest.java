package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighest {

    public static void main(String[] args) {
        Integer nums[] = new Integer[]{45,56,23,12,34,54,90};

        List<Integer> numbers = Arrays.asList(
                nums
        );

        System.out.println(numbers);

        List<Integer> collect = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(collect);


        Optional<Integer> first = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst();

        System.out.println(first);


    }


}
