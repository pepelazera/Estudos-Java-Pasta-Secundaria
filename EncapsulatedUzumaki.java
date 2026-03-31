package Encapsulated_Classes;

public class EncapsulatedUzumaki extends EncapsulatedNinja {

    Biju biju;

    public EncapsulatedUzumaki() {
    }

    public EncapsulatedUzumaki(String name, String village, int age) {
        super(name, village, age);
    }

    public EncapsulatedUzumaki(String name, String village, int age, int numberOfConcludedMissions, double height) {
        super(name, village, age, numberOfConcludedMissions, height);
    }

    public EncapsulatedUzumaki(String name, String village, int age, int numberOfConcludedMissions, double height, Biju biju) {
        super(name, village, age, numberOfConcludedMissions, height);
        this.biju = biju;
    }

    @Override
    public void specialAtack() {
        System.out.printf("\n%s's special atack: %s", getName(), getSpecialAtack());
    }
}
