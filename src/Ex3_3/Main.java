package Ex3_3;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scannerInputData = new Scanner(System.in);
        int numberElements = 2;
        List<Price> listPrices = new ArrayList<>();
        System.out.println("Enter data for" + numberElements + " products:");

        for (int i = 0; i < numberElements; i++) {
            System.out.println("product " + (i + 1) + ":");
            System.out.print("Name of product: ");
            String productName = scannerInputData.nextLine();
            System.out.print("Name of store: ");
            String storeName = scannerInputData.nextLine();
            System.out.print("Price of product: ");
            double priceValue = scannerInputData.nextDouble();
            scannerInputData.nextLine();
            Price newPrice = new Price(productName, storeName, priceValue);
            listPrices.add(newPrice);
        }

        listPrices.sort(Comparator.comparing(Price::getStoreName));
        System.out.print("Enter the store name to search: ");
        String searchStore = scannerInputData.nextLine();
        System.out.println(searchStore);
        getInfoProductByStore(searchStore, listPrices);

    }

    public static void getInfoProductByStore(String searchStore, List<Price> listPrices) throws Exception {
        boolean isNotFound = true;
        for (Price listPrice : listPrices) {
            if (listPrice.getStoreName().equalsIgnoreCase(searchStore)) {
                System.out.println("Product: " + listPrice.getProductName());
                System.out.println("Store: " + listPrice.getStoreName());
                System.out.println("Price: " + listPrice.getProductPrice());
                isNotFound = false;
            }
        }
        if (isNotFound) {
            throw new Exception("No such store found");
        }
    }


}
