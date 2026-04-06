package Generic_Second_Class;

public class NinjaEquipments {

    private String name;

    public NinjaEquipments(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
