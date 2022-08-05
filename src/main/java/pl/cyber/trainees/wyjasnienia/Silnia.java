package pl.cyber.trainees.wyjasnienia;

public class Silnia {

    // while lub for z ifem w srodku

    public void uruchomSilnia() {
        algorytmSilnia();
    }

    private void algorytmSilnia(){
        Integer s = 1;
        Integer i = 0;
        Integer n = 4;

        while (i<n){
        i = i + 1;
        s = s * i;
        }
        System.out.println("silnia z liczby " + n + "to" + s);

        s=1;
        for (int j=1; j<=n; j++){
            s=s*j;
        }
        System.out.println("silnia z liczby " + n + "to" + s);
    }


}
