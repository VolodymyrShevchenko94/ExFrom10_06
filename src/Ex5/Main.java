package Ex5;

public class Main {
    public static void main(String[] args) {

        Device device = new Device("Samsung", 120, "ab1234567cd");
        System.out.println(device);

//        Device monitor = new Monitor("Samsung", 140, "ab1234567cd", 1280, 1024);
//        System.out.println(monitor);

        Device ethernetAdapter = new EthernetAdapter("Samsung", 120, "ab1234567cd", 500, "Mac");
        System.out.println(ethernetAdapter);
    }
}
