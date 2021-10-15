package application;

import java.util.Arrays;

public class babi {
    public static void main(String[] args) {

        int[] array = {100, 100, 100, 20, 50, 30, 14, 100, 100, 100};

        Arrays.sort(array);

        int [] arrayCorrect = new int[array.length - 2];

        System.arraycopy(array, 1, arrayCorrect, 0, array.length - 2);

        int total = Arrays.stream(arrayCorrect).sum();

        int average = total / arrayCorrect.length;

        System.out.println(average);
    }
}
