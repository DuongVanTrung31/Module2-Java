package bai3thuviensach.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String id;
    private String birthday;
    private String clazz;

    public Student() {
    }

    public Student(String name, String id, String birthday, String clazz) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", birthday='" + birthday + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
