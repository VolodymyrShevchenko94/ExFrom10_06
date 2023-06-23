package Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Price> list = new ArrayList<>(2);
        Scanner sc = new Scanner(System.in);

        Price price1 = new Price("TV","Eldorado",500);
        Price price2 = new Price("Iphone","Comfy",30000);

        list.add(price1);
        list.add(price2);




    }
}
