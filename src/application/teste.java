package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class teste {
    public static void main(String[] args) {
        System.out.println(calculation(new Scanner(System.in).nextInt()));
    }

    private static List<Integer> calculation(int maxDigit) {
        return listOfNumbersWithMaxSum(21).stream().filter(i -> {
            List<Integer> numbers = Arrays.stream(Integer.toString(i).split(""))
                    .map(Integer::parseInt).collect(Collectors.toList());

            return numbers.stream().allMatch(num -> num <= maxDigit);
        }).collect(Collectors.toList());
    }

    private static List<Integer> listOfNumbersWithMaxSum(int maxSum) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i < 10000; i++) {
            Integer sum = Arrays.stream(Integer.toString(i).split(""))
                    .map(Integer::parseInt).reduce(0, Integer::sum);

            if (sum == maxSum) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}
