package ThucHanh.Main;

import model.animal.Apple;
import model.fruit.Fruit;
import model.fruit.Orange;

public class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit: fruits
             ) {
            System.out.println(fruit.howtoEat());
        }
    }
}
