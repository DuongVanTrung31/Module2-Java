package bai1quanlykhachsan.model;

public class Hotel {
    private String type;
    private double price;
    private int daysInRoom;

    public Hotel() {
    }

    public Hotel(String type, double price, int daysInRoom) {
        this.type = type;
        this.price = price;
        this.daysInRoom = daysInRoom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDaysInRoom() {
        return daysInRoom;
    }

    public void setDaysInRoom(int daysInRoom) {
        this.daysInRoom = daysInRoom;
    }

    public void displayRoom() {
        System.out.printf("%-15S", type);
        System.out.printf("%-15.2f", price);
        System.out.printf("%-15s", daysInRoom);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", daysInRoom=" + daysInRoom +
                '}';
    }
}
