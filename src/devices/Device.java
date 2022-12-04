package devices;

public class Device {

    public final Integer id;
    public final String producer;
    public final String model;

    public Device (Integer id, String producer, String model){
        this.id = id;
        this.producer = producer;
        this.model = model;

    }

    void turOn() {
        System.out.println("Naciśnij przycisk");
        System.out.println("czekaj");
        System.out.println("czekaj");
        System.out.println("czekaj");
        System.out.println("o! mój " + producer + " działa!");

    }
}
