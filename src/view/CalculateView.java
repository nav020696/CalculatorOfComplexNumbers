package view;

import controller.CalculateComplexNumbersController;
import model.CalculateNumbers;
import model.impl.ComplexNumbers;

import java.util.Scanner;

public class CalculateView {
    private final CalculateComplexNumbersController controller;
//    private Map<String, Calculable> commands;

    public CalculateView(CalculateComplexNumbersController controller) {
        this.controller = controller;
//        this.commands = new HashMap<>();
    }

    public void run(){
//        initializeMap();
        while (true){
            System.out.println("Введите первое комплексное число:");
            String realPart1 = prompt("Введите реальную часть первого комплексного числа");
            String imaginationPart1 = prompt("Введите мнимую часть первого комплексного числа");
            String operation = prompt("Введите операцию: +, -, *, /");
            System.out.println("Введите второе комплексное число:");
            String realPart2 = prompt("Введите реальную часть второго комплексного числа");
            String imaginationPart2 = prompt("Введите мнимую часть второго комплексного числа");
            CalculateNumbers number1 = createComplexNumbers(Double.parseDouble(realPart1), Double.parseDouble(imaginationPart1));
            CalculateNumbers number2 = createComplexNumbers(Double.parseDouble(realPart2), Double.parseDouble(imaginationPart2));

            switch (operation){
                case "+":
                    System.out.println("Result: " + controller.sumOfElements(number1, number2));
                    break;
                case "-":
                    System.out.println("Result: " + controller.differenceOfElements(number1, number2));
                    break;
                case "*":
                    System.out.println("Result: " + controller.multiplyOfElements(number1, number2));
                    break;
                case "/":
                    System.out.println("Result: " + controller.divisionOfElements(number1, number2));
                    break;
                default:
                    System.out.println(0);
            }
            String countinue = prompt("Продолжаем: y/n");
            if (countinue.equals("n")){
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
//        commands.put("+", Calculable);
//        commands.put("-", controller.differenceOfElements(null, null));
//        commands.put("*", controller.multiplyOfElements(null, null));
//        commands.put("/", controller.divisionOfElements(null, null));
    }

    private CalculateNumbers createComplexNumbers(double real, double imagination){
        return new ComplexNumbers(real, imagination);
    }
}
