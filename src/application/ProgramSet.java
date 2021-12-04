package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Tablet");
        set.add("Notebook");
        set.add("Tv");

        set.removeIf(x -> x.length() >=3);

        System.out.println(set.contains("Tv"));

        for (String p: set){
            System.out.println(p);
        }

        System.out.println();

        Set<String> set1 = new TreeSet<>();

        set1.add("Tablet");
        set1.add("Notebook");
        set1.add("Tv");

        System.out.println(set1.contains("Tv"));

        for (String p: set1){
            System.out.println(p);
        }

        System.out.println();

        Set<String> set2 = new LinkedHashSet<>();

        set2.add("Tablet");
        set2.add("Notebook");
        set2.add("Tv");

        System.out.println(set2.contains("Tv"));

        for (String p: set2){
            System.out.println(p);
        }

    }
}
