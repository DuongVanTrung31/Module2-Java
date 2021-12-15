package vehiclemanager.model;

public class Sedan extends Car {
    private String licensePlate;
    private int speed = 0;

    public Sedan() {
    }

    public Sedan(String color, int price, String licensePlate) {
        this.licensePlate = licensePlate;
        super.setColor(color);
        super.setPrice(price);
        super.setModel("Sedan");
        super.setMaxSpeed(220);
        super.setGear(4);
    }

    @Override
    protected void chargeGear(int gear) {
        super.setGear(getGear() + 1);
    }

    @Override
    public void start() {
        System.out.println("Xe đã khởi động");
    }

    @Override
    public void stop() {
        System.out.println("Xe đã dừng!!!");
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void speedDown(int decrement) {
        speed -= decrement;
    }

    @Override
    public void applyBraked() {
        speed = 0;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "licensePlate='" + licensePlate + '\'' +
                ", speedMax=" + this.getMaxSpeed() +
                ", color=" + this.getColor() +
                ", price=" + this.getPrice() +
                "} ";
    }
}
