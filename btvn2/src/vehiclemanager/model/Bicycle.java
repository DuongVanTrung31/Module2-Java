package vehiclemanager.model;

public abstract class Bicycle extends MyVehicle implements Vehicle{
    private String color;
    private final int WHEELS = 2;
    private String model;
    private int price;

    @Override
    public void blowHorn() {
        System.out.println("Còi mồm");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWHEELS() {
        return WHEELS;
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
}
