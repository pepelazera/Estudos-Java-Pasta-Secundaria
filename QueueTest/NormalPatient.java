package QueueTest;

import java.util.Queue;

public class NormalPatient extends Hospital{

    private Queue<String> normalQueuePatient;

    public void QueueNormal() {
        if (getAge() < 60) {
            normalQueuePatient.add(getName());
        }
    }

    public NormalPatient() {
    }

    public NormalPatient(String name, int age, int cpf) {
        super(name, age, cpf);
    }
}
