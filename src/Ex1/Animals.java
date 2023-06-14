package Ex1;

public enum Animals {
    //Створіть перерахунковий тип (enum) Animals, що містить конструктор,
    // який повинен набувати цілого числа (вік тварини), і містити перевантажений метод toString(),
    // який повинен повертати назву екземпляра та вік тварини.
    AGE(20);

    private int age;

    private String name;

    Animals(int age) {
        this.age = age;
    }


    public int getAge() {
        return this.age;
    }


    @Override
    public String toString() {
        return "Animals{"  +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Animals cat = Animals.AGE;
        System.out.println(cat);
    }
}
