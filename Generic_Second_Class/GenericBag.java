package Generic_Second_Class;

import java.util.ArrayList;
import java.util.List;

public class GenericBag<T> {

    private List<T> equipments;

    public GenericBag() {
        this.equipments = new ArrayList<>();
    }

    // Put generic equipments
    public void addEquipments(T genericEquipment) {
        equipments.add(genericEquipment);
    }

    public List<T> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<T> equipments) {
        this.equipments = equipments;
    }

    @Override
    public String toString() {
        return "Equipment Bag: " + equipments.toString();
    }

}
