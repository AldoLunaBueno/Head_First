package Chapter_1.new_property_issue;

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
