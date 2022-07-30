package pl.cyber.trainees.wyjasnienia;

import java.sql.SQLOutput;

public class InstrukcjeWarunkowe {

    public void uruchom(){
        jakaPlec(Plec.KOBIETA); // wywoalnie metody ktora jest nizej i jest przekazywana do simple app


    }
   /*
Instrukcja warunkowa if

BUDOWA if'a

CONDITION (boolean) - inaczej warunek sprawdzający np i<0, a+b = 2, 2%2 = 0 itp.

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
}

if(2+2 = 4) {
println("dodawanie równe 4");
}

else - potocznie w przeciwnym wypadku

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else {
 //pojawić się powinien kod jeśli warunek nie został spełniony (false)
}

a+b = 4
if(2+2 = 4) {
println("dodawanie równe 4");
} else {
println("dodawanie nie równe 4");
}

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else if(COUNDITION 2) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else {
 //pojawić się powinien kod jeśli warunek nie został spełniony (false)
}

a+b = 4
if(2+2 = 4) {<- zostanie wyświetlone
println("dodawanie równe 4");
} else if(2+1 = 3) {
println("dodawanie równe 3");
 } else {
println("dodawanie nie równe 4");
}


a+b = 4
if(2+5 = 4) { <- false
println("dodawanie równe 4");
} else if(2+1 = 3) { <- true
println("dodawanie równe 3"); <- zostanie wyświetlone
 } else {
println("dodawanie nie równe 4");


a+b = 4
if(2+5 = 4) { <- false
println("dodawanie równe 4");
} else if(2+2 = 3) { <- false
println("dodawanie równe 3");
 } else {
println("dodawanie nie równe 4"); <- zostanie wyświetlone
}


 */

    // Utworzyć metode ktora zwróci true/false jesli podana liczba w parametrze nie jest równa 10


    public boolean sprawdzanieWarunku (Integer a){
    if (a != 10) {
        return true;

    } else {
        return false;
    }
    }

   // switch (condition) {
   //     case 1:
   //         break;
    //    case 2:
   //         break;

   //     .
   //     .
   //     .
   //     default:

