package zadania.testowe.czesc1.zadanie1.A;

import java.util.List;
import java.util.Scanner;

public class MainA {
        // Note: nie wolono Ci zmieniać tej części kodu
        private static final List<String> IMIONA_DOZWOLONE = List.of(
                "Maria", "Ania", "Katarzyna", "Dawid", "Julia", "Bartosz");


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj imię do weryfikacji");
            String name = scanner.nextLine();
            String s = name.replace(".", "");
            String trim = s.trim();

            if (IMIONA_DOZWOLONE.contains(trim)){
                System.out.println(trim);
                System.out.println("Znaleziono dopasowanie");
            } else {
                System.out.println(trim);
                System.out.println("Brak dopasowania");
            }



        }
    }
