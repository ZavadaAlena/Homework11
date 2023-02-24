package Task1;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;


public class Task1Test {
    public static void main(String[] args) {
        List<String> peopleOfNames = new ArrayList<>();
        peopleOfNames.add("1. Evgenii");
        peopleOfNames.add("2. Alena");
        peopleOfNames.add("3. Victor");
        peopleOfNames.add("4. Alina");
        peopleOfNames.add("5. Lilia");
        peopleOfNames.add("6. Victoria");
        System.out.println(getNames(peopleOfNames));


    }

    private static List<String> getNames(List<String> peopleNames) {
        return peopleNames.stream()
                .filter(i -> (peopleNames.indexOf(i) % 2 == 0))
                .collect(Collectors.toList());

    }
}

