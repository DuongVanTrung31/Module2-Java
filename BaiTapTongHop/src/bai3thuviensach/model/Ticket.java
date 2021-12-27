package bai3thuviensach.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Ticket implements Serializable {
    private int idBook;
    private LocalDate beginDate;
    private int returnDate;
    private String nameBook;
    private Student student;

    @Override
    public String toString() {
        return  student.toString() + "\n" +
                "Ticket{" +
                "numTicket=" + idBook +
                ", beginDate=" + beginDate +
                ", returnDate=" + returnDate +
                ", idBook='" + nameBook +
                '}';
    }

    public Ticket() {
    }

    public Ticket(int idBook, LocalDate beginDate, int returnDate, String nameBook, Student student) {
        this.idBook = idBook;
        this.beginDate = beginDate;
        this.returnDate = returnDate;
        this.nameBook = nameBook;
        this.student = student;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public int getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
