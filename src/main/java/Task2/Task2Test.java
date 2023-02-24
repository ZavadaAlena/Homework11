package Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Task2Test {
    public static void main(String[] args) {
        List<String> namesOfPeople = new ArrayList<>();
        namesOfPeople.add("Evgenii");
        namesOfPeople.add("Alena");
        namesOfPeople.add("Victor");
        namesOfPeople.add("Alina");
        namesOfPeople.add("Lilia");
        namesOfPeople.add("Victoria");
        System.out.println(getNames(namesOfPeople));

    }

    private static List<String> getNames(List<String> peopleNames) {
        return peopleNames.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.comparing(String::trim).reversed())
                .collect(Collectors.toList());
    }
}

