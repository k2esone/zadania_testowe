package zadania.testowe.czesc1.zadanie2.B;

import java.util.Random;
import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar choinki");
        int size = scanner.nextInt();

        double number = 0.0;

        do {
            System.out.println("Podaj prawdopodobieństwo wystąpienia bombki (0.1 - 1.0)");
            number = scanner.nextDouble();
        } while (number < 0.1 || number > 1.0);

        Random random = new Random();

        String stars = "*";
        String spaces = " ";
        int starsCount = 0;
        int spacesCount = 0;

        System.out.println("Podaj rozmiar choinki: " + size);
        System.out.println("Podaj prawdopodobieństwo wystąpienia bombki: " + number);
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > spacesCount; j--) {
                System.out.print(spaces);
            }
            spacesCount++;
            for (int j = 0; j <= starsCount; j++) {
                if (random.nextDouble() <= number)
                    System.out.print("o");
                else {
                    System.out.print(stars);
                }
            }
            starsCount += 2;

            System.out.println();
        }
    }
}
