package pl.radekcholuj.radio;

public class Lenco implements Turnable {
    private String CDDVD;

    @Override
    public void turnOn() {
        System.out.println("Turn on Lenco");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Lenco");
    }
    public void SDDVD(){
        System.out.println("Insert CD");
    }
}
