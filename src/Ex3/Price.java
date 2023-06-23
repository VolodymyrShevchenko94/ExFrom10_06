package Ex3;

import java.util.ArrayList;

public class Price {
    ArrayList<Integer> arrayList = new ArrayList<>();
    private String name;
    private String ShopName;
    private double price;

    public Price(String name, String shopName, double price) {
        this.name = name;
        ShopName = shopName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addElement(int element) {
        arrayList.add(element);


    }



    //Потрібно: Описати клас з іменем Price, що містить такі поля:
    //  назву товару;
    //  назву магазину, в якому продається товар;
    //  вартість товару у гривнях.
    // Написати програму, яка виконує такі дії:
    //  введення з клавіатури даних до масиву, що складається з двох елементів типу Price
    // (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);
    //  виведення на екран інформації про товари, що продаються в магазині, назва якого введена з клавіатури
    // (якщо такого магазину немає, вивести виняток).
}
