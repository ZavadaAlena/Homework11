package Task1;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;


public class Task1Test {
    public static void main(String[] args) {

        System.out.println((getNames()));

    }

    private static List<String> getNames() {
        List<String> namesOfPeoples = new ArrayList<>();

        namesOfPeoples.add("Evgenii");
        namesOfPeoples.add("Alena");
        namesOfPeoples.add("Victor");
        namesOfPeoples.add("Alina");
        namesOfPeoples.add("Lilia");
        namesOfPeoples.add("Victoria");

        for (int i = 0; i < namesOfPeoples.size(); i++) {
            namesOfPeoples.set(i, i + ". " + namesOfPeoples.get(i));

        }
        return namesOfPeoples.stream()
                .filter(i -> (namesOfPeoples.indexOf(i) % 2 != 0))
                .collect(Collectors.toList());

    }
}

