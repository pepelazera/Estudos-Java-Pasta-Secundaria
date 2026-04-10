package Generic_Second_Class;

public class PartnerNinja {

    private String animalName;

    public PartnerNinja(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Partner's name: " + animalName;
    }
}
