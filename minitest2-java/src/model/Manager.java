package model;

import java.util.Scanner;

public interface Manager<T>{
    void dislay();
    void add(T e);
    void searchById(int id);
    void removeById(int id);
    void editById(int id, Scanner scanner);
    void sortByAvgMark();
    double sumAvgMark();
}
