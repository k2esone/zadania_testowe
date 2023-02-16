package zadania.testowe.czesc1.zadanie2.A;

import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar choinki");
        int size = scanner.nextInt();

        String stars = "*";
        String spaces = " ";
        int starsCount = 0;
        int spacesCount = 0;

        System.out.println("Podaj rozmiar choinki: " + size);
        for (int i = 0; i < size; i++) {
            for (int j = size-1; j > spacesCount; j--) {
                System.out.print(spaces);
            }
            spacesCount++;
            for (int j = 0; j <= starsCount; j++) {
                System.out.print(stars);
            }
            starsCount += 2;

            System.out.println();
        }
    }
}
