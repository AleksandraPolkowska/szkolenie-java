package pl.cyber.trainees.service;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytDanych {
    public Integer wprowadzonaWartoscZklawiatury2;

    // praca domowa 1

    public Integer wprowadzonaWartoscZklawiatury2(){

    Scanner scanner = new Scanner(System.in);
        return scan.nextLine();
    }

    // koniec pracy domowej 1

    public String wporwadzonaWartoscZklawiatury(){
        // Scanner -- obiekt pozwalajacy na odczyt danych z klawiatury
        // system.in - obiekt reprezenujacy InputStream, ktory odpowiada za przetwarzanie danych
        Scanner scan = new Scanner(System.in);
        System.out.println(("Podaj liczbę typu Integer: "));

        return scan.nextInt();


        
    }
    public String daneZPliku(File plikZew) throws FileNotFoundException { // throws mowi aplikacji zeby pojawiajacy sie blad przeniesc do miejsca wykonania metody
        Scanner scan = new Scanner(plikZew);
        return scan.nextLine();
    }

   public Model daneOModeluPojazdu(File plikZew) throws FileNotFoundException
   {
       Model modelPojazdu = new Model();
    Scanner scan = new Scanner(plikZew);
       String liniaWpliku = scan.nextLine();
       String [] tablicaPliku = liniaWpliku.split(", ");
       modelPojazdu.setMarka(tablicaPliku[0]);
       modelPojazdu.setRocznik(tablicaPliku[1]);
       modelPojazdu.setNaped(tablicaPliku[2]);
       modelPojazdu.setNazwa(tablicaPliku[3]);
       modelPojazdu.setPrzebieg(Integer.valueOf(tablicaPliku[4]));
       modelPojazdu.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
       modelPojazdu.setKolor(Kolor.valueOf(tablicaPliku[6]));

    return modelPojazdu;

    // praca domowa 2
       public Model odczytSamochodu1(File plikZew) throws FileNotFoundException
       {
           Model samochod1 = new samochod1();
           Scanner scan = new Scanner(plikZew);
           String liniaWpliku = scan.nextLine();
           String [] tablicaPliku = liniaWpliku.split(", ");
           samochod1.setMarka(tablicaPliku[0]);
           samochod1.setRocznik(tablicaPliku[1]);
           samochod1.setNaped(tablicaPliku[2]);
           samochod1.setNazwa(tablicaPliku[3]);
           samochod1.setPrzebieg(Integer.valueOf(tablicaPliku[4]));
           samochod1.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
           samochod1.setKolor(Kolor.valueOf(tablicaPliku[6]));


           return odczytSamochodu1;
       }
    }
}
