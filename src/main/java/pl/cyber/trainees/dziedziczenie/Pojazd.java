package pl.cyber.trainees.dziedziczenie;

// Nowa klasa określająca markę pojazdu

public class Pojazd {

    private String marka;
    private String rocznik;
    private String naped;

   public Pojazd () {
       marka = "";
       rocznik = "";
       naped = "";
   }
   //Alt + Insert - menu kontekstowe do generowania kodu, wybieramy opcję Constructor

    public Pojazd(String marka, String rocznik, String naped) {
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;
    }

    public String toString () {
       return "Marka: " + this.marka
               + "rocznik: " + this.rocznik
               + "naped: " + this.naped;
    }
    // gettery ktorych zadaniem jest pobieranie informacji z pól klasy do dalszego przetwarzania

    public String getMarka(){
       return marka;
    }
    public String getRocznik(){
       return rocznik;
    }
    public String getNaped(){
       return naped;
    }

    public void setMarka(String marka){
       this.marka = marka;
    }
public void setRocznik(String rocznik){
       this.rocznik = rocznik;
}
public void setNaped(String naped){
       this.naped = naped;
}
}

