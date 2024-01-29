package Chapter_1.applying_object_oriented_principles;

public enum Type {
    
    ACOUSTIC("Acoustic"),
    ELECTRIC("Electric");
    
    public final String label;

    private Type(String label) {
        this.label = label;
    }
    @Override
    public String toString() {
        return this.label;
    }
}
