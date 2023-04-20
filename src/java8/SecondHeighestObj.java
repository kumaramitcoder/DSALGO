package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHeighestObj {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Amit","sales", 30000));
        list.add(new Employee(102,"Aman","mar", 28000));
        list.add(new Employee(103,"Kumar","fin", 32000));
        list.add(new Employee(104,"Sah","it", 45000));
        list.add(new Employee(105,"Lala","operations", 53000));
        list.add(new Employee(105,"Lala","operations", 63000));
        List<Integer> collect = list.stream()
                .map(e -> e.getSalary())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(collect);

        Optional<Integer> first = list.stream()
                .map(e -> e.getSalary())
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .skip(2)
                        .findFirst();

        System.out.println(first.get());


    }
}
