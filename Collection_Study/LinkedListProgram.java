package Collection_Study;

import java.util.LinkedList;

public class LinkedListProgram {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura Haruno");

        System.out.println("LinkedList: " + linkedList);

        linkedList.add(1, "Kakashi Hatake");
        System.out.println("Updated LinkedList: " + linkedList);

        System.out.println("Removed: " + linkedList.remove(2));
    }
}
