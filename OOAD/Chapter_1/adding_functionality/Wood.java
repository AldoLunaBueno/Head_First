package Chapter_1.adding_functionality;

public enum Wood {
    INDIAN_ROSEWOOD("Indian Rosewood"),
    BRAZILIAN_ROSEWOOD("Brazilian Rosewood"),
    MAHOGANY("Mahogany"),
    MAPLE("Maple"),
    COCOBOLO("Cocobolo"),
    CEDAR("Cedar"),
    ADIRONDACK("Adirondack"),
    ALDER("Alder"),
    SITKA("Sitka");

    public final String label;

    private Wood(String label) {
        this.label = label;
    }
    
    @Override
    public String toString() {
        return this.label;
    }
}
