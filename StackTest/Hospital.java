package StackTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Hospital implements HospitalInterface {

    private String name;
    private int age;
    private int cpf;

    public Hospital() {
    }

    public Hospital(String name, int age, int cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void toScheduleConsultation() throws ParseException {

        Scanner ct = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("What the date do you want to schedule the consultation ? ");
        String dateInput = ct.next();
        Date scheduleDate = sdf.parse(dateInput);

    }

    @Override
    public void toCancelConsultation() {

    }
}
