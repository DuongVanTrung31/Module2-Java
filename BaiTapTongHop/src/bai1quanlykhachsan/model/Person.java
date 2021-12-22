package bai1quanlykhachsan.model;

import java.util.Objects;

public class Person {
    private String name;
    private String date;
    private String CMND;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public Person() {
    }

    public Person(String name, String date, String CMND) {
        this.name = name;
        this.date = date;
        this.CMND = CMND;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(CMND, person.CMND);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CMND);
    }

    public void display() {
        System.out.printf("%-15S", name);
        System.out.printf("%-15s", date);
        System.out.printf("%-15s", CMND);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", CMND='" + CMND + '\'' +
                '}';
    }
}
