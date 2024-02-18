import controller.CalculateComplexNumbersController;
import model.impl.CalculateComplexNumbers;
import model.impl.LoggerCalculatorComplexNumbers;
import view.CalculateView;

public class ApplicationRunner {
    public static void startProgram(){
        CalculateComplexNumbersController controller = new CalculateComplexNumbersController(new LoggerCalculatorComplexNumbers(new CalculateComplexNumbers()));
        CalculateView view = new CalculateView(controller);
        view.run();
    }
}
