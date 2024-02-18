package view;

import controller.CalculateController;
import model.CalculateNumbers;

import java.util.HashMap;
import java.util.Map;

public class CalculateView {
    private final CalculateController controller;
    private Map<String, CalculateNumbers> commands;

    public CalculateView(CalculateController controller) {
        this.controller = controller;
        this.commands = new HashMap<>();
    }

    public void run(){
        initializeMap();
    }

    private void initializeMap(){
        commands.put("+", controller.sumOfElements());
        commands.put("-", controller.differenceOfElements());
        commands.put("*", controller.multiplyOfElements());
        commands.put("/", controller.divisionOfElements());
    }
}
