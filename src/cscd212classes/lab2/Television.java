package cscd212classes.lab2;

import java.util.Objects;

public class Television implements Comparable<Television>{
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

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getResolution() {
        return resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }


    @Override
    public int compareTo(Television o) {
        return this.make.compareTo(o.make);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return fourK == that.fourK && resolution == that.resolution && screenSize == that.screenSize && smart == that.smart && Objects.equals(make, that.make) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fourK, make, model, resolution, screenSize, smart);
    }

    //edit toString to fit the docs
    @Override
    public String toString() {
        return "Television{" +
                "fourK=" + fourK +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", resolution=" + resolution +
                ", screenSize=" + screenSize +
                ", smart=" + smart +
                '}';
    }
}
