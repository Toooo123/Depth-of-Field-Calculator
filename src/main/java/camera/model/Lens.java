package camera.model;

public class Lens {
    private String make;
    private double maxAperture;
    private int focalLength;

    public Lens (String make, double maxAperture, int focalLength) {
        this.make = make;
        this.maxAperture = maxAperture;
        this.focalLength = focalLength;
    }

    public double getMaxAperture() {
        return this.maxAperture;
    }

    public int getFocalLength() {
        return this.focalLength;
    }

    @Override
    public String toString() {
        return  make + " " + focalLength + "mm F" + maxAperture;
    }
}
