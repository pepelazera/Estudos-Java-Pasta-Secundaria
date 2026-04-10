package Encapsulated_Classes;

public class EncapsulatedUzumaki extends EncapsulatedNinja {

    Biju biju;

    public EncapsulatedUzumaki() {
    }

    public EncapsulatedUzumaki(String name, String village, int age) {
        super(name, village, age);
    }

    public EncapsulatedUzumaki(String name, String village, int age, int numberOfConcludedMissions, double height, String specialAtack) {
        super(name, village, age, numberOfConcludedMissions, height, specialAtack);
    }

    public EncapsulatedUzumaki(String name, String village, int age, int numberOfConcludedMissions, double height, String specialAtack, Biju biju) {
        super(name, village, age, numberOfConcludedMissions, height, specialAtack);
        this.biju = biju;
    }

    @Override
    public void specialAtack() {
        System.out.printf("\n%s's special atack: %s", getName(), getSpecialAtack());
    }

    @Override
    public void infos(){
        System.out.println("Name: " + this.getName());
        System.out.println("Village: " + this.getVillage());
        System.out.println("Age: " + this.getAge());
        System.out.println("Number of Conclude Missions: " + this.getNumberOfConcludedMissions());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Biju: " + biju);
    }
}

