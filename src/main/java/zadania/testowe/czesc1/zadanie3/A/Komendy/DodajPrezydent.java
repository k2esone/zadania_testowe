package zadania.testowe.czesc1.zadanie3.A.Komendy;

import zadania.testowe.czesc1.zadanie3.A.database.DataAccessObject;
import zadania.testowe.czesc1.zadanie3.A.models.Prezydent;

public class DodajPrezydent implements Komenda {

    DataAccessObject<Prezydent> dao = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "dodaj prezydent";
    }

    @Override
    public void obsluga() {

        System.out.println("Podaj imie");
        String imie = Komenda.scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String nazwisko = Komenda.scanner.nextLine();

        System.out.println("Podaj lata urzedowania");
        String lataUrzedowania = Komenda.scanner.nextLine();

        Prezydent prezydent = new Prezydent();
        prezydent.setImie(imie);
        prezydent.setNazwisko(nazwisko);
        prezydent.setLataUrzedowania(lataUrzedowania);

        dao.insert(prezydent);


    }
}
