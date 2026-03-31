package Encapsulated_Classes;

public class EncapsulatedProgram {
    public static void main(String[] args) {

        System.out.println("------------------------------------------");
        EncapsulatedUzumaki naruto = new EncapsulatedUzumaki("Naruto", "Konoha Village", 32, 165, 1.72, Biju.KURAMA);
        System.out.println(naruto.biju);
        System.out.println(naruto.getName()); // Here, we can see the name before I use set method
        naruto.setName("Naruto Uzumaki");
        System.out.println(naruto.getName()); // And here, we can see the changes that I did with the set method
        System.out.println("------------------------------------------");

        System.out.println("\n------------------------------------------");
        naruto.infos();
        System.out.println("------------------------------------------");

        System.out.println("\n------------------------------------------");
        EncapsulatedUchiha sasuke = new EncapsulatedUchiha("Sasuke Uzumaki", "Konoha Village", 33, 65, 1.82);
        sasuke.infos();
        System.out.println("------------------------------------------");


        System.out.println("\n------------------------------------------");
        EncapsulatedUchiha itachi = new EncapsulatedUchiha("Itachi Uchiha", "Renegade", 38, 180, 1.72);
        itachi.infos();
        System.out.println("------------------------------------------");

    }
}
