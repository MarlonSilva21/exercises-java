package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramGenericsCuringa {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStr = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStr);

    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

/*
* Não é possível adicionar elementos em uma lista do tipo curinga
* */