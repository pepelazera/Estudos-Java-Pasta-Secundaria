package HashSet_Studies;

import java.util.*;

public class MainHashSet {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzo");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto Uzumaki");

        System.out.println("Ninjas: " + ninjas);

        // O set é usado para ignorar itens duplicados dentro da minha lista
        Set<String> ninjasHashSet = new HashSet<>(); // Tira os duplicados e não tem ordenação

        ninjasHashSet.addAll(ninjas);
        ninjasHashSet.remove("Sakura Haruno"); // No sets, é possível remover pela própria String

        // Nos sets, nós não trabalhamos com índices
        // RELEMBRANDO: sets não aceitam duplicatas
        // O set também não tem ordenação
        System.out.println("Ninjas HashSet: " + ninjasHashSet);

        Set<String> ninjasTreeSet = new TreeSet<>(); // Usado quando quero utilizar uma ordem lógica (alfabética, numérica)

        ninjasTreeSet.addAll(ninjas);
        System.out.println("Ninjas TreeSet: " + ninjasTreeSet);

        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>(); // Irá organizar por ordem de implementação

        ninjasLinkedHashSet.addAll(ninjas);
        System.out.println("Ninjas LinkedHashSet: " + ninjasLinkedHashSet);
    }
}
