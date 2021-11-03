package rs.ac.singidunum.fir.testiranje_softvera;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    void getImePredmeta() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t= new rs.ac.singidunum.fir.testiranje_softvera.Test(
                "Ime predmeta", "...","30","30"
        );
        Assertions.assertEquals("Ime predmeta",t.getImePredmeta());
    }

    @Test
    void getDatumIso() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t= new rs.ac.singidunum.fir.testiranje_softvera.Test(
                "Ime predmeta", "2014-12-11","30","20"
        );
        Assertions.assertEquals("2014-12-11",t.getDatumIso());
    }

    @Test
    void getBrojPitanja() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t= new rs.ac.singidunum.fir.testiranje_softvera.Test(
                "Ime predmeta", "2014-12-11","30","20"
        );
        Assertions.assertEquals("20",t.getBrojPitanja());
    }

    @Test
    void getBrojTacnihOdgovora() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t= new rs.ac.singidunum.fir.testiranje_softvera.Test(
                "Ime predmeta", "2014-12-11","30","20"
        );
        Assertions.assertEquals("20",t.getBrojTacnihOdgovora());
    }

    @Test
    void getProcenatTacnihOdgovora() {
        rs.ac.singidunum.fir.testiranje_softvera.Test t= new rs.ac.singidunum.fir.testiranje_softvera.Test(
                "Ime predmeta", "2014-12-11","30","15"
        );
        Assertions.assertEquals("50.0",t.getProcenatTacnihOdgovora());
    }


    @Test
    void getBrojPoena() {rs.ac.singidunum.fir.testiranje_softvera.Test t= new rs.ac.singidunum.fir.testiranje_softvera.Test(
            "Ime predmeta", "2014-12-11","30","30"
    );
        Assertions.assertEquals("20.0",t.getBrojPoena(40));
    }

    @Test
    void testToStringTest() {rs.ac.singidunum.fir.testiranje_softvera.Test t= new rs.ac.singidunum.fir.testiranje_softvera.Test(
            "Ime predmeta", "2014-12-11","30","15"
    );
        String ocekivano = "Ime predmeta;2014-12-11;15;30;50.00";
                String dobiliSmo =t.toString();

        Assertions.assertEquals(ocekivano,dobiliSmo);
    }
}