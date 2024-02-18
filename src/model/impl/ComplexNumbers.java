package model.impl;

import model.CalculateNumbers;

public class ComplexNumbers implements CalculateNumbers {
    private double realPart;
    private double imaginaryPart;

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumbers(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        if (imaginaryPart > 0) {
            return String.format("Complex Number: %.2f + %.2fi", realPart, imaginaryPart);
        } else{
            return String.format("Complex Number: %.2f - %.2fi", realPart, Math.abs(imaginaryPart));
        }
    }
}
