package zadania.testowe.czesc1.zadanie3.A.Komendy;

import zadania.testowe.czesc1.zadanie3.A.database.DataAccessObject;
import zadania.testowe.czesc1.zadanie3.A.models.MiastoWojewodzkie;
import zadania.testowe.czesc1.zadanie3.A.models.Prezydent;

import java.util.Optional;

public class DodajMiastoWojewodzkie implements Komenda{

    DataAccessObject<MiastoWojewodzkie> dao = new DataAccessObject<>();
    DataAccessObject<Prezydent> daoPrezydent = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "dodaj miasto wojewodzkie";
    }

    @Override
    public void obsluga() {
        System.out.println("Podaj nazwe miasta");
        String nazwa = Komenda.scanner.nextLine();

        System.out.println("Podaj kod pocztowy");
        String kodPocztowy = Komenda.scanner.nextLine();

        System.out.println("Podaj id prezydenta");
        String idPrezydentaString = Komenda.scanner.nextLine();
        long id = Long.parseLong(idPrezydentaString);

        Optional<Prezydent> prezydent = daoPrezydent.find(Prezydent.class, id);
        if (prezydent.isEmpty()) {
            System.err.println("Nie znaleziono prezydenta");
            return;
        }

        System.out.println("Podaj wspolrzedna dlugosc geograficzna");
        String dlString = Komenda.scanner.toString();
        double dlugosc = Double.parseDouble(dlString);

        System.out.println("Podaj wspolrzedna szerokosc geograficzna");
        String szerString = Komenda.scanner.toString();
        double szerokosc = Double.parseDouble(szerString);

        System.out.println("Podaj ilosc mieszkancow");
        String iloscString = Komenda.scanner.toString();
        int ilosc = Integer.parseInt(iloscString);

        MiastoWojewodzkie miastoWojewodzkie = MiastoWojewodzkie.builder()
                .nazwa(nazwa)
                .kodPocztowy(kodPocztowy)
                .prezydent(prezydent.get())
                .wspolrzednaDlGeograficzna(dlugosc)
                .wspolrzednaSzerGeograficzna(szerokosc)
                .iloscMieszkancow(ilosc)
                .build();

        dao.insert(miastoWojewodzkie);
    }
}
