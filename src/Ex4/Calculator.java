package Ex4;

public class Calculator {

    public double add(double a , double b){
        return a + b;

    }
    public double sub(double a , double b){
        return a - b;

    }
    public double mul(double a , double b){
        return a * b;

    }
    public void div(double a , double b){
        try {
            double res = a / 0;
            System.out.println(res);

        }
        catch (Exception e) {
            System.out.println("на 0 делить нельзя");


        }


    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

    }
    //Створіть клас Calculator. У тілі класу створіть чотири методи для арифметичних дій:
    // (add – додавання, sub – віднімання, mul – множення, div – поділ).
    // Метод поділу повинен перевірити поділ на нуль, якщо перевірка не проходить,
    // згенерувати виняток. Користувач вводить значення, над якими хоче зробити операцію та вибрати саму операцію.
    // У разі виникнення помилок повинні викидатися винятки.
}
