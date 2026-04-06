package Generic_Second_Class;

public class Kunai {

    private String type;

    public Kunai(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type of this Kunai: " + type;
    }
}
