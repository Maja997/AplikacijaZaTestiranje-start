package rs.ac.singidunum.fir.testiranje_softvera;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getIme() {
        Student s = new Student(
                "Ime studenta", "Prezime studenta","2014500100"
        );
        Assertions.assertEquals("Ime studenta", s.getIme());
    }

    @Test
    void getPrezime() {
    }

    @Test
    void getBrojIndeksa() {
    }

    @Test
    void evidentirajRadjeniTest() {
    }

    @Test
    void getBrojPoenaZaPredmet() {
    }
}