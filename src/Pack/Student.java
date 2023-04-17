package Pack;

import java.util.*;

public class Student {
    public static void main(String[] args) {
        HashMap<String, Integer> catalog = new HashMap<>();
        catalog.put("Mihaita", 8);
        catalog.put("Mihai", 9);
        catalog.put("Mihaila", 10);
        Set<Map.Entry<String, Integer>> entries = catalog.entrySet();
        System.out.println(entries);
        System.out.println(greatestGradedStudent(catalog));

    }

    public static String greatestGradedStudent(HashMap<String, Integer> catalog) throws NoSuchElementException {
        int NotaMax;
        String key=" ";
         NotaMax = (Collections.max(catalog.values()));
        for (Map.Entry<String, Integer> entry : catalog.entrySet()) {

            if (entry.getValue() == NotaMax) {

                key = entry.getKey();

            }

        } return key;
    }
}