package ThucHanh.Main;

import model.animal.Animal;
import model.animal.Chicken;
import model.interFace.Edible;
import model.fruit.Tiger;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
        }
    }
}
