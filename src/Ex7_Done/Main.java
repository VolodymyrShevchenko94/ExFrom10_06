package Ex7_Done;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> myList2 = new MyList<>();
        myList2.addElementToList(1);
        myList2.addElementToList(2);
        myList2.addElementToList(3);
        myList2.addElementToList(4);
        myList2.addElementToList(5);
        System.out.println("колличество элементов " + myList2.getSizeList());
        System.out.println(myList2.getElementByIndex(2));



    }
}