package HashSet_Studies;

import java.util.*;

public class MainHashSet {
    public static void main() {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.remove(0);

        System.out.println("Ninjas: " + ninjas);

        // O set é usado para ignorar itens duplicados dentro da minha lista
        Set<String> ninjasSet = new TreeSet<>();
        ninjasSet.addAll(ninjas);
        ninjasSet.remove("Sakura Haruno"); // No sets, é possível remover pela própria String

        // Nos sets, nós não trabalhamos com índices
        // RELEMBRANDO: Sets não aceitam duplicatas
        // O set também não tem ordenação
        System.out.println("Ninjas set: " + ninjasSet);

    }
}
