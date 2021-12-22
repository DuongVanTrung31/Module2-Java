package bai2quanlytiendien.model;

public class Customer {
    private String nameCustomer;
    private String address;
    private String electricCode;

    public Customer() {
    }

    public Customer(String nameCustomer, String address, String electricCode) {
        this.nameCustomer = nameCustomer;
        this.address = address;
        this.electricCode = electricCode;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getElectricCode() {
        return electricCode;
    }

    public void setElectricCode(String electricCode) {
        this.electricCode = electricCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", address='" + address + '\'' +
                ", electricCode='" + electricCode + '\'' +
                '}';
    }
}
