package model;

public abstract class CalculateNumbers {
    protected double realPart;
    protected double imaginaryPart;

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public CalculateNumbers(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
}
