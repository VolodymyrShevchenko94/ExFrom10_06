package Ex1;

public enum Animals {
    //Створіть перерахунковий тип (enum) Animals, що містить конструктор,
    // який повинен набувати цілого числа (вік тварини), і містити перевантажений метод toString(),
    // який повинен повертати назву екземпляра та вік тварини.
    DOG(20);

    private final int age;


    Animals(int age) {
        this.age = age;
    }





    @Override
    public String toString() {
        return "Animals :{"  + name() + ", "
                +
                "age=" + age +
                '}';
    }


    }
