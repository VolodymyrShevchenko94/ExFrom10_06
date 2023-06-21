package Ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

       System.out.println("Выберите арефметическую операцию : ");
        System.out.println("'+' , '-', '*' , '/'");
        char symbol = sc.next().charAt(0);



            switch (symbol) {
                case '+':
                    System.out.println("Введите первое число");
                    System.out.println("Введите второе число");
                    Calculator calculator1 = new Calculator();
                    System.out.println(calculator1.add(sc.nextDouble(), sc.nextDouble()));

                    break;

                case '-':
                    System.out.println("Введите первое число");
                    System.out.println("Введите второе число");
                    Calculator calculator2 = new Calculator();
                    System.out.println(calculator2.sub(sc.nextDouble(), sc.nextDouble()));
                    break;

                case '/':
                    System.out.println("Введите первое число");
                    System.out.println("Введите второе число");
                    Calculator calculator3 = new Calculator();
                    calculator3.div(sc.nextDouble(), sc.nextDouble());
                    break;

                case '*':
                    System.out.println("Введите первое число");
                    System.out.println("Введите второе число");
                    Calculator calculator4 = new Calculator();
                    System.out.println(calculator4.mul(sc.nextDouble(), sc.nextDouble()));

                    break;


            }

        }
        }