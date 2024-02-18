package model.impl;

import model.CalculateNumbers;

public class ComplexNumbers extends CalculateNumbers {

    public ComplexNumbers(double realPart, double imaginaryPart) {
        super(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        if (imaginaryPart > 0) {
            return String.format("Result: %.2f + %.2fi", realPart, imaginaryPart);
        } else if (imaginaryPart == 0){
            {
                return String.format("Result: %.2f - i", realPart);
            }
        }else if (realPart == 0){
            {
                return String.format("Result: %.2fi", imaginaryPart);
            }
        }else{
            return String.format("Result: %.2f - %.2fi", realPart, Math.abs(imaginaryPart));
        }
    }
}
