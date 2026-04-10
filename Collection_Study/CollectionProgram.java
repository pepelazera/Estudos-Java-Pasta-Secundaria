package Collection_Study;

import java.util.*;

public class CollectionProgram {
    public static void main(String[] args) {

        // Their 3 are Classes, and they implement the interfaces: List, Queue and Set, and this 3 implements the Collection
        String[] array = new String[3];
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>(); // This is an interface
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(); // This is a class, and this class implement Queue interface

        array[0] = "Sasuke";
        array[1] = "Naruto";
        array[2] = "Kakashi";
        System.out.println(Arrays.toString(array)); // Here, I need to format the toString method, because the array isn't a class that implement the Collection

        // Different from ArrayList, LinkedList or Stack. This class implement the List interface, and List interface extends Collection
        System.out.println();
        linkedList.add("Naruto Uzumaki");
        System.out.println(linkedList);
    }
}
