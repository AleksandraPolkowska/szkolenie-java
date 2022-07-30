package pl.cyber.trainees; ////1. Konstrukcja klass i metod

//package pl.cyber.trainees; // oreślenie pakietu wramach projektu, gdzie
// znajduje się nasza klasa.
//pole package ustawia się automatycznie jeśli nasz plik zawiera się w odpowiedniej strukturze
//katalogów tj src/main/java/......
//w naszym przykładzie src/main/java/pl.cyber.trainees

//region miejsce na importy
import java.io.File;  //importy zazwyczaj dodają się same ewemtualnie można je dodać poprzez Ctrl + Enter
//poprzez importy powinniśmy rozumieć użycie dodatkowych bibliotek w naszej klasie
//endregion


import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.wyjasnienia.Basics;
import pl.cyber.trainees.wyjasnienia.BasicsIntiger;
import pl.cyber.trainees.wyjasnienia.InstrukcjeWarunkowe;
import pl.cyber.trainees.wyjasnienia.Petle;

//Linia public class SimpleApp. Opisuje definicję klasy o nazwie SimpleApp.
//modyfikator dostępu klasy public / private
//class - słowo kluczowe określające definicję klasy
//SimpleApp - nazwa klasy tutaj nazwa może być dowolna, aby była zgodna z dwoma warunkami:
//1) Nazwa pliku i nazwa klasy musi się równać
//2) Nazwy klas zawsze piszemy CamelCase'm z zastrzeżeniem że pierwsza litera i każda kolejna nowego wyrazu jest pisana
//z wielkiej litery
//Cały kod w klasie powinien być zapisany w jej ramach które określone są poprzez nawiasy {} poza klasą
//nie może być żadnego kodu, natomiast przed klasą możemy jedynie pisać import'y oraz package.



public class SimpleAppOld {

    //w ramach klasy deklarujemy zmienne globalne oraz metody
    public static String SEPARATOR_SPACJA = " "; // zmienna globalna dostępna w całej klasie.
    //konstrukcja zmiennych globalnych
    //modyfikator dostępu
    //słowo kluczowe statis - okresla, że nasza zmienna jest statyczna
    //TypDanych
    //nazwa zmiennej. Dobra praktyka jest aby nazwa zmiennej globalnej była pisania drukowanymi literamia kolejne słowa oddzielamy znakiem _
    //następne przypisanie wartości

    // Deklaracja metod
    // W przypapdku metody uruchomieniowej powinna występować tylko raz w całym rpojekcie
    // Kontrukcja metody uruchomieniowej: modyfikator dostępu zawsze jako public, słowo kluczowe static, typ metody zawsze void
    //nazwa metody zawsze main, parametry wejściowe metody (może ich nie być) ale z reguły powinna być to tablica args (tj. String[]args)
    // metody zawsze mają zwykłe nawiasy () a ciało metody w {}


    public static void main(String[] args) {

        // UWAGA NALEŻY PILNOWAĆ KLAMR METODY {} ABY NIE PISAĆ METODY W METODZIE
        // w ramach emtody uruchomieniowej możemy deklarować zmeinne oraz pisać kod, ale dobrą praktyką jest aby ta metoda
        //  wywoływała tylko konkretne klasy z kodem, ktory chcemy uruchomić (a znajduje sie w innych zakładkach)
        // nie wolno pisac metody main w innych klasach niz uruchomieniowa(główna)
        //w tym miejscu możemy deklarować kolejne metody ich ilość dowolna, ale lepiej nie przekraczać 200 linii kodu
        //Nalezy pamiętać, że metody funkcjonalne (inna niż main) deklarujemy w taki sposób:
        //nie mają słówka static, modyfikator może być public private protected lub deafult
        //nastepnie typ zwracanych informacji String, Integer, BigDecimal/Model itp
        // jeśli chcemy aby metoda zwracała konkretny typ danych i była możliwa do użycia w innym miejscu klasy czy
        // musi sie pojawic slowko return.
        // ale metoda moze nic nie zwracać, wtedy musi mieć void
        // returna może nie być przy metodach voidowych, ale w innych przypadkach musi byc i w dodatku miec okreslone
        // jaki typ danych ma zwracac
        // metody powinny byc zwiezle i robic pojedyncze, konkretne rzeczy maksymalnie zawezone operacje

        Basics testKonstr = new Basics(124);
        Basics basics = new Basics();
        basics.wyswietlTekst1("Jakiś tekst do wyświetlenia");

        //drugie rozwiązanie
        Basics basics2 = new Basics(" Nowy tekst do wyświetlenia ");
        basics2.wyswietlTekst2("Jakiś tekst do wyświetlenia");


        //trzecie rozwiązanie
        Basics basics3 = new Basics("tekst1", "tekst2", " tekst3");
        basics3.wyswietlTekst3("Jakiś tekst do wyświetlenia");

        BasicsIntiger basicsIntiger = new BasicsIntiger();
        basicsIntiger.wyswietlLiczbe1(1234);

        BasicsIntiger basicsIntiger2 = new BasicsIntiger();
        basicsIntiger2.wyswietlLiczbe2(1234);

        BasicsIntiger basicsIntiger3 = new BasicsIntiger();
        basicsIntiger3.sumowanie("Wynik dodawania", 1, 2);

        // alternatywa dłuższa gorsza
        //Integer a = 1;
        //Integer b = 2;
        //basicsIntiger.sumowanie (w, a, b);

        String tekst = "wynik";
//        Basics basics = new Basics();
        basics.wyswietlTekst1(tekst + basicsIntiger.wynikDodawaniaIntegerow(1, 2));


        InstrukcjeWarunkowe instrukcjeWarunkowe = new InstrukcjeWarunkowe();
        //InstrukcjeWarunkowe.sprawdzanieWarunku(1);

        Petle petle = new Petle();
        petle.uruchom();
        petle.liczbyPodzielnePrzez5();
        instrukcjeWarunkowe.wyswietlSwitch(5);
        instrukcjeWarunkowe.petlaZeSwitchem();
        instrukcjeWarunkowe.uruchom();
    }

    public String nazwaMEtoda() { //nawias może być pusty lub uzupełniony
        return "";
    }

    private Integer kolejnaNazwaMetody() {
        // w tym miejscu możliwe jest deklarowanie zmiennych
        // używanie instrukcji warunkowych
        // używanie pętli
        // używanie innych metod lub odwoływanie się do innych metod klas przez wcześniejszą deklarację
        return 0;

    }




}

/*
  Warte zapamiętania
  konstrukcja klasy

 public class NazwaKlasy {

 }


 Konstrukcja metody w klasie

  public class NazwaKlasy {

   public void nazwaMetody() {

   }

 }


 Błędne konstrukcje metod: TAK NIE PISAĆ

  public class NazwaKlasy {

     public String metodaA();
      -- brak rozpoczęcia i zakończenia metody przez {}
      i metody nie posiadają ;

     String public metodaB() {
     --najpierw modyfikator następnie zwracany typ danych
     }

     public metodaC() {
 -- brak typu danych
 -- nawias zamykający


      public String metodaD() {
          public String metodaE(){
          }
      }

 }


   */
