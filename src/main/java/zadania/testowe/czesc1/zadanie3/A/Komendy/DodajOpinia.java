package zadania.testowe.czesc1.zadanie3.A.Komendy;

import zadania.testowe.czesc1.zadanie3.A.database.DataAccessObject;
import zadania.testowe.czesc1.zadanie3.A.models.Opinia;

public class DodajOpinia implements Komenda {

    DataAccessObject<Opinia> dao = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "dodaj opinia";
    }

    @Override
    public void obsluga() {

        System.out.println("Podaj typ");
        String typ = Komenda.scanner.nextLine();

        System.out.println("Podaj komentarz");
        String komentarz = Komenda.scanner.nextLine();

        int ocena = 0;
        do {
            System.out.println("Podaj ocene (1-10");
            String ocenaString = Komenda.scanner.toString();
            ocena = Integer.parseInt(ocenaString);
        } while (ocena < 1 || ocena > 10);

        Opinia opinia = Opinia.builder()
                .typ(typ)
                .komentarz(komentarz)
                .ocena(ocena)
                .build();

        dao.insert(opinia);

    }
}
