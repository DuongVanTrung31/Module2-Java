package vehiclemanager.model;

public class SportMotorBike extends Motorbike{
    private boolean on = false;
    private int speed = 0;

    public SportMotorBike() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SportMotorBike(String color, int price) {
        super.setColor(color);
        super.setPrice(price);
        super.setModel("Sport");
        super.setMaxSpeed(190);
        super.setGear(6);
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    protected void changeGear() {
        super.setGear(getGear() + 1);
    }

    @Override
    public void start() {
        setOn(true);
        System.out.println("Xe đã vào số");
    }

    @Override
    public void stop() {
        setOn(false);
        System.out.println("Xe đã dừng");
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
        return "SportMotorBike{speedMax=" + this.getMaxSpeed() +
                "}";
    }
}
