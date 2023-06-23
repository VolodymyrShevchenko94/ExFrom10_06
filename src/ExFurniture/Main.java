//package ExFurniture;
//
//import java.util.Scanner;
//
//public class Main {
//    public static final String UAH = " грн.";
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Fabric fabric = null;
//        Armchair armchair;
//        Sofa sofa;
//        Table table;
////        Shelf shelf;
//        int userAnswer = 0;
//        boolean isContinue = true;
//        while (isContinue) {
//            System.out.println("------------------");
//            System.out.println("Який варіант набору Ви хотіли б придбати ?\n" +
//                    "1 -> Ар-деко\n" +
//                    "2 -> Вікторіанській\n" +
//                    "3 -> Модерн");
//            System.out.println("------------------");
//            int tempUserAnswer = sc.nextInt();
//            if (tempUserAnswer == 1 || tempUserAnswer == 2 || tempUserAnswer == 3) {
//                userAnswer = tempUserAnswer;
//                System.out.println(userAnswer);
//                switch (userAnswer) {
//                    case 1:
//                        fabric = new ArtDecoFabric();
//                        break;
//                    case 2:
//                        fabric = new VictorianFabric();
//                        break;
//                    case 3:
//                        fabric = new ModernFabric();
//                        break;
//                    default:
//                }
//            } else {
//                System.out.println("Такого варіанту немає. Повторіть");
//            }
//
//            if (userAnswer != 0) {
//                armchair = fabric.createArmchair();
//                sofa = fabric.createSofa();
//                table = fabric.createTable();
////                shelf = fabric.createShelf();
//
//                System.out.println("Ви обрали варіант: " + userAnswer);
//                System.out.println("Детальний опис:");
//                System.out.println("Крісло - " + armchair.getName() + ", " + armchair.getPrice() + UAH);
//                System.out.println("Диван - " + sofa.getName() + ", " + sofa.getPrice() + UAH);
//                System.out.println("Столик - " + table.getName() + ", " + table.getPrice() + UAH);
////                System.out.println("Поличка - " + shelf.getName() + ", " + shelf.getPrice() + UAH);
//                System.out.println("Загальна сума: " + (armchair.getPrice() + table.getPrice() + sofa.getPrice()) + UAH);
//                System.out.println("------------------");
//            }
//
//            System.out.println("Повторити замовлення ? (yes - так, no - ні)");
//            String temp = sc.next();
//            if (!temp.toUpperCase().equals("YES")) {
//                isContinue = false;
//            }
//        }
//        System.out.println("До побачення!");
//        sc.close();
////    }
//}