package pl.radekcholuj.radio;

public class RadioApp {
    public static void main(String[] args) {
        Blaupunkt blaupunkt = new Blaupunkt();
        Lenco lenco = new Lenco();
        Lenco lenco1 = new Lenco();
        Lenco lenco2 = new Lenco();
        Sony sony = new Sony();
        Turnable[] turnable = {blaupunkt, lenco, lenco1, lenco2, sony};

        for (Turnable t : turnable) {
            t.turnOff();
            if (t instanceof Lenco) {
                Lenco l = (Lenco) t;
                l.SDDVD();
            }
        }
    }
}
