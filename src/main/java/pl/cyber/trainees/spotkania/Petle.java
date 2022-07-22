package pl.cyber.trainees.spotkania;

import pl.cyber.trainees.calculator.Dodawanie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Petle {
    // Zadanie utworzyc metode, ktora wyswietli liczby calkowite od 1 do 100 po przecinku.
    public void wyswietlLiczby() {

        for (int i = 0; i <= 100; i++) {
            if (i < 100) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ".");

            }

        }
    }

public void dodawanieElementowListy(List <Double> lista){
        Double result = 0.0;

        for (Double element : lista) {
            System.out.println("Teraz wykonuję operację: " + element + "+" + result);
            result = Dodawanie.add(result, element);

        }

    System.out.println("Wynik dodawania listy: " + result);
}
//  Utworzyć nową metodę w której przekażemy jako parametr Listę Double. W ramach pętli foreach wykonamy dodawanie wartości z listy
// następnie proszę wyświetlić wynik dodawania w postaci: Wynik dodawania listy: XZY
// XZY - wynik dodawania

    // w ramach pl.cyber.trainees powinien pojawić się kalkulator który będzie niezbędny do wykonania zadania

    // Utworzenie metody, która wyświetli zadany set
    // Set<Integer> intSet = new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9,10);
    //Set.of() można ustawić kolekcję Set, przyjmuje ona max 10 elementów
    //następnie przez petle foreach wyswietlic elementy.

    public void wyswietlSet() {
        ;
        Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        for (Integer element : intSet) {
            System.out.println("To jest element setu: " + element);
        }
    }
}
