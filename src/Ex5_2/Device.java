package Ex5_2;

public class Device {
    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + "manufacturer=" + manufacturer + ", price=" + price + ", serialNumber='" + serialNumber.toUpperCase();
    }
}

