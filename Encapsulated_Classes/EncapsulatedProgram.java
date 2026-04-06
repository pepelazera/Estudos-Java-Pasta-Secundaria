package Encapsulated_Classes;

public class EncapsulatedProgram {
    public static void main(String[] args) {

        // String name, String village, int age, int numberOfConcludedMissions, double height

        // Naruto Object
        System.out.println("------------------------------------------");
        EncapsulatedUzumaki naruto = new EncapsulatedUzumaki("Naruto Uzumaki", "Leaf Village", 33, 156, 1.76, "Rasen Shuriken", Biju.KURAMA);
        System.out.println(naruto.biju);
        System.out.println(naruto.getName()); // Here, we can see the name before I use set method
        naruto.setName("Naruto Uzumaki");
        System.out.println(naruto.getName()); // And here, we can see the changes that I did with the set method
        System.out.println("------------------------------------------");



        // Naruto second object
        System.out.println("\n------------------------------------------");
        naruto.infos();
        Biju.KURAMA.infosBiju();
        System.out.println("------------------------------------------");


        // Sasuke Object
        System.out.println("\n------------------------------------------");
        EncapsulatedUchiha sasuke = new EncapsulatedUchiha("Sasuke Uchiha", "Leaf village", 34, 259, 1.81, "Supreme Rinnegan");
        sasuke.infos();
        System.out.println("------------------------------------------");


        // Itachi Object
        System.out.println("\n------------------------------------------");
        EncapsulatedUchiha itachi = new EncapsulatedUchiha("Itachi Uchiha", "Renegade", 38, 180, 1.72, "Amaterasu");
        itachi.infos();
        System.out.println("------------------------------------------");
    }
}
