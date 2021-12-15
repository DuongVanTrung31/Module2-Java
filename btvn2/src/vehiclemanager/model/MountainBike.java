package vehiclemanager.model;

public class MountainBike extends Bicycle{
    public MountainBike() {
    }

    public MountainBike(String color , int price) {
        super.setColor(color);
        super.setPrice(price);
        super.setModel("MountainBike");
    }
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void speedUp(int increment) {

    }

    @Override
    public void speedDown(int decrement) {

    }

    @Override
    public void applyBraked() {

    }


    @Override
    public String toString() {
        return "MountainBike{color=" + this.getColor() +
                ", price=" + this.getPrice() +
                ", color=" + this.getColor() +
                ", price=" + this.getPrice() +
                "}";
    }
}
