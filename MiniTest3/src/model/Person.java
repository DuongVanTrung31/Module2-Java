package model;

public class Person {
    private static int VALUE = 0;
    private int id;
    private String name;
    private int age;

    public Person() {
        this.id = ++VALUE;
    }

    public Person(String name, int age) {
        this.id = ++VALUE;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age;
    }
}
