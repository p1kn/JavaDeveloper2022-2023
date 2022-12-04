package devices;

public class Car extends Device {

    Double horsepower;
    public Double milleage;
    public String color;
    public String gearbox;
    public String fuelType;

    public Car(Integer id, String producer, String model) {
        super(id, producer, model);
        this.fuelType = fuelType;
    }


}
