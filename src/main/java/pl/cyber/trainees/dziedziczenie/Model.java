package pl.cyber.trainees.dziedziczenie;

//extends - słowo kluczowe stosowane przy dziedziczeniu klas
// super - słowo kluczowe stosowane pry dziedziczeniu odnosi się do konstruktora klasy nadrzędnej
public class Model extends Pojazd {

    private final String nazwa;
    private final Integer przebieg;
    private final Double pojemnoscSilnika;
    private final Kolor kolor;

    public Model () {
        super ();
        this.nazwa = "";
        this.przebieg = 0;
        this.pojemnoscSilnika = 0.0;
        this.kolor = null;
    }

    public Model(
           final String marka,
           final String rocznik,
           final String naped,
           final String nazwa,
           final Integer przebieg,
           final Double pojemnoscSilnika,
           final Kolor kolor) {
        super(marka, rocznik, naped);
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.kolor = kolor;
    }
    @Override // adnotacja wykorzystywana do przesłaniania metod
    public String toString() {
        return "Marka: "
        + getMarka()
                + " rocznik: " + getRocznik()
                + " naped: " + getNaped()
                + " nazwa modelu: " + this.nazwa
                + " przebieg: " + this.przebieg
                + " pojemnoscSilnika: " + this.pojemnoscSilnika
                + " kolor: " + this.kolor;
    }
    public Double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }
    public Integer getPrzebieg () {
        return przebieg;
    }

    public Kolor getKolor() {
        return kolor;
    }
    public String getNazwa() {
        return nazwa;
}

}
