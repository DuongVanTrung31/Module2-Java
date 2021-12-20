package model;

public class Mouse extends Animal implements Actions{
    public Mouse() {
    }

    public Mouse(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int run() {
        return 2;
    }

    @Override
    public String makeSound() {
        return "Chít Chít chít";
    }
}
