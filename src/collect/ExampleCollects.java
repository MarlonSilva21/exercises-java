package collect;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleCollects {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //toList - toSet
        List<Integer> collect2 = list.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect2);

        //joining
        String join = list.stream()
                .map(n -> n.toString())
                .collect(Collectors.joining(" "));

        System.out.println(join);

        //averaging
        Double media = list.stream()
                .collect(Collectors.averagingInt(n -> n.intValue()));

        System.out.println(media);

        //summing
        Integer soma = list.stream()
                .collect(Collectors.summingInt(n -> n.intValue()));

        System.out.println(soma);

        //summarizing
        IntSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingInt(n -> n.intValue()));

        System.out.println("IntSummaryStatics: ");

        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());

        //count
        Long collect3 = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(collect3);

        //groupingBy
        Map<Integer , List<Integer>> groupingBy = list.stream()
                .collect(Collectors.groupingBy(n -> n % 3));

        System.out.println(groupingBy);

        //partitioningBy
        Map<Boolean , List<Integer>> partitioningBy = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partitioningBy);

        //toMap
        Map<Integer , Integer> toMap = list.stream()
                .collect(Collectors.toMap(n -> n, n -> n * 2));

        System.out.println(toMap);


    }
}
