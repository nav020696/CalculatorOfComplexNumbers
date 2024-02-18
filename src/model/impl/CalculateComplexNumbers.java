package model.impl;

import model.Calculable;
import model.CalculateNumbers;

public class CalculateComplexNumbers implements Calculable<CalculateNumbers>{

    @Override
    public CalculateNumbers summation(CalculateNumbers number1, CalculateNumbers number2) {
        double real = number1.getRealPart() + number2.getRealPart();
        double imaginary = number1.getImaginaryPart() + number2.getImaginaryPart();
        return new ComplexNumbers(real, imaginary);
    }

    @Override
    public CalculateNumbers subtraction(CalculateNumbers number1, CalculateNumbers number2) {
        double real = number1.getRealPart() - number2.getRealPart();
        double imaginary = number1.getImaginaryPart() - number2.getImaginaryPart();
        return new ComplexNumbers(real, imaginary);
    }

    @Override
    public CalculateNumbers multiplication(CalculateNumbers number1, CalculateNumbers number2) {
        double real = number1.getRealPart() * number2.getRealPart() -
                number1.getImaginaryPart() * number2.getImaginaryPart();
        double imaginary = number1.getRealPart() * number2.getImaginaryPart() +
                number2.getRealPart() * number1.getImaginaryPart();
        return new ComplexNumbers(real, imaginary);
    }

    @Override
    public CalculateNumbers division(CalculateNumbers number1, CalculateNumbers number2) {
        double tempValue = Math.pow(number2.getRealPart(), 2) + Math.pow(number2.getImaginaryPart(), 2);
        double real = (number1.getRealPart() * number2.getRealPart() +
                number1.getImaginaryPart() * number2.getImaginaryPart())/ tempValue;
        double imaginary = (number1.getImaginaryPart() * number2.getRealPart() -
                number1.getRealPart() * number2.getImaginaryPart())/ tempValue;

        return new ComplexNumbers(real, imaginary);
    }

}
