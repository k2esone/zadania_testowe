package zadania.testowe.czesc1.zadanie3.A.Komendy;

import zadania.testowe.czesc1.zadanie3.A.database.DataAccessObject;
import zadania.testowe.czesc1.zadanie3.A.models.Prezydent;
import zadania.testowe.czesc1.zadanie3.A.models.PrezydentMiasta;

public class DodajPrezydentMiasta implements Komenda{

    DataAccessObject<PrezydentMiasta> dao = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "dodaj prezydent miasta";
    }

    @Override
    public void obsluga() {

        System.out.println("Podaj imie");
        String imie = Komenda.scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String nazwisko = Komenda.scanner.nextLine();

        System.out.println("Podaj lata urzedowania");
        String lataUrzedowania = Komenda.scanner.nextLine();

        System.out.println("Podaj miasto prezydentury");
        String miasto = Komenda.scanner.nextLine();

        PrezydentMiasta prezydentMiasta = new PrezydentMiasta();
        prezydentMiasta.setImie(imie);
        prezydentMiasta.setNazwisko(nazwisko);
        prezydentMiasta.setLataUrzedowania(lataUrzedowania);
        prezydentMiasta.setMiastoPrezydentury(miasto);

    }
}
