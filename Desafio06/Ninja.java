package Desafio06;

import java.util.LinkedList;
import java.util.Scanner;

public class Ninja {

    // Iniciar uma Linked List com 7 ninjas

    // Listar os ninjas

    // Adicionar o ninja no inicio da lista

    // Remover o ninja no inicio da lista

    // Procurar um ninja por indices

    private String name;
    private Integer age;
    private String village;

    private LinkedList<String> sortedNames;
    private LinkedList<Integer> sortedAge;
    private LinkedList<String> sortedVillage;

    public Ninja() {
    }

    public Ninja(String name, Integer age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    public Ninja(String name, Integer age, String village, LinkedList<String> sortedNames, LinkedList<Integer> sortedAge, LinkedList<String> sortedVillage) {
        this(name, age, village);
        this.sortedNames = sortedNames;
        this.sortedAge = sortedAge;
        this.sortedVillage = sortedVillage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }


    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                ", age = " + age +
                ", village = '" + village + '\'';
    }

    public void sortedNinjas() {
        Scanner ct = new Scanner(System.in);

        System.out.print("How parameter do you want to sort ? ");
        String answer = ct.nextLine().toLowerCase();

        if (answer.equals(""))
    }
}
