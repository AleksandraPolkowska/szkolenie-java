package pl.cyber.trainees;


import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
public class SimpleAppOld {


    public static void main(String[] args) {

        //Ctrl + P - podpowiadanie w użyciu metod / deklaracji obiektów dostępnych parametrów

        Model modelPojazdu1 = new Model ();
        var modelPojazdu2 = new Model ( "VW", "2020", "przód",  "Passat", 10000,
                2.0, Kolor.valueOf( "ZIELONY"));
        var modelPojazdu3 = new Model ( "VW", "2000", "przód",  "Passat", 30000,
                2.0, Kolor.valueOf( "NIEBIESKI"));
        modelPojazdu1.setKolor(Kolor.CZERWONY);
        modelPojazdu1.setMarka("Skoda");
        modelPojazdu1.setNazwa("Fabia");
        modelPojazdu1.setPrzebieg(12000);
        modelPojazdu1.setPojemnoscSilnika(1.4);
        modelPojazdu1.setNaped("przód");
        modelPojazdu1.setRocznik("1990");


        System.out.println(modelPojazdu1.toString());
        System.out.println(modelPojazdu1);
        //nie ma znaczenia której metody użyjemy, działa tak samo, ale program wyszarza to.String wiec lepiej to skasować

        System.out.println(modelPojazdu2.getMarka());
        System.out.println(modelPojazdu2.getNaped());
        System.out.println(modelPojazdu2.getNazwa());

    }

}