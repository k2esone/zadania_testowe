package zadania.testowe.czesc1.zadanie3.A;

import zadania.testowe.czesc1.zadanie3.A.Komendy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Komenda> listKomend = new ArrayList<>(
                List.of(
                        new DodajMiastoWojewodzkie(),
                        new DodajObywatel(),
                        new DodajOpinia(),
                        new DodajOsiagniecie(),
                        new DodajPrezydent(),
                        new DodajPrezydentMiasta()
                )
        );

        String komenda;
        do {
            System.out.println("Lista dostepnych komend:");
            for (int i = 0; i < listKomend.size(); i++) {
                System.out.println(i + 1 + ". " + listKomend.get(i).getKomenda());
            }
            System.out.println("Podaj komende:");
            komenda = Komenda.scanner.nextLine();

            for (Komenda dostepnaKomenda : listKomend) {
                if (dostepnaKomenda.getKomenda().equalsIgnoreCase(komenda)) {
                    dostepnaKomenda.obsluga();
                }
            }
        } while (!komenda.equalsIgnoreCase("exit"));
    }
}
