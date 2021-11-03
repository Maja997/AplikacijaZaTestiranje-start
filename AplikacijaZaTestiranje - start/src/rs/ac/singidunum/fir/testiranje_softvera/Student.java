package rs.ac.singidunum.fir.testiranje_softvera;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Student {
    private final String ime;
    private final String prezime;
    private final String brojIndeksa;
    private final List<Test> radjeniTestovi;

    /**
     * Konstruise objekat klase Student sa svim potrebnim podacima
     * @param ime Ime studenta
     * @param prezime Prezime studenta
     * @param brojIndeksa Broj indeksa studenta
     */
    public Student(String ime, String prezime, String brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.radjeniTestovi = new LinkedList<>();
    }

    /**
     * Vraca podatak o imenu studenta
     * @return Ime studenta
     */
    public String getIme() {
        return ime;
    }

    /**
     * Vraca podatak o prezimenu studenta
     * @return Prezime studenta
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Vraca podatak o broju indeksa studenta
     * @return Broj indeksa studenta
     */
    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    /**
     * Dodaje u evidenciju ovog studenta test koji je radio
     * @param radjeniTest Objekat klase test koji sadrzi podatke o radjenom testu
     */
    public void evidentirajRadjeniTest(Test radjeniTest) {
        this.radjeniTestovi.add(radjeniTest);
    }

    /**
     * Vraca broj poena na poslednjem radjenom testu (po datumu) za odredjeni
     * predmet cije ime je dato kao argument metoda. Ako student nikada nije
     * radio ni jedan test za ovaj predmet, metod vraca 0.
     * @param predmet Ime predmeta za koji se trazi broj poena na poslednjem radjenom testu
     * @return Broj poena na poslednjem radjenom testu za trazeni predmet ili 0 ako nikada nije radjen ni jedan test za taj predmet
     */
    public double getBrojPoenaZaPredmet(String predmet) {
        final Optional<Test> najnoviji =
            this.radjeniTestovi
                .stream()
                .filter(test -> test.getImePredmeta().equals(predmet))
                .sorted((r1, r2) -> r2.getDatumIso().compareTo(r1.getDatumIso()))
                .findFirst();

        if (!najnoviji.isPresent()) {
            return 0.;
        }

        return najnoviji.get().getBrojPoena(30);
    }
}
