package bai1quanlykhachsan.view;

import bai1quanlykhachsan.controller.PersonManager;
import bai1quanlykhachsan.model.Hotel;
import bai1quanlykhachsan.model.Person;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Person, Hotel> list = new HashMap<>();
        PersonManager personManager = new PersonManager(list);
        personManager.add();
        personManager.displayAll();
    }
}
