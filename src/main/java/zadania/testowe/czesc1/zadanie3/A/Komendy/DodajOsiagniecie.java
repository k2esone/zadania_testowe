package zadania.testowe.czesc1.zadanie3.A.Komendy;

import zadania.testowe.czesc1.zadanie3.A.database.DataAccessObject;
import zadania.testowe.czesc1.zadanie3.A.models.Osiagniecie;

public class DodajOsiagniecie implements Komenda {

    DataAccessObject<Osiagniecie> dao = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "dodaj osiagniecie";
    }

    @Override
    public void obsluga() {

        System.out.println("Podaj typ");
        String typ = Komenda.scanner.nextLine();

        System.out.println("Podaj nazwe");
        String nazwa = Komenda.scanner.nextLine();

        System.out.println("Podaj opis");
        String opis = Komenda.scanner.nextLine();

        System.out.println("Podaj nagrode");
        String nagroda = Komenda.scanner.nextLine();

        Osiagniecie osiagniecie = Osiagniecie.builder()
                .typ(typ)
                .nazwa(nazwa)
                .opis(opis)
                .nagroda(nagroda)
                .build();

        dao.insert(osiagniecie);

    }
}
