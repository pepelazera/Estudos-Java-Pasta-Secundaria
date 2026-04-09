package QueueTest;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityPatient extends Hospital {

    private boolean deficientPerson;
    private Queue<String> priorityQueuePatient;

    public void QueuePriority() {
        if (getAge() >= 60) {
            priorityQueuePatient.add(getName());

            System.out.println(priorityQueuePatient);
        }
    }

    public PriorityPatient(String name, int age, int cpf) {
        super(name, age, cpf);
        this.priorityQueuePatient = new LinkedList<>();
    }

    public PriorityPatient(String name, int age, int cpf, boolean deficientPerson) {
        this(name, age, cpf);
        this.deficientPerson = deficientPerson;
    }

    public boolean isDeficientPerson() {
        return deficientPerson;
    }

    public void setDeficientPerson(boolean deficientPerson) {
        this.deficientPerson = deficientPerson;
    }

    public Queue<String> getPriorityQueuePatient() {
        return priorityQueuePatient;
    }

    public void setPriorityQueuePatient(Queue<String> priorityQueuePatient) {
        this.priorityQueuePatient = priorityQueuePatient;
    }
}
