package Desafio06;

import java.util.LinkedList;
import java.util.Scanner;

public class InformationNinja<T> {

    // Iniciar uma Linked List com 7 ninjas

    // Listar os ninjas

    // Adicionar o ninja no inicio da lista

    // Remover o ninja no inicio da lista

    // Procurar um ninja por indices

    private LinkedList<Object> ninjaLinkedList = new LinkedList<>();
    private String name;
    private int age;
    private String village;

    public InformationNinja() {
    }

    public InformationNinja(String name, int age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    public InformationNinja(String name, int age, String village, LinkedList<Object> ninjaLinkedList) {
        this(name, age, village);
        this.ninjaLinkedList = ninjaLinkedList;
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

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public LinkedList<Object> getNinjaLinkedList() {
        return ninjaLinkedList;
    }

    public void setNinjaLinkedList(LinkedList<Object> ninjaLinkedList) {
        this.ninjaLinkedList = ninjaLinkedList;
    }

    public void addInBegging() {
        Scanner ct = new Scanner(System.in);
    }

}
