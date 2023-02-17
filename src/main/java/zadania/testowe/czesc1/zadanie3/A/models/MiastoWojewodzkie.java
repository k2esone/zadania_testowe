package zadania.testowe.czesc1.zadanie3.A.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MiastoWojewodzkie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;
    private String kodPocztowy;
    private Prezydent prezydent;
    private double wspolrzednaDlGeograficzna;
    private double wspolrzednaSzerGeograficzna;
    private int iloscMieszkancow;
    private List<Osiagniecie> osiagniecia;
    private List<Obywatel> obywatele;

}
