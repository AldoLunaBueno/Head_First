package Chapter_1.new_property_issue;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        // Set up Rick’s guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        for (Guitar guitar : matchingGuitars) {
            GuitarSpec spec = guitar.getSpec();
            if (spec != null) {
                System.out.println("Erin, you might like this " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " " +
                        spec.getNumStrings() + "strings guitar:\n " +
                        spec.getBackWood() + " back and sides,\n " +
                        spec.getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            } else {
                System.out.println("Sorry, Erin, we have nothing for you.");
            }
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...
        inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
        inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
    }
}