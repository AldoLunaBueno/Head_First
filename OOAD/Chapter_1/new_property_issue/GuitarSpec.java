package Chapter_1.new_property_issue;

public class GuitarSpec {
    String model;
    Type type;
    Builder builder;
    Wood backWood, topWood;
    int numStrings;

    public GuitarSpec(Builder builder, String model, Type type,
            Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }
    
    public boolean equal(GuitarSpec spec) {
        Builder builder = spec.getBuilder();
        if (!builder.equals(this.builder))
            return false;
        String model = spec.getModel();
        if ((model != null) && (!model.equals("")) &&
                (!model.equals(this.model)))
            return false;
        Type type = spec.getType();
        if (!type.equals(this.type))
            return false;
        Wood backWood = spec.getBackWood();
        if (!backWood.equals(this.backWood))
            return false;
        Wood topWood = spec.getTopWood();
        if (!topWood.equals(this.topWood))
            return false;
        int numStrings = spec.getNumStrings();
        if (numStrings != this.numStrings)
            return false;
        return true;
    }
    
    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }
}
