import controller.CalculateController;
import model.impl.CalculateComplexNumbers;
import view.CalculateView;

public class ApplicationRunner {
    public static void startProgram(){
        CalculateController controller = new CalculateController(new CalculateComplexNumbers());
        CalculateView view = new CalculateView(controller);
        view.run();
    }
}
