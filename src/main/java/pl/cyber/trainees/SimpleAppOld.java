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
        System.out.println(modelPojazdu1.toString());
        System.out.println(modelPojazdu1);

        System.out.println(modelPojazdu2.getMarka());
        System.out.println(modelPojazdu2.getNaped());
        System.out.println(modelPojazdu2.getNazwa());

    }

    }
