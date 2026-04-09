package Queue_Study;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueProgram {
    public static void main() {

        // Queue
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // Show Queue
        System.out.println("Ninjas in the Queue: " + ninjasQueue);

        // Remove a ninja
        ninjasQueue.poll();
        System.out.println("\nUpdated Queue after to use poll: " + ninjasQueue);

        // Who´s first
        String peekNinja = ninjasQueue.peek();
        System.out.println("\nNinja on head now: " + peekNinja);

        // Add to Queue
        ninjasQueue.add("Hashirama");
        ninjasQueue.add("Minato");
        System.out.println("\nUpdated Queue with new ninjas: " + ninjasQueue);

        // I can't delete someone before I pull the head first
        // So, if I want to delete "Sakura", before, I need to throw Naruto and Sasuke or who are before than Sakura

        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();


        // Verify if the queue is void
        if (ninjasQueue.isEmpty()) {
            System.out.println("\nThe queue is void: "  + ninjasQueue);
        }
        else {
            System.out.println("\nActual queue: " + ninjasQueue);
        }


    }
}
