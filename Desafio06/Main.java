package Desafio06;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner ct = new Scanner(System.in);

        // Initialize the Linked List with 7 Ninjas
        LinkedList<Ninja> ninjaLinkedList = new LinkedList<>();

        Ninja ninjasClass = new Ninja();

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

        /*

            Como desafio adicional, implemente uma função que permita ordenar a lista de ninjas por
            diferentes critérios: idade, nome ou vila. O sistema deverá oferecer ao usuário a opção de
            escolher o critério de ordenação, e a lista deverá ser reorganizada com base na escolha. Além
            disso, implemente uma funcionalidade que busque e retorne informações de um ninja
            específico na lista com base no nome, utilizando um algoritmo de busca eficiente.

         */

        System.out.print("\nChoose how parameter do you want to sorter (name/age/village): ");
        String answer = ct.nextLine().toLowerCase();

        while (true) {
            switch (answer) {
                case "name", "nome" -> {
                    LinkedList<String> namesLinkedList = ninjaLinkedList.stream().map(Ninja::getName).collect(Collectors.toCollection(LinkedList::new));

                    System.out.println("Sorted names: ");
                    for (Ninja nameNinjas : ninjaLinkedList) {
                        namesLinkedList.add(nameNinjas.getName());
                    }
                    namesLinkedList.sort(null);
                    System.out.println("    " + namesLinkedList);
                }
                case "age", "idade" -> {
                    LinkedList<Integer> agesLinkedList = ninjaLinkedList.stream().map(Ninja::getAge).collect(Collectors.toCollection(LinkedList::new));

                    System.out.println("Sorted ages: ");
                    for (Ninja ageNinjas : ninjaLinkedList) {
                        agesLinkedList.add(ageNinjas.getAge());
                    }
                    agesLinkedList.sort(null);
                    System.out.println("    " + agesLinkedList);
                }
                case "village", "vila", "aldeia" -> {
                    LinkedList<String> villageLinkedList = ninjaLinkedList.stream().map(Ninja::getVillage).collect(Collectors.toCollection(LinkedList::new));

                    System.out.println("Sorted villages: ");
                    for (Ninja villagesNinjas : ninjaLinkedList) {
                        villageLinkedList.add(villagesNinjas.getVillage());
                    }
                    villageLinkedList.sort(null);
                    System.out.println("    " + villageLinkedList);
                }
                default -> {
                    System.out.println("ERROR: Please, put: name/age/village to continue: ");
                    answer = ct.nextLine();
                }
            }

            System.out.print("Do you want to sorter other parameter ? (y/n): ");
            String finalAnswer = ct.nextLine().toLowerCase();

            if (finalAnswer.equals("y") || finalAnswer.equals("yes")) {
                continue;
            } else if (finalAnswer.equals("n")  || finalAnswer.equals("no")) {
                break;
            }

        }

    }

}
