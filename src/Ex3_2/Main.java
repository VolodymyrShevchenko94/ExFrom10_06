package Ex3_2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Price[] arrray = new Price[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrray.length; i++) {
            System.out.println("Введите товар:  ");
            String productName = sc.nextLine();
            System.out.println("Введите название " + (i + 1) + " магазина , в котором продается товар:");
            String productStoreName = sc.nextLine();
            System.out.println("Введите стоимость " + (i + 1) + "товара в грн");
            double productCost;
            try {
                productCost = sc.nextDouble();
            }catch (InputMismatchException ex){
                System.err.println("Помилка вводу. Встановлено значення за замовчуванням - 0 ");
                productCost = 0;
            }
            sc.nextLine();
            arrray[i] = new Price(productName, productStoreName, productCost);
        }
        Arrays.sort(arrray);
        for (Price price : arrray) {
            System.out.println(price);
        }
        System.out.println("Введите название магазина:");
        String productStoreName = sc.nextLine();
        boolean isContains = false;
        for (Price price : arrray) {
            if (price.getProductShopName().equals(productStoreName)){
                isContains = true;
                System.out.println(price.getProductsStoreInfo());
            }
        }
        if (!isContains){
            try {
                throw new StoreNotFoundException("магазин отсуцтвует");
            }catch (StoreNotFoundException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}