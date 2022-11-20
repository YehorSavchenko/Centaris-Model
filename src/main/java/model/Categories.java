package model;

public enum Categories {
    CLOTHES("Clothes"),
    TOYS("Toys");

    public final String label;

    private Categories(String label) {
        this.label = label;
    }
}
