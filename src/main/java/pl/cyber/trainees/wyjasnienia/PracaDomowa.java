package pl.cyber.trainees.wyjasnienia;

public class PracaDomowa {

    //Napisz metodę, która zwróci Twój aktualny wiek.
    public void ileMaszLat(Integer wiek) {
        System.out.println("Mój wiek to " + wiek);
    }

    // Napisz metodę, która zwróci Twoje imię.

    public void mojeImie(String imie) {
        System.out.println("Moje imię to " + imie);
    }

    // Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta.

    public boolean liczbaParzysta(Integer x) {
        if (x%2==0) {
            return true;
        } else {
            return false;
        }

    }

    // 4. Napisz metodę, która jako argument przyjmuje liczbę
    // i zwraca true jeśli liczba jest podzielna przez 3 i przez 5.

    public boolean liczbaPodzielnaPrzezTrzy (Integer y) {
        if (y%3==0 && y%5==0){
            return true;
        } else {
            return false;
        }
    }
    // 5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
    // podniesienie do potęgi realizujemy przez bibliotekę Math i jej metodę pow(liczba, doJakiejPotęgi)
    // np. Math.pow(2,3)

   // public static Integer potegowanie (Integer z){
   //     Math.pow(z, 3);
   //     return  ;
   // }

    // 6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
    //pierwiastek kwadratowy realizujemy przez bibliotekę Math i jej metodę sqrt(number)
    //Math.sqrt(number)
}
