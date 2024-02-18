package model.impl;

import model.Calculable;

public class CalculateComplexNumbers implements Calculable<ComplexNumbers>{

    @Override
    public ComplexNumbers summation(ComplexNumbers number1, ComplexNumbers number2) {
        double real = number1.getRealPart() + number2.getRealPart();
        double imaginary = number1.getImaginaryPart() + number2.getImaginaryPart();
        return new ComplexNumbers(real, imaginary);
    }

    @Override
    public ComplexNumbers subtraction(ComplexNumbers number1, ComplexNumbers number2) {
        double real = number1.getRealPart() - number2.getRealPart();
        double imaginary = number1.getImaginaryPart() - number2.getImaginaryPart();
        return new ComplexNumbers(real, imaginary);
    }

    @Override
    public ComplexNumbers multiplication(ComplexNumbers number1, ComplexNumbers number2) {
        double real = number1.getRealPart() * number2.getRealPart() -
                number1.getImaginaryPart() * number1.getImaginaryPart();
        double imaginary = number1.getRealPart() * number2.getImaginaryPart() +
                number2.getRealPart() * number1.getImaginaryPart();
        return new ComplexNumbers(real, imaginary);
    }

    @Override
    public ComplexNumbers division(ComplexNumbers number1, ComplexNumbers number2) {
        double tempValue = Math.pow(number2.getRealPart(), 2) + Math.pow(number2.getImaginaryPart(), 2);
        double real = (number1.getRealPart() * number2.getRealPart() +
                number1.getImaginaryPart() * number2.getImaginaryPart())/ tempValue;
        double imaginary = (number1.getImaginaryPart() * number2.getRealPart() -
                number1.getRealPart() * number2.getImaginaryPart())/ tempValue;

        return new ComplexNumbers(real, imaginary);
    }
}
