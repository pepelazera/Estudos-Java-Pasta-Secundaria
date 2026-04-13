package Desafio06;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Initialize the Linked List with 7 Ninjas
        LinkedList<Ninja> ninjaLinkedList = new LinkedList<>();

        ninjaLinkedList.add(new Ninja("Naruto Uzumaki", 32, "Leaf Village"));
        ninjaLinkedList.add(new Ninja("Sasuke Uchiha", 33, "Leaf Village"));
        ninjaLinkedList.add(new Ninja("Sakura Haruno", 33, "Leaf Village"));
        ninjaLinkedList.add(new Ninja("Sabaku no Gaara", 32, "Sand Village"));
        ninjaLinkedList.add(new Ninja("Itachi Uchiha", 27, "Renegade"));

        // Listar os ninjas
        System.out.println("List of ninjas: ");
        for (Ninja ninjas : ninjaLinkedList) {
            System.out.println("    " + ninjas);
        }
        System.out.println();

        // Add a Ninja on the beginning of the Linked List
        ninjaLinkedList.addFirst(new Ninja("Boruto Uzumaki", 15, "Renegade"));

        System.out.println("Updated list of ninjas: ");
        for (Ninja ninjasUpdated : ninjaLinkedList) {
            System.out.println("    " + ninjasUpdated);
        }
        System.out.println();

        // To remove Ninja on the beginning of the Linked List
        Ninja removedNinja = ninjaLinkedList.removeFirst();
        System.out.println("Removed Ninja: " + removedNinja);
        System.out.println();

        // To search a Ninja for index
        Ninja thirdNinja = ninjaLinkedList.get(2);
        System.out.println("Third Ninja in the Linked List: " + thirdNinja);

    }

}
