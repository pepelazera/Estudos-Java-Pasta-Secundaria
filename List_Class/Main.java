package List_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Arrays are statics
        System.out.println("Ninja Array");
        String[] NinjasArray = new String[4];
        NinjasArray[0] = "Naruto";
        NinjasArray[1] = "Sasuke";
        NinjasArray[2] = "Sakura";
        NinjasArray[3] = "Kakashi";
        System.out.println(Arrays.toString(NinjasArray));


        // Lists aren't statics
        System.out.println("\nNinja List");
        List<String> NinjasList = new ArrayList<>();
        NinjasList.add("Naruto Uzumaki");
        NinjasList.add("Sasuke Uchiha");
        NinjasList.add("Sakura Haruno");
        NinjasList.add("Kakashi Hatake");
        NinjasList.add("Sae");
        System.out.println("List with Sae: " + NinjasList);

        // Using remove
        NinjasList.remove("Sae");
        System.out.println("List without Sae: " + NinjasList);

        // Change elements
        NinjasList.set(2, "Konohamaru"); // Change Sakura Haruno to Konohamaru
        // Basically, 'set' will change the word in the index that you chose
        System.out.println("\nList after change Sakura to Konohamaru: " + NinjasList);

        // Size list
        System.out.println("Size list: " + NinjasList.size() + " elements");
    }
}
