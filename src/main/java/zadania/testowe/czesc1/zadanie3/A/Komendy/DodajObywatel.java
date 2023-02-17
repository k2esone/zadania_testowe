package zadania.testowe.czesc1.zadanie3.A.Komendy;

import zadania.testowe.czesc1.zadanie3.A.database.DataAccessObject;
import zadania.testowe.czesc1.zadanie3.A.models.Obywatel;

import java.util.Locale;

public class DodajObywatel implements Komenda{

    DataAccessObject<Obywatel> dao = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "dodaj obywatel";
    }

    @Override
    public void obsluga() {

        System.out.println("Podaj imie");
        String imie = Komenda.scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String nazwisko = Komenda.scanner.nextLine();

        Obywatel obywatel = Obywatel.builder()
                .imie(imie)
                .nazwisko(nazwisko)
                .build();

        dao.insert(obywatel);

    }
}
