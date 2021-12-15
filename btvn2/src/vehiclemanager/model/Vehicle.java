package vehiclemanager.model;

public interface Vehicle {
    void start();
    void stop();
    void speedUp(int increment);
    void speedDown(int decrement);
    void applyBraked();
    default void blowHorn(){
        System.out.println("blow horn");
    }
}
