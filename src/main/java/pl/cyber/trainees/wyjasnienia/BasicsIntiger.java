package pl.cyber.trainees.wyjasnienia;

public class BasicsIntiger {

    // 1 metoda ktora wyswietli liczbę z podanego parametru
    // 2"Wprowadzona liczba to:  1234


    public void wyswietlLiczbe1(Integer liczba1) {
        System.out.println(liczba1);
    }

    public void wyswietlLiczbe2(Integer liczba2) {
        System.out.println ("Wyświetlam liczbę" + liczba2);
    }

    // 3 Utworzyc metode ktora przyjmie 3 parametry String, Integer, Integer
    // String "wynik dodawania: "
    // Integer liczba którą bedziemy dodawac

    public void sumowanie (String w, Integer a, Integer b){
    System.out.println(w + (a + b));
    }

    // Utworzyc metodę, która zwraca wynik dodawania dwóch Integerów
    // w klasie SimpleApp powinniśmy przekazać ten wynik do metody Basics.wyswietlText(xxx);
    // uzyc to stringa

    public Integer wynikDodawaniaIntegerow (Integer c, Integer d) {
        return c+d;

    }




}
