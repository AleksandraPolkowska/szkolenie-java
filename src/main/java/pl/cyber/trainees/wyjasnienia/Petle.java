package pl.cyber.trainees.wyjasnienia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Petle {

    /*
Pętla for i foreach

BUDOWA for
int i = 0 - inicjalizacja parametru początkowego 'do przechodzenia po pętli'
i<5 - warunek spełnienia kolejnego przejścia
i++ - inkrementacja wartości początkowej o 1
for(int i = 0; i<5; i++) {
//kod wykonania
//pritnln
//dodawnie w jakiś sposób
//dodawanie do listy elementy
}

JAK NIE STOSOWAĆ FOR
for(int i = 0; i<5; i++); {

}

PUŁAPKA:
for(int i = 0; i<5; i--); { -- tzw pętla nieskończona
 println(i);
 }

 for(int i = 0; i=-5; i++); { -- tzw pętla nieskończona
 println(i);
 }


 BUDOWA foreach
 for(TypDanych elementListy : lista) {
 }

 UWAGA!!!
 Usuwanie elementów z listy
 do rozwiązania usuwania elementów stosuję się wyłącznie for.
 for(int i = 0; i<5; i++) {
 lista.get(i)
 }

 List<>
 remove(); metoda do usuwania rekordów
   */

//  Zadanie nr 1
//  Wykonać metodę która przyjmie jako parametr List<BigDecimal>, następnie wykona następujące zagadnienia:
//  a) wyświetli każdy element listy jeden po drugim
//  b) każdy element listy doda do siebie.

    public void uruchom() {
        List<BigDecimal> lista = new ArrayList<>();
        lista.add(BigDecimal.valueOf(10.0));
        lista.add(BigDecimal.valueOf(2.0));
        lista.add(BigDecimal.valueOf(5.6));
        lista.add(BigDecimal.valueOf(21.8));
        lista.add(BigDecimal.valueOf(2.1));
        lista.add(BigDecimal.valueOf(41.0));
        lista.add(BigDecimal.valueOf(14.0));
        lista.add(BigDecimal.valueOf(1.0));
        lista.add(BigDecimal.valueOf(4.0));

        rozwiazanieZadania1(lista);
        pierwszyProgramWhile();
        petlaWszystkomajaca();

    }

    private void rozwiazanieZadania1(List<BigDecimal> list) {
        BigDecimal sumaLiczb = BigDecimal.ZERO;
        for (BigDecimal liczba : list) {
            System.out.println(liczba);
            sumaLiczb = sumaLiczb.add(liczba);

        }
    }


    //zadanie choinka, klasyczne 2 fory. Metoda będzie przyjmować 1 parametr jako wysokosc
    // nazwac metode

    private void choinkaRozbudowana(Integer wysokoscChoinki) {


        for (int wysokosc = 0; wysokosc < wysokoscChoinki; wysokosc++) {
            for (int szerokosc = 0; szerokosc < wysokoscChoinki * 2; szerokosc++) {
                if (szerokosc < (wysokoscChoinki - wysokosc) || szerokosc > (wysokoscChoinki + wysokosc)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    private void choinkaRozbudowana2(Integer wysokoscChoinki) {

        Integer maksymalnaLiczbaGwiazdek = (wysokoscChoinki * 2) - 1;
        System.out.println("Liczba gwiazdek w podstawie: " + maksymalnaLiczbaGwiazdek);
        System.out.println();

        for (int x = 1; x <= maksymalnaLiczbaGwiazdek; x += 2) {  //x = x + 2 ///  x++
            Integer spacje = (maksymalnaLiczbaGwiazdek - x) / 2;
            for (int y = 0; y < spacje + x; y++) {
                if (y < spacje) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // Utworzyc metode która wyświetli  liczby  od 1 do  100 (przejdzie po tych liczbach,
    // ale wyswietli tylko te ktore sa podzielne przez 5
    // oraz dodanie ich do siebie
    // a na koniec podanie ile ich znalazł

    public void liczbyPodzielnePrzez5() {
        Integer sumaLiczb = 0;
        Integer ilośćLiczb = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                sumaLiczb+=i; // lub sumaLiczb = sumaLiczb + i
                ilośćLiczb+=1;
            }
        }
        System.out.println(sumaLiczb);
        System.out.println(ilośćLiczb);
    }

    /*
  WHILE oraz  do While

while - słowo kluczowe określające deklarację pętli while
do - słowo kluczowe określające deklarację pętli do-while
(condition) - warunek, który określa nam zakończenie działania pętli, aby pętla while
zadziałała to piersze srawdzenie musi się nie spełniać
{} - rozpoczęcie i zakończenie bloku / struktury pętli w ramach tych nawiasów znajduje się kod funkcji, którą ma wykonać program

STRUKTURA DO ZAPAMIĘTANIA:
  while(condition) {
  //blok kodu
  }

  do {
  //blok kodu
  } while(condition)


int liczba = 1;

while(liczba = 1) {
println("to jest liczba: " + liczba);
liczba++;
}

do {
println("to jest liczba: " + liczba);
liczba++;
} while (liczba = 23)
   */

    private void pierwszyProgramWhile(){
        int liczba = 1;
        while (liczba < 1) {
            System.out.println("while, to jest liczba: " + liczba);
            liczba++;
        }
        do {
            System.out.println("do-while, to jest liczba: " + liczba);
            liczba++;
        } while (liczba <=23);
    }

    //wykonac for od 1 do 10 wyswietlic sumę FOR i nastepbie wykonac to samo przy uzyciu while/do-while
    // oraz wykorzystac if do porownania liczb, jesli sie uzgodnia to wyswietlamy true w przeciwnym wypadku false

private void petlaWszystkomajaca (){
    Integer sumaLiczbFor = 0;
    Integer sumaLiczbWhile = 0;
    int i = 1;
        for(i=1; i<11; i++){
        sumaLiczbFor += i;
        System.out.println(sumaLiczbFor);
    }

    i = 1;
            while (i < 11){
                sumaLiczbWhile +=i;
                i++;
                System.out.println(sumaLiczbWhile);
            }
     if(sumaLiczbFor == sumaLiczbWhile) {
         System.out.println(true);
     }else{
         System.out.println(false);

     }
    }

    // do domu metodę public void tylkoPodzielne() { przerobić na while.
    //zmienna o wartosci 1, wykozystaj while.
    // Podnos licznik x2 do momentu aż liczba nie przekroczy 100
    // oraz wyswietl ile razy pętla się wykonała

    }







