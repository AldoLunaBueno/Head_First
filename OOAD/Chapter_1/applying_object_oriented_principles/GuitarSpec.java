package Chapter_1.applying_object_oriented_principles;

public class GuitarSpec {
    String model;
    Type type;
    Builder builder;
    Wood backWood, topWood;

    public GuitarSpec(Builder builder, String model, Type type,
            Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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
}
