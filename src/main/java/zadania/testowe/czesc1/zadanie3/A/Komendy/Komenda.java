package zadania.testowe.czesc1.zadanie3.A.Komendy;

import java.util.Scanner;

public interface Komenda {
    Scanner scanner = new Scanner(System.in);

    String getKomenda();

    void obsluga();
}
