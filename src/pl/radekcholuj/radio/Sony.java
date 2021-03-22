package pl.radekcholuj.radio;

public class Sony implements Turnable{
    private String pilot;

    @Override
    public void turnOn() {
        System.out.println("Turn on Sony");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Sony");
    }

    public void pilot(){
        System.out.println("Turn on pilot");
    }
}
