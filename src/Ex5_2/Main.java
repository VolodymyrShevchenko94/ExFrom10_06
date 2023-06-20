package Ex5_2;

public class Main {
    public static void main(String[] args) {
        //Створити класи:
        //1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
        //2) Сабклас Monitor (resolutionX(int), resolutionY(int)) і EthernetAdapter (speed(int), mac(String)); Додати методи доступу. Конструктор.
        //5.1 Дивитися завдання 2. В обох класах перевизначити метод toString, щоб виведення було наступним:
        //Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        //Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
        Device device = new Device("Samsung", 120, "ab1234567cd");
        System.out.println(device);

        Device monitor = new Monitor("Samsung", 120, "ab1234567cd", 1280, 1024);
        System.out.println(monitor);

        Device ethernetAdapter = new EthernetAdapter("Samsung", 120, "ab1234567cd", 500, "Mac");
        System.out.println(ethernetAdapter);
    }
}
