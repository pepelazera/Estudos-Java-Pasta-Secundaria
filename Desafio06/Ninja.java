package Desafio06;

import java.util.*;

public class Ninja {

    // Iniciar uma Linked List com 7 ninjas

    // Listar os ninjas

    // Adicionar o ninja no inicio da lista

    // Remover o ninja no inicio da lista

    // Procurar um ninja por indices

    private String name;
    private Integer age;
    private String village;

    private LinkedList<Object> ninjaLinkedList = new LinkedList<>();

    public Ninja() {
    }

    public Ninja(String name, Integer age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    public Ninja(String name, Integer age, String village, LinkedList<Object> ninjaLinkedList) {
        this(name, age, village);
        this.ninjaLinkedList = ninjaLinkedList;
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


    public LinkedList<Object> getNinjaLinkedList() {
        return ninjaLinkedList;
    }

    public void setNinjaLinkedList(LinkedList<Object> ninjaLinkedList) {
        this.ninjaLinkedList = ninjaLinkedList;
    }

    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                ", age = " + age +
                ", village = '" + village + '\'';
    }


        /*

            Como desafio adicional, implemente uma função que permita ordenar a lista de ninjas por
            diferentes critérios: idade, nome ou vila. O sistema deverá oferecer ao usuário a opção de
            escolher o critério de ordenação, e a lista deverá ser reorganizada com base na escolha. Além
            disso, implemente uma funcionalidade que busque e retorne informações de um ninja
            específico na lista com base no nome, utilizando um algoritmo de busca eficiente.

         */

}
