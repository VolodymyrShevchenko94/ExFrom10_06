package Ex1_2;

public enum Animals {

    DOG(20);

    private final int ageAnimal;

    private Animals(int ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" + name() + ", " +
                "age=" + ageAnimal +
                '}';
    }
}


