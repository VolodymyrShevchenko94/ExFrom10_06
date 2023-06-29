package Ex9;

public class Main {
    public static void main(String[] args) {
        MyClass<String> stringMyClass = MyClass.factoryMethod();
        stringMyClass.setValue("Hello");
        System.out.println(stringMyClass.getValue());
    }
}
