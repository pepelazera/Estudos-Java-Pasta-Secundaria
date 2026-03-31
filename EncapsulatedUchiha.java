package Encapsulated_Classes;

public class EncapsulatedUchiha extends EncapsulatedNinja implements SharinganInterface {

    public EncapsulatedUchiha() {
    }

    public EncapsulatedUchiha(String name, String village, int age) {
        super(name, village, age);
    }

    public EncapsulatedUchiha(String name, String village, int age, int numberOfConcludedMissions, double height) {
        super(name, village, age, numberOfConcludedMissions, height);
    }

    @Override
    public void specialAtack() {
        System.out.printf("\n%s's special atack: %s", getName(), getSpecialAtack());
    }

    // Method implements of the Sharingan Interface
    @Override
    public void activatedSharingan() {
        System.out.printf("\n%s is a Sharingan user", getName());
    }
}
