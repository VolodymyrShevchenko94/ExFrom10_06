package Ex3_done;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scannerInputData = new Scanner(System.in);
        int numberElements = 2;
        List<Price> listPrices = new ArrayList<>();
        System.out.println("Введите название товара");

        for (int i = 0; i < numberElements; i++) {
            System.out.println("Товар " + (i + 1) + ":");
            String productName = scannerInputData.nextLine();
            System.out.print("Введите название магазина: ");
            String storeName = scannerInputData.nextLine();
            System.out.print("Введите сумму в грн : ");
            double priceValue = scannerInputData.nextDouble();
            scannerInputData.nextLine();
            Price newPrice = new Price(productName, storeName, priceValue);
            listPrices.add(newPrice);
        }

        listPrices.sort(Comparator.comparing(Price::getStoreName));
        System.out.print("Введите название магазина ");
        String searchStore = scannerInputData.nextLine();
        System.out.println(searchStore);
        getInfoProductByStore(searchStore, listPrices);

    }

    public static void getInfoProductByStore(String searchStore, List<Price> listPrices) throws Exception {
        boolean isNotFound = true;
        for (Price listPrice : listPrices) {
            if (listPrice.getStoreName().equalsIgnoreCase(searchStore)) {
                System.out.println("Продукт: " + listPrice.getProductName());
                System.out.println("Магазин: " + listPrice.getStoreName());
                System.out.println("Цена: " + listPrice.getProductPrice());
                isNotFound = false;
            }
        }
        if (isNotFound) {
            throw new Exception("нет такого магазина");
        }
    }


}
