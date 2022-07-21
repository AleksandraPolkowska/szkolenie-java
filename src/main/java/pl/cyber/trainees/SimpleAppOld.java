package pl.cyber.trainees;


import pl.cyber.trainees.calculator.Dodawanie;
import pl.cyber.trainees.calculator.Mnozenie;
import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.service.OdczytDanych;
import pl.cyber.trainees.spotkania.Petle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SimpleAppOld {


    public static void main(String[] args) throws FileNotFoundException {

        // odczytujemy dane z klawiatury
        OdczytDanych odczytDanych = new OdczytDanych();
        System.out.println("Jak masz na imie?");
        String firstName = odczytDanych.wporwadzonaWartoscZklawiatury();
        System.out.println("Witaj" + firstName);

        String firstNameFromFile = odczytDanych.daneZPliku(new File( "src/main/resources/dane-zew.txt"));
        String modelPojazduZPliku = odczytDanych.daneZPliku(new File( "src/main/resources/modelPojazdu.txt"));
        System.out.println(firstNameFromFile);
        System.out.println(modelPojazduZPliku);

        // praca domowa zadanie 1
        // odczyt 5 intigerów z klawiatury

        OdczytDanych odczytDanych1 = new OdczytDanych();
        System.out.println("Podaj pierwszą liczbę całkowitą");
        Integer a = odczytDanych1.wprowadzonaWartoscZklawiatury2;
        System.out.println("Podaje drugą liczbę całkowitą");
        Integer b = odczytDanych.wprowadzonaWartoscZklawiatury2;
        System.out.println("Podaje trzecią liczbę całkowitą");
        Integer c = odczytDanych.wprowadzonaWartoscZklawiatury2;
        System.out.println("Podaje czwartą liczbę całkowitą");
        Integer d = odczytDanych.wprowadzonaWartoscZklawiatury2;
        System.out.println("Podaje piątą liczbę całkowitą");
        Integer e = odczytDanych.wprowadzonaWartoscZklawiatury2;

        List<Integer> liczbyCalkowite = new ArrayList<>(a, b, c, d, e);
        liczbyCalkowite.add(a);
        liczbyCalkowite.add(b);
        liczbyCalkowite.add(c);
        liczbyCalkowite.add(d);
        liczbyCalkowite.add(e);
        System.out.println("Dodawanie intigerów" + (a + b + c + d + e));
        // mnożenie? pętla for która by mnożyła każdą liczbę, ale nie wiem jak zapisać warunek

        public void mnozenieElementowListy liczbyCalkowite;
        (List <Integer> lista){
            Integer result = 10;

            for (Integer element : lista) {
                System.out.println("Teraz wykonuję mnożenie: " + element * result);
                result = Mnozenie.multiplication(result, element);

            }
        //drugi sposob?


        public static int add(a, b, c, d, e) {
            int result = a + b + c + d + e;
            return result;

            public static int multiplication (a, b, c, d, e){
                int result = a * 10, b * 10, c *10, d * 10, e * 10
                        return result
            }

            // koniec pracy domowej 1


        //Ctrl + P - podpowiadanie w użyciu metod / deklaracji obiektów dostępnych parametrów

        Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020", "przód", "Passat", 10000,
                2.0, Kolor.valueOf("ZIELONY"));
        var modelPojazdu3 = new Model("VW", "2000", "przód", "Passat", 30000,
                2.0, Kolor.valueOf("NIEBIESKI"));
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


        List<String> strings = new ArrayList<>();
        strings.add("jeden");
        strings.add("dwa");
        strings.add("trzy");
        System.out.println(strings);

       // praca domowa 2

       Model samochod1 = new Model();
       Model samochod2 = new Model();
       Model samochod3 = new Model();


       System.out.println(samochod1.toString());
       System.out.println(samochod2.toString());
       System.out.println(samochod3.toString());

        // metoda ktora policzy kilometry:

       // Integer przebieg (rozpisac dalej)

        //       metoda odczyt przebiegów z trzech plików w formie petli for
         //   nastepnie metoda ktora zsumuje powyzsze dane


        // notatki:

        // List<Double> listaDouble = new ArrayList<>(Arrays.asList( //ctrl+p oczekuje zmiennej w postaci doubla
        //       1.0,
        //       2.0,
        //       5.0,
        //      10.0,
        //      20.0
        // ));

        // listaDouble.add(30.0);

        //Petle petle = new Petle(); //tworzenie obiektu pętle
        //petle.wyswietlLiczby();//użycie metody z Pętle
        //System.out.println();
        //petle.dodawanieElementowListy(listaDouble);
        //petle.wyswietlSet();

    }
}

