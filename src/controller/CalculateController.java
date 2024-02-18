package controller;

import model.CalculateNumbers;
import model.impl.CalculateComplexNumbers;
import model.impl.ComplexNumbers;

public class CalculateController {

    CalculateComplexNumbers calculateComplexNumbers;

    public CalculateController(CalculateComplexNumbers calculateComplexNumbers) {
        this.calculateComplexNumbers = calculateComplexNumbers;
    }

    public CalculateNumbers sumOfElements(CalculateNumbers number1, CalculateNumbers number2) {
        return calculateComplexNumbers.summation(number1, number2);
    }

    public CalculateNumbers differenceOfElements(CalculateNumbers number1, CalculateNumbers number2) {
        return calculateComplexNumbers.subtraction(number1, number2);
    }

    public CalculateNumbers multiplyOfElements(CalculateNumbers number1, CalculateNumbers number2) {
        return calculateComplexNumbers.multiplication(number1, number2);
    }

    public CalculateNumbers divisionOfElements(CalculateNumbers number1, CalculateNumbers number2) {
        return calculateComplexNumbers.division(number1, number2);
    }
}
