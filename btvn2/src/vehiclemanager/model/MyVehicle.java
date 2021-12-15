package vehiclemanager.model;

public class MyVehicle{
    private String name = "Trung";

    public MyVehicle() {
    }

    public MyVehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyVehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
