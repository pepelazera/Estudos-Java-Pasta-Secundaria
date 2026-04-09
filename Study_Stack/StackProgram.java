package Study_Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class StackProgram {
    public static void main() {

        // On the stack, the last in is the first out

        // Array
        String[] ninjaArray = new String[3];
        ninjaArray[0] = "Naruto Uzumaki";

        // List
        // Lists are dynamic and the is variable
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Sasuke Uchiha");

        // Stack
        // On the stack, the last in is the first out (LIFO)
        // Push: to put elements in the stack
        // Pop: remove elements in the stack
        // Peek: Verify what is the next element on the top of the stack
        // Size: Verify the quantities of elements in the stack
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Sakura Haruno");
        ninjaStack.push("Kakashi Hatake");
        ninjaStack.push("Sasuke Uchiha");
        System.out.println("Actual ninja stack: " + ninjaStack);

        ninjaStack.pop();
        System.out.println("Updated stack with pop: " + ninjaStack); // Here, it will be removed the last element to enter in the stack

        System.out.println("\nMy stack with the next element on top: " + ninjaStack.peek()); // top element in the stack
        System.out.println("Stack size: " + ninjaStack.size() + " elements"); // size of the stack

        ninjaStack.push("Hinata Hyuga");
        System.out.println("\nMy actual stack: " + ninjaStack);
        System.out.println("Updated stack size: " + ninjaStack.size() + " elements"); // size of the stack

    }
}
