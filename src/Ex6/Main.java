package Ex6;

import Ex1.Animals;

public class Main {
    public static void main(String[] args) {
        Animal Vasiliy = new Animal("Васька",45,false);
        System.out.println(Vasiliy);


        //Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
        // У класі перевизначити метод toString, щоб висновок був наступним
        // «Ім'я: Васька, вік: 45, хвіст: ні». У класі Animal перевизначити методи equals & hashCode.
    }
}
