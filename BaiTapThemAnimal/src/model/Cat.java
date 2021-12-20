package model;

public class Cat extends Animal implements Actions{
    public Cat() {
    }

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void boss() {
        System.out.println("Con sen kia ra đây");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int run() {
        return 5;
    }

    @Override
    public String makeSound() {
        return "Mèo méo meo mèo meo";
    }
}
