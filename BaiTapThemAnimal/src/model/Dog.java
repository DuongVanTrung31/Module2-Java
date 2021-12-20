package model;

public class Dog extends Animal implements Actions{
    public Dog() {
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int run() {
        return 8;
    }

    @Override
    public String makeSound() {
        return "Gâu Gâu go go";
    }
}
