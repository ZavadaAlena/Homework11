package Task1;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;


public class Task1Test {
    public static void main(String[] args) {
        List<String> namesOfPeoples = new ArrayList<>();
        namesOfPeoples.add("1. Evgenii");
        namesOfPeoples.add("2. Alena");
        namesOfPeoples.add("3. Victor");
        namesOfPeoples.add("4. Alina");
        namesOfPeoples.add("5. Lilia");
        namesOfPeoples.add("6. Victoria");
        System.out.println(getNames(namesOfPeoples));


    }

    private static List<String> getNames(List<String> peopleNames) {
        return peopleNames.stream()
                .filter(i -> (peopleNames.indexOf(i) % 2 == 0))
                .collect(Collectors.toList());

    }
}

