package Ex5;

import com.sun.jdi.event.EventIterator;

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


        //Створити класи:
        //1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
        //2) Сабклас Monitor (resolutionX(int), resolutionY(int)) і EthernetAdapter (speed(int), mac(String)); Додати методи доступу. Конструктор.
        //5.1 Дивитися завдання 2. В обох класах перевизначити метод toString, щоб виведення було наступним:
        //Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        //Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
    }
}
