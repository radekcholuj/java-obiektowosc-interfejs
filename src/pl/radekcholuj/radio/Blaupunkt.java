package pl.radekcholuj.radio;

public class Blaupunkt implements Turnable {
    private String USB;

    @Override
    public void turnOn() {
        System.out.println("Turn on Blau" );
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Blau");
    }

    public void USB(){
        System.out.println("Read USB.");
    }
}
