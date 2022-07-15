package pl.cyber.trainees.cwiczeniawlasne;

public class Monitor {
    private int szerokosc =3840;
    private int wysokosc = 1920;

  public void ustawNiskaRozdzielczosc(){
      szerokosc = 800;
      wysokosc = 600;

  }

  public void ustawWysokaRozdzielczosc(){
      szerokosc = 3840;
      wysokosc = 1920;
  }

  public String getRozdzielczosc(){
      return szerokosc + "x" + wysokosc;
  }
}
