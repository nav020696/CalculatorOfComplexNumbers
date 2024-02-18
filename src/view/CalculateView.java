package view;

import controller.CalculateComplexNumbersController;
import model.CalculateNumbers;
import model.impl.ComplexNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class CalculateView {
    private final CalculateComplexNumbersController controller;
    private Map<String, BiFunction<CalculateNumbers, CalculateNumbers, CalculateNumbers>> commands;

    public CalculateView(CalculateComplexNumbersController controller) {
        this.controller = controller;
        this.commands = new HashMap<>();
    }

    public void run(){
        initializeMap();
        while (true){
            System.out.println("Введите первое комплексное число:");
            String realPart1 = prompt("Введите реальную часть первого комплексного числа");
            String imaginationPart1 = prompt("Введите мнимую часть первого комплексного числа");
            String operation = prompt("Введите операцию: " + commands.keySet());
            System.out.println("Введите второе комплексное число:");
            String realPart2 = prompt("Введите реальную часть второго комплексного числа");
            String imaginationPart2 = prompt("Введите мнимую часть второго комплексного числа");
            CalculateNumbers number1 = createComplexNumbers(Double.parseDouble(realPart1), Double.parseDouble(imaginationPart1));
            CalculateNumbers number2 = createComplexNumbers(Double.parseDouble(realPart2), Double.parseDouble(imaginationPart2));
            BiFunction<CalculateNumbers, CalculateNumbers, CalculateNumbers> function = commands.get(operation);
            System.out.println("Result: " + function.apply(number1, number2));
            String next = prompt("Продолжаем: y/n");
            if (next.equals("n")){
                return;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message + " ");
        return in.nextLine();
    }
    private void initializeMap(){
        commands.put("+", controller::sumOfElements);
        commands.put("-", controller::differenceOfElements);
        commands.put("*", controller::multiplyOfElements);
        commands.put("/", controller::divisionOfElements);
    }

    private CalculateNumbers createComplexNumbers(double real, double imagination){
        return new ComplexNumbers(real, imagination);
    }
}
