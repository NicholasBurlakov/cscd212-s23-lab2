package cscd212classes.lab2;

import java.util.Objects;

public class Television implements Comparable<Television>{
    private final boolean fourK;
    private final String make;
    private final String model;
    private final int resolution;
    private final int screenSize;
    private final boolean smart;

    public Television(final String make, final String model, final int resolution, final int screenSize, final boolean smart) throws IllegalArgumentException {
        if (make == null || make.isEmpty() || model == null || model.isEmpty() || screenSize < 32 || resolution < 720) {
            throw new IllegalArgumentException("Invalid parameter in constructor");
        }
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;
        this.fourK = (resolution == 2160);
    }

    public Television(final String make, final String model, final boolean smart, final int screenSize, final int resolution) throws IllegalArgumentException{
        if (make == null || make.isEmpty() || model == null || model.isEmpty() || screenSize < 32 || resolution < 720) {
            throw new IllegalArgumentException("Invalid parameter in constructor");
        }
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.fourK = (resolution == 2160);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return fourK == that.fourK && resolution == that.resolution && screenSize == that.screenSize && smart == that.smart && Objects.equals(make, that.make) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return this.make.hashCode() + this.model.hashCode() + this.resolution + Boolean.hashCode(this.smart) + Boolean.hashCode(this.fourK);
    }

    //edit toString to fit the docs
    @Override
    public String toString() {
        String str = "";
        String str1 = "";
        if (resolution == 2160) {
            str = " smart";
        }
        if (fourK) {
            str1 = "4k";
        } else {
            str1 = String.valueOf(resolution);
        }
        return make + "-" + model + ", " + screenSize + " inch" + str + " tv with " + str1 + " resolution";
    }
    @Override
    public int compareTo(Television another) throws IllegalArgumentException {
        if (another == null) {
            throw new IllegalArgumentException("null parameter in the compareTo method");
        }
        if (this.make.compareTo(another.make) == 0) {
            if (this.model.equals(another.model)) {
                return this.screenSize - another.screenSize;
            } else {
                return this.model.compareTo(another.model);
            }
        } else {
            return this.make.compareTo(another.make);
        }
    }
}
