package Fabrika;
import java.util.Scanner;

public class Main {
    static Scanner scannerInput = new Scanner(System.in);
    private static final String TOTAL_SUM_ITEM = "Загальна сума: ";
    private static final String CURRENCY = " грн.";

    public static void main(String[] args) {
        System.out.println("Фабрика виготовляє меблі наступних стилів:" + "\n"
                + "1 -> Ар-деко" + "\n"
                + "2 -> Вікторіанській" + "\n"
                + "3 -> Модерн" + "\n");
        System.out.println("Який варінт набору ви хотіли придбати? (виберіть один з варінтів та введіть його код)");
        int userChoice = scannerInput.nextInt();
        System.out.println("Ви обрали варіант: " + userChoice);
        System.out.println("Детальний опис: ");
        switch (userChoice) {
            case 1:
                FurnitureFactory furnitureArtDeco = new FurnitureFactoryArtDeco();
                Furniture armchair1 = furnitureArtDeco.createArmchair();
                System.out.println("Крісло - " + armchair1.getNameItem() + ", " + String.format("%.0f", armchair1.getPriceItem()).replace(",", ".") + CURRENCY);
                Furniture sofa1 = furnitureArtDeco.createSofa();
                System.out.println("Диван - " + sofa1.getNameItem() + ", " + sofa1.getPriceItem() + CURRENCY);
                Furniture table1 = furnitureArtDeco.createTable();
                System.out.println("Столик - " + table1.getNameItem() + ", " + String.format("%.0f", table1.getPriceItem()).replace(",", ".") + CURRENCY);
                System.out.println(TOTAL_SUM_ITEM + String.format("%.2f", (armchair1.getPriceItem() + sofa1.getPriceItem() + table1.getPriceItem())).replace(",", ".") + CURRENCY);
                break;
            case 2:
                FurnitureFactory furnitureVictorian = new FurnitureFactoryVictorian();
                Furniture armchair2 = furnitureVictorian.createArmchair();
                System.out.println("Крісло - " + armchair2.getNameItem() + ", " + String.format("%.0f", armchair2.getPriceItem()).replace(",", ".") + CURRENCY);
                Furniture sofa2 = furnitureVictorian.createSofa();
                System.out.println("Диван - " + sofa2.getNameItem() + ", " + sofa2.getPriceItem() + CURRENCY);
                Furniture table2 = furnitureVictorian.createTable();
                System.out.println("Столик - " + table2.getNameItem() + ", " + String.format("%.0f", table2.getPriceItem()).replace(",", ".") + CURRENCY);
                System.out.println(TOTAL_SUM_ITEM + String.format("%.2f", (armchair2.getPriceItem() + sofa2.getPriceItem() + table2.getPriceItem())).replace(",", ".") + CURRENCY);
                break;
            case 3:
                FurnitureFactory furnitureModern = new FurnitureFactoryModern();
                Furniture armchair3 = furnitureModern.createArmchair();
                System.out.println("Крісло - " + armchair3.getNameItem() + ", " + String.format("%.0f", armchair3.getPriceItem()).replace(",", ".") + CURRENCY);
                Furniture sofa3 = furnitureModern.createSofa();
                System.out.println("Диван - " + sofa3.getNameItem() + ", " + sofa3.getPriceItem() + CURRENCY);
                Furniture table3 = furnitureModern.createTable();
                System.out.println("Столик - " + table3.getNameItem() + ", " + String.format("%.0f", table3.getPriceItem()).replace(",", ".") + CURRENCY);
                System.out.println(TOTAL_SUM_ITEM + String.format("%.2f", (armchair3.getPriceItem() + sofa3.getPriceItem() + table3.getPriceItem())).replace(",", ".") + CURRENCY);
                break;
            default:
                System.out.println("Такий код відсутній, спробуйте ще раз.");
        }
        scannerInput.close();


    }
}
