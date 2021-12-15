package vehiclemanager.model;

public abstract class Motorbike extends MyVehicle implements Vehicle{
    private final int WHEELS = 2;
    private int maxSpeed;
    private int gear;
    private String model;
    private int price;
    private String color;

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

    public int getWHEELS() {
        return WHEELS;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    protected void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getGear() {
        return gear;
    }

    protected void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void blowHorn() {
        System.out.println("Còi bạn to thì cho bạn vượt");
    }

    protected abstract void changeGear();

}
