package Recap_Data_Structure;

import java.util.*;

public class RecapProgram {
    public static void main(String[] args) {

        /*

            1) Arrays are statics
                -> They need a pre definned size

            2) Lists are dynamics
                -> They increase and decrease the size according to I need

            3) Stacks are unit
                -> They need order! The last in is the first out (LIFO).

         */


        // Arrays
        System.out.println("----------- Array -------------");
        String[] team7 = new String[3];
        team7[0] = "Naruto Uzumaki";
        team7[1] = "Sasuke Uchiha";
        team7[2] = "Sakura Haruno";

        System.out.print("[");
        // I can do that if I want to print what have in the team 7 array
        for (String member : team7) {
            System.out.print(member + ", ");

            if (member.equals("Sakura Haruno")) { // Don't do that, I just use this because this code is a test
                System.out.print(member);
            }
        }
        System.out.print("]");
        System.out.println();


        // List is slower than Array
        System.out.println("\n\n----------- List -------------");
        List<String> sharinganUsers = new ArrayList<>();
        sharinganUsers.add("Kakashi Hatake");
        sharinganUsers.add("Itachi Uchiha");
        sharinganUsers.add("Shisui Uchiha");
        System.out.println(sharinganUsers);


        System.out.println("\n\n----------- Stack -------------"); // Stack is the same of "Pilha" in portuguese/br
        // Stacks follow the concept of stacking things, like dishes
        // The last dish that you put is the first tha you will remove
        Stack<String> hokages = new Stack<>();
        hokages.push("Hashirama Senju"); // Is the same of add on the lists
        hokages.push("Tobirama Senju"); // When I use push command, the program put the last value was entered in the top of the Stack
        hokages.push("Hiruzen Sarutobi");

        /*
            The concept is:
                Hiruzen Sarutobi
                Tobirama Senju
                Hashirama Senju
         */

        System.out.println("Stack before pops: " + hokages);
        System.out.println("Removed of the stack = " + hokages.pop());
        System.out.println("Removed of the stack = " + hokages.pop());
        hokages.push("Minato Namikaze");

        System.out.println("\nStack after pops: " + hokages);
        System.out.println("My peek element in the Stack is: " + hokages.peek());

        System.out.println("\nUpdated stack: " + hokages);

    }
}
