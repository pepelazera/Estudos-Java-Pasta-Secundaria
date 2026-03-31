package Encapsulated_Classes;

public class EncapsulatedNinja  {

    private String name;
    private String village;
    private int age;
    private int numberOfConcludedMissions;
    private double height;
    private String specialAtack;

    public EncapsulatedNinja() {
    }

    public EncapsulatedNinja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public EncapsulatedNinja(String name, String village, int age, int numberOfConcludedMissions, double height) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.numberOfConcludedMissions = numberOfConcludedMissions;
        this.height = height;
    }

    public void infos(){
        System.out.println("Name: " + this.name);
        System.out.println("Village: " + this.village);
        System.out.println("Age: " + this.age);
        System.out.println("Number of Conclude Missions: " + this.numberOfConcludedMissions);
        System.out.println("Height: " + this.height);
    }

    public void specialAtack() {
        System.out.printf("\n%s's special atack", name);
    }

    // Getters methods: Here, I will to throw the values
    public String getName() {
        return name; // We need to use the return because this method have a type: "String"
    }

    public String getVillage() {
        return village;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfConcludedMissions() {
        return numberOfConcludedMissions;
    }

    public double getHeight() {
        return height;
    }

    public String getSpecialAtack() {
        return specialAtack;
    }

    // Setters Methods: And Here, on these sets, I will receive the values
    public void setName(String name) { // In set methods, we need to use a void type, not a String type or some other
        this.name = name; // And here, we need to put a parameter
    } // The set method don't return anything, just receive the original parameter

    public void setVillage(String village) {
        this.village = village;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumberOfConcludedMissions(int numberOfConcludedMissions) {
        this.numberOfConcludedMissions = numberOfConcludedMissions;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSpecialAtack(String specialAtack) {
        this.specialAtack = specialAtack;
    }
}
