package devices;

import devices.Device;

public class Phone extends Device {

    public Boolean isAndroid;
    public final Double screenSize;

    public Phone(Integer id, String producer, String model, Double screenSize) {
        super(id, producer, model);
        this.screenSize = screenSize;
    }



}
