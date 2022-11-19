package model.test;

public class TestResponse {
    private String locator;
    private String entry;

    public TestResponse(String locator, String entry) {
        this.locator = locator;
        this.entry = entry;
    }

    public TestResponse() {
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "BasicEntry{" +
                "locator='" + locator + '\'' +
                ", entry='" + entry + '\'' +
                '}';
    }
}
