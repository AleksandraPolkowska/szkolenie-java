package pl.cyber.trainees.wyjasnienia.zwierzeta;

import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Obiekty {
    public void uruchom() {
        Kot kot = new Kot("Mruczek", LocalDate.of(2022, 1, 1), 3.0, "Ola");
        System.out.println(kot.przedstawSie());
        zadanie4();

    }

    private void zadanie2() {
//    dłuższa ale prostsza wersja jest zakomentowana
//    var kot1 = new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz");
//    var kot2 = new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz");
//    var kot3 = new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz");
//
//    List<Kot> koty = new ArrayList<>();
//    koty.add(kot1);
//    koty.add(kot2);
//    koty.add(kot3);
// wersja szybsza ale trudniejsza

        List<Kot> koty = new ArrayList<>();
        koty.add(new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"));
        koty.add(new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz"));
        koty.add(new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz"));

        for (Kot kot : koty) {
            System.out.println(kot.przedstawSie());
        }
    }


    // Utworzyc liste 3 kotow, dodac je do listy <Zwierze> a nastepnie niech sie kazdy z nich przedstawi.
    private void zadanie3() {
        List<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"));
        zwierze.add(new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz"));
        zwierze.add(new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz"));

        for (Zwierze zw : zwierze) {
            if (zw instanceof Kot) {
                System.out.println(((Kot) zw).przedstawSie());
            }
        }
    }
    // Zadanie 4

    // utworz klase pies ktora dziedziczy po klasie zwierzeta,
    // utworz liste 3 kotow i 1 psa,
    // dodaj je do listy <Zwierze>
    // kazdy z nich niech sie przedstawi
    // wywolaj metode dajGlos() korzystajac z przeslaniania metod

    private void zadanie4() {
        List<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Ala"));
        zwierze.add(new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Ala"));
        zwierze.add(new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Ala"));
        zwierze.add(new Pies(250.0, true, "Gold", LocalDate.now(), 14.0, "Ala"));

        for (Zwierze zw : zwierze) {
            if (zw instanceof Kot) {
                System.out.println(((Kot) zw).przedstawSie());
                System.out.println((zw).dajGlos());
            } else if (zw instanceof Pies) {
                System.out.println(((Pies) zw).przedstawSie());
                System.out.println((zw).dajGlos());
            }
        }
    }


    //Zadanie 5,
    // utworz enum o nazwie Zwierze w ktorym beda opcje kot i pies.
    // utwórz liste 3 kotów i 1 psa poprzez utworzenie pliku zwierzeta.txt
    // ODczytaj plik przez aplikacje. Dodaj zwierzeta do LIST<Zwierze> a nastepnie  niech kazdy z nich sie
    // przedstawi . Wywolaj metode dajGlos() korzystajac z przeslniania metod


    DateConverter dateConverter = new DateConverter();
    try {
        System.out.println(dateConverter.stringToDate("2022/05/10"));
    } catch(ParseException e)
    {throw new RuntimeException(e)
    }


    public void zadanie5(){
        File file = new File("src/main/resources/zwierzeta.txt");
        private void zadanie5() {
            File file = new File("src/main/resources/zwierzeta.txt");

        }

        private void pobierzInformacjeZPliku(File file) {
            Scanner scan = null;
            try {
                scan = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new MojPierwszyException("Komunikat naszego błędu!");
            }

            System.out.println(scan.nextLine());
        }


    }

    public Pies convertFromFile(String rowInFile) {
        String[] tablicaPliku = rowInFile.split(",");
        DateConverter dateConverter = new DateConverter();
        LocalDate dataUrodzenia = null;
        try {
            dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return new Pies(
                Double.valueOf(tablicaPliku[5]), Boolean.parseBoolean(tablicaPliku[6]), tablicaPliku[1],
                dataUrodzenia, Double.valueOf(tablicaPliku[3]), tablicaPliku[4]
        );
    }

}



