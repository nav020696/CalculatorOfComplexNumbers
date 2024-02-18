package model.impl;

import model.Calculable;
import model.CalculateNumbers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerCalculatorComplexNumbers implements Calculable<CalculateNumbers> {
    Calculable<CalculateNumbers> calculable;
    private final Logger logger = Logger.getLogger(LoggerCalculatorComplexNumbers.class.getName());
    private FileHandler fileHandler = null;

    public LoggerCalculatorComplexNumbers(Calculable<CalculateNumbers> calculable) {
        this.calculable = calculable;
        try {
            this.fileHandler = new FileHandler("/Users/anna_neumoina/Desktop/Calculator/src/MyLog.log");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        LogManager.getLogManager().reset();
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);
    }

    @Override
    public CalculateNumbers summation(CalculateNumbers element1, CalculateNumbers element2) {
        logger.info(String.format("Сложение двух комплексных чисел %s и %s", element1, element2));
        return calculable.summation(element1, element2);
    }

    @Override
    public CalculateNumbers subtraction(CalculateNumbers element1, CalculateNumbers element2) {
        logger.info(String.format("Вычитание двух комплексных чисел %s и %s", element1, element2));
        return calculable.subtraction(element1, element2);
    }

    @Override
    public CalculateNumbers multiplication(CalculateNumbers element1, CalculateNumbers element2) {
        logger.info(String.format("Умножение двух комплексных чисел %s и %s", element1, element2));
        return calculable.multiplication(element1, element2);
    }

    @Override
    public CalculateNumbers division(CalculateNumbers element1, CalculateNumbers element2) {
        logger.info(String.format("Деление двух комплексных чисел %s и %s", element1, element2));
        return calculable.division(element1, element2);
    }
}
