package cscd212classes.lab2;

public class Television extends Object {
    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(String make, String model, int resolution, int screenSize, boolean smart) {
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;
    }

    public Television(String make, String model, boolean smart, int screenSize, int resolution) {
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;
    }
}