    /*
  SWITCH



  switch (condition) {
      case "1":  //  condition == "1"
        println("To jest poniedziałek");
        break;
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;
      case "2":  //  condition == "2"
      println("To jest wtorek");
        break;
      case "Wtorek":  //  condition == "Wtorek"
      println("To jest wtorek");
        break;
        .
        .
        .
      default:
        println("b/d");

    }

    switch (condition) {
      case "1":  //  condition == "1"
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;
      case "2":  //  condition == "2"
        break;
      case "Wtorek":  //  condition == "Wtorek"
        break;
        .
        .
        .
      default:
        println("b/d");

    }


    równoznaczne zapisy

      case "1":  //  condition == "1"
        println("To jest poniedziałek");
        break;
      case "Poniedziałek":
        println("To jest poniedziałek
równoznaczne zapisy

      case "1":  //  condition == "1"
        println("To jest poniedziałek");
        break;
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;


     case "1":  //  condition == "1"
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;


    if(conditon = 1 || conditon = "Poniedziałek") {
      println("To jest poniedziałek");
    }



    np.
    switch (zmienna) {
    case "ala":
        println("Tak");
        break;
    }

    równoznaczne zapisy

      case "1":  //  condition == "1"
        println("To jest poniedziałek");
        break;
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;


     case "1":  //  condition == "1"
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;


    if(conditon = 1 || conditon = "Poniedziałek") {
      println("To jest poniedziałek");
    }



    np.
    switch (zmienna) {
    case "ala":
        println("Tak");
        break;
    }


    switch - słowo kluczowe określające instrukcję warunkową
    (condition) zmienna warunkowa, którą będziemy badali
    ciało switch'a zawsze określamy poprzez nawiasy {}

    aby weryfikować zmienną warunkową musimy użyć 'case', inaczej przypadków, które oczekujemy

    przypadków do sprawdzania możemy użyć od 1 do n (przykłąd poniżej)

Ważene:
    Wartość case musi być stała lub literana. Nie możemy używać zmiennych
    Wszystkie wartości case muszą byc unikalne

    Każda instrukcja case może (ale nie musi) mieć instrukcję break.
    Jest ona opcjonalna. Gdy Java natrafi na instrukcję break, zakończy wykonanie instrukcji switch.
    Jeśli instrukcja break nie zostanie znaleziona, sprawadzany jest następny przypadek (następny case).


Przykład:
    np. weryfikacje wprowadzonego alfabetu jako konkretna litera alfabetu tj. a -> z
    np. weryfikacja wprowadzonych liczb od 1 do n

    switch (condition) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case n:
          break;
        default:
    }

alternatywa powyższego w postaci if:
if(condition == 1) {
} else if(condition == 2) {

} else if(condition == 3) {

} else if(condition == 4) {

} else if(condition == n) {

} else {

}

switch(condition) {
  case x:
    // Blok kodu, jeśli wartość x zgadza się ze zmianną warunkową
    break;
  case y:
    // Blok kodu, jeśli wartość y zgadza się ze zmianną warunkową
    break;
  default:
    // Blok kodu, gdy nie jest spełniony żaden z powyższych przypadków
}




   */
// zadanie. Utworz metode, która na podany parametr wejściowy (wyswietli odpowiadający dzien tygodnia
public void wyswietlSwitch (Integer jakiDzienTygodnia) {

    switch (jakiDzienTygodnia) {
        case 1:
            System.out.println("Poniedziałek");
            break;
        case 2:
            System.out.println("Wtorek");
            break;
        case 3:
            System.out.println("Środa");
            break;
        case 4:
            System.out.println("Czwartek");
            break;
        case 5:
            System.out.println("Piątek");
            break;
        case 6:
            System.out.println("Sobota");
            break;
        case 7:
            System.out.println("Niedziela");
            break;
        default:
            System.out.println("Nieprawidłowy dzień");
    }


}

/*

Zadanie Wykonać metodę która będzie iterować od 1 do 50 i wyświetli w konsoli odpowiednie napisy:

dla 0 → Wyświetlam zero
dla 5 → Wyświetlam 5
dla 10 → To jest 10
dla 30 → To jest liczba 30
dla 49 → To jest liczba 49
dla pozostałych → Wskazana liczba jest inna niż oczekiwana
*/
public void petlaZeSwitchem (){

    for (int i = 0; i<51; i++){
        switch (i){
            case 0: System.out.println("Wyświetlam zero"); break;
            case 5: System.out.println("Wyświetlam pięć"); break;
            case 10: System.out.println("To jest dziesięć"); break;
            case 30: System.out.println("To jest liczba 30"); break;
            case 49: System.out.println("To jest liczba 49"); break;
            default: System.out.println("Wskazana liczba jest inna niż oczekiwana");
        }

    }
}
enum Plec {KOBIETA, MEZCZYZNA}
public void jakaPlec(Plec plec){
    // Dla kobiety wyswietlic Jestem Kobietą, dla mężczyzny Jestem Mężczyzną
    // wykonać przy użyciu konstrukcji if a potem przez switch

    switch (plec) {
        case KOBIETA: System.out.println("Jestem kobietą"); break;
        case MEZCZYZNA: System.out.println("Jestem mężczyzną"); break;
        default: System.out.println("Nieprawidłowo podana płeć"); break;

    }

    if(plec == Plec.KOBIETA) {
        System.out.println("Jestem kobietą");
    }else if (plec == Plec.MEZCZYZNA) {
        System.out.println("Jestem mężczyzną");
    }else {
        System.out.println("Nieprawidłowo podana płeć");
    }

}
    private void jakaPlec2(String plec) {

        if(plec.toUpperCase().equals("KOBIETA")) {
            System.out.println("Jestem Kobietą");
        } else if("MEZCZYZNA".equals(plec.toUpperCase())){
            System.out.println("Jestem Mężczyzną");
        } else {
            System.out.println("Nie rozumiem.");
        }

        switch (plec.toUpperCase()) {
            case "KOBIETA":
                System.out.println("Jestem Kobietą");
                break;
            case "MEZCZYZNA":
                System.out.println("Jestem Mężczyzną");
                break;
            default:
                System.out.println("Nie rozumiem.");
        }
    }

}


