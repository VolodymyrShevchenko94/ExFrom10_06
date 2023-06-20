package Ex2;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public  class Worker {
    private String name;
    private String position;
    private int yearOfEmployment;
    Scanner in = new Scanner(System.in);

    public Worker(String name, String position, int yearOfEmployment) throws Exception {
        if (yearOfEmployment <= 1999 || yearOfEmployment > 2023) {
            throw new Exception("WrongYearOfEmployment");
        }
        this.name = name;
        this.position = position;
        this.yearOfEmployment = yearOfEmployment;
    }

    public Worker() throws Exception {
        System.out.print("Name: ");
        setName(in.next());
        System.out.print("Position: ");
        setPosition(in.next());
        System.out.print("Year of employment: ");
        setYearOfEmployment(in.nextInt());
        if (yearOfEmployment <= 1999 || yearOfEmployment > 2023) {
            throw new Exception("WrongYearOfEmployment");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }


    @Override
    public String toString() {
        return "\nName: " + name + "\n" +
                "Position: " + position + "\n" +
                "YearOfEmployment: " + yearOfEmployment + "\n\n";

    }


    public static String checkWorkExperience(ArrayList<Worker> list, int exp) {
        String result = "";
        for (Worker tmp : list) {
            if (tmp.getYearOfEmployment() - 2000 > exp) {
                result = tmp.getName();
            }
        }
        return result;


        //Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:
        //  прізвище та ініціали працівника;
        //  назва посади;
        //  рік надходження на роботу.
        //Написати програму, яка виконує такі дії:
        //  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
        //  якщо значення року введено не у відповідному форматі, видає виняток.
        //  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.

    }
}
