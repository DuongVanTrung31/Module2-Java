package vehiclemanager.model;

public abstract class Car extends MyVehicle implements Vehicle{
    private int wheels = 4;
    private String color;
    private int maxSpeed;
    private int gear;
    private String model;
    private int price;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGear() {
        return gear;
    }

    protected void setGear(int gear) {
        this.gear = gear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    protected void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void blowHorn() {
        System.out.println("Rich boiz!!!");;
    }

    protected void gas() {
        System.out.println("gas");
    }
    protected abstract void chargeGear(int gear);
}
