package application;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "993432428");

        cookies.remove("phone");

        System.out.println("All cookies: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
