package Generic_Second_Class;

import java.util.ArrayList;
import java.util.List;

public class NinjaBag<T> {

    // Inicialize Array

    private List<T> tools;

    public NinjaBag() {
        this.tools = new ArrayList<>();
    }

    // Put tools in the Array
    public void AddTool(T tool) {
        tools.add(tool);
    }

    // Show my list of tools
    public void showTools() {
        System.out.println("\nTools: ");
        for (T tool : tools) {
            System.out.println(tool);
        }
    }

}
