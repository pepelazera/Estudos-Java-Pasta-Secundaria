package Generic_Second_Class;

public class MainGenerics {
    public static void main(String[] args) {

        // Here, I use the superclass "Object" to work with different types of objects
        NinjaBag<Object> ninjaBag = new NinjaBag<>();
        ninjaBag.AddTool(new Kunai("Explosive Kunai"));
        ninjaBag.AddTool(new Shuriken(3));
        ninjaBag.AddTool(new Parchment("Frog invocation parchment"));
        ninjaBag.AddTool(new Parchment("Eagle parchment"));
        ninjaBag.AddTool(new PartnerNinja("Akamaru"));

        System.out.println("Itens in the ninja bag: ");
        ninjaBag.showTools();

    }
}
