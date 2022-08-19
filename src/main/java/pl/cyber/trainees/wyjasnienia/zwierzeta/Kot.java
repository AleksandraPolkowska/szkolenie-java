package pl.cyber.trainees.wyjasnienia.zwierzeta;

/*
  Utwórz klasę Kot . Klasa ta powinna mieć następujące pola:

    imię (ciąg znaków)
    data urodzenia (data)
    waga (liczba zmiennoprzecinkowa)
    imię opiekuna (ciąg znaków)

  Klasa ta powinna też mieć jedną metodę o nazwie przedstawSie. Metoda ta nie przyjmuje żadnych argumentów i zwraca
        ciąg znaków, który jest zdaniem zawierającym imię kotka, jego datę urodzenia, wagę oraz imię opiekuna.
   */


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Kot extends Zwierze {


            private String imie;
            private final LocalDate dataUrodzenia;
            private Double waga;
            private String imieOpiekuna;

    public Kot(String imie, LocalDate dataUrodzenia, Double waga, String imieOpiekuna) {
        super(0.0, true);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public Kot(final Double wzrost, final boolean czyMaSiersc, final String imie, final LocalDate dataUrodzenia, final Double waga, final String imieOpiekuna) {
        super(wzrost, czyMaSiersc);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public String getImie(){
        return imie;
    }

    public Double getWaga(){
        return waga;
    }

    public String getImieOpiekuna(){
        return imieOpiekuna;
    }

    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }


    public String przedstawSie() {
        return "Zwracam dane o kocie: "
                + "\nimie " + this.imie
                + "\ndata urodzenia " + this.dataUrodzenia
                + " mój opiekun: " + this.imieOpiekuna
                + "waga" + this.waga;
 }


    @Override
    public String dajGlos() {
        return "miau";
    }
}


