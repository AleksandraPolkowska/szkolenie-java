package pl.cyber.trainees.wyjasnienia.zwierzeta;

import java.time.LocalDate;

public class Pies extends Zwierze {

    private String imiePsa;
    private final LocalDate dataUrodzenia;
    private Double waga;
    private String imieOpiekuna;

    public Pies(final Double wzrost, final boolean czyMaSiersc,
                final LocalDate dataUrodzenia, final Double waga, final String imieOpiekuna) {
        super(wzrost, czyMaSiersc);
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public Pies(final Double wzrost, final boolean czyMaSiersc, final String imiePsa,
                final LocalDate dataUrodzenia, final Double waga, final String imieOpiekuna) {
        super(wzrost, czyMaSiersc);
        this.imiePsa = imiePsa;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    @Override
    public String dajGlos() {
        return "hau hau";
    }

    public String przedstawSie() {
        return "Zwracam dane o psie: "
                + "\nimie " + this.imiePsa
                + "\ndata urodzenia " + this.dataUrodzenia
                + " mój opiekun: " + this.imieOpiekuna
                + "waga" + this.waga;
    }

    public Pies convertFromFile(String rowInFile){

    }
}

