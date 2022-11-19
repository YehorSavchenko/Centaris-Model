package model.test;

public class TestRequest {
    private String locator;

    public TestRequest(String locator) {
        this.locator = locator;
    }

    public TestRequest() {
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }
}
