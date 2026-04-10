package QueueTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Hospital implements HospitalInterface {

    private String name;
    private int age;
    private int cpf;
    private Queue<String> patientsQueue;

    public void registerPatient() {
        // I need this queue to make a query order
        patientsQueue.add(this.getName());
    }

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

    public Queue<String> getPatientsQueue() {
        return patientsQueue;
    }

    public void setPatientsQueue(Queue<String> patientsQueue) {
        this.patientsQueue = patientsQueue;
    }

    @Override
    public void toScheduleQuery() throws ParseException {

        Scanner ct = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("What the date do you want to schedule the consultation ? ");
        String dateInput = ct.next();
        Date scheduleDate = sdf.parse(dateInput);

    }

    @Override
    public void toCancelQuery() {

        Scanner ct = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("----- Cancel consult -----");
        System.out.print("\nPlease, put your name: ");
        String putNameToCancel = ct.nextLine();

        if (putNameToCancel.equals(patientsQueue.element())) {
            System.out.println("Cancelling your query");
        } else {
            System.out.println("This don't exist in our data bank");
        }

    }
}
