package pl.cyber.trainees.service;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytDanych {
    public String wporwadzonaWartoscZklawiatury(){
        // Scanner -- obiekt pozwalajacy na odczyt danych z klawiatury
        // system.in - obiekt reprezenujacy InputStream, ktory odpowiada za przetwarzanie danych
        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
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
    }
}
