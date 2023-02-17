package zadania.testowe.czesc1.zadanie1.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainB {
    // Note: nie wolono Ci zmieniać tej części kodu
    private static final List<String> IMIONA_DOZWOLONE = List.of(
            "Maria", "Ania", "Katarzyna", "Dawid", "Julia", "Bartosz");


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość imion do weryfikacji");
        String quantityString = scanner.nextLine();
        int quantity = Integer.parseInt(quantityString);

        List<String> listOfNames = new ArrayList<>();
        List<String> list = new ArrayList<>();


        for (int i = 0; i < quantity; i++) {
            System.out.println("Podaj imię do weryfikacji");
            String name = scanner.nextLine();
            String s = name.replace(".", "");
            String trim = s.trim();
            listOfNames.add(trim);
        }

        for (int i = 0; i < listOfNames.size(); i++) {
            if (IMIONA_DOZWOLONE.contains(listOfNames.get(i))) {
            list.add(listOfNames.get(i));
            }

        }
        System.out.println("Znaleziono dopasowanie dla " + list);
    }
}
