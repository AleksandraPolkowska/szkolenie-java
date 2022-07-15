package pl.cyber.trainees.cwiczeniawlasne;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive dysk;
    private Headphones sluchawki;

    List<USBdevice> urzadzeniaUsb = new ArrayList<>();

    public Computer(Monitor monitor, Drive dysk) {

        this.monitor = monitor;
        this.dysk = dysk;

    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDysk() {
        return dysk;
    }

    public void setDysk(Drive dysk) {
        this.dysk = dysk;
    }

    public Headphones getSluchawki() {
        return sluchawki;
    }

    public void setSluchawki(Headphones sluchawki) {
        this.sluchawki = sluchawki;
    }

    public List<USBdevice> getUrzadzeniaUsb() {
        return urzadzeniaUsb;
    }
}