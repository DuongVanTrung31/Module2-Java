package bai3thuviensach.controller;

import bai3thuviensach.model.Student;
import bai3thuviensach.model.Ticket;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TicketManager {
    Scanner scanner = new Scanner(System.in);
    List<Ticket> ticketList;

    public TicketManager() {
        this.ticketList = new ArrayList<>();
    }

    public Ticket createTicket(Student student) {
        Ticket ticket = null;
        try {
            System.out.println("Nhập mã phiếu");
            int idBook = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập ngày mượn(dd-mm-yyyy)");
            LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-LL-yyyy"));
            System.out.println("Nhập hạn trả (số ngày)");
            int returnDay = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên sách");
            String nameBook = scanner.nextLine();
            ticket = new Ticket(idBook, date, returnDay, nameBook, student);
            ticketList.add(ticket);
        } catch (Exception e) {
            System.err.println("Nhập sai kiểu dữ liêu");
            createTicket(student);
        }
        return ticket;
    }

    public void displayAll() {
        HashSet<Student> ticketHashSet = new HashSet<>();
        for (Ticket t : ticketList) {
            ticketHashSet.add(t.getStudent());
        }
        System.out.println(ticketHashSet);
    }

    public void displayById(String idStudent) {
        boolean check = true;
        for (Ticket t : ticketList) {
            if (t.getStudent().getId().equals(idStudent)) {
                System.out.println(t);
                check = false;
            }
        }
        if (check) {
            System.out.println("Không thấy sinh viên trên mượn sách");
        }
    }

    public void displayMonthEnd() {
        boolean check = true;
        for (Ticket t : ticketList) {
            if (LocalDate.now().isAfter(t.getBeginDate().plusDays(t.getReturnDate()))) {
                System.out.println(t);
                check = false;
            }
        }
        if(check) {
            System.out.println("Ko sinh viên nào (quá) đến hạn trả");
        }
    }
}
