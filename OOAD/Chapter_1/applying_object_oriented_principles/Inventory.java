package Chapter_1.applying_object_oriented_principles;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            // Ignore serial number since that’s unique
            // Ignore price since that’s unique
            Builder builder = searchSpec.getBuilder();
            if (!builder.equals(guitarSpec.getBuilder()))
                continue;
            String model = searchSpec.getModel();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitarSpec.getModel())))
                continue;
            Type type = searchSpec.getType();
            if (!type.equals(guitarSpec.getType()))
                continue;
            Wood backWood = searchSpec.getBackWood();
            if (!backWood.equals(guitarSpec.getBackWood()))
                continue;
            Wood topWood = searchSpec.getTopWood();
            if (!topWood.equals(guitarSpec.getTopWood()))
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}