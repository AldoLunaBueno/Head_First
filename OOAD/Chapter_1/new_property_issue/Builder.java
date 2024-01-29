package Chapter_1.new_property_issue;

public enum Builder {

    FENDER("Fender"),
    MARTIN("Martin"),
    GIBSON("Gibson"),
    COLLINGS("Collings"),
    OLSON("Olson"),
    RYAN("Ryan"),
    PRS("Prs"),
    ANY("Any");

    public final String label;

    private Builder(String label) {
        this.label = label;
    }
    
    @Override
    public String toString() {
        return this.label;
    }
}
