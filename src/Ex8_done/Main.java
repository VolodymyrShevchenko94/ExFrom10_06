package Ex8_done;

public class Main {

    public static void main(String[] args) {

        Translater translater = new Translater();
        translater.addingElementToDictionary("Привет","Hello");
        translater.addingElementToDictionary("Пока","Bye");
        translater.addingElementToDictionary("Мама","Mother");


        System.out.println(translater.getElementByIndex(2));
        System.out.println("Общее колличество элементов " + translater.getTotalNumberElement());

        Words pairs = new Words<>("Hello", "Привет");




    }
}