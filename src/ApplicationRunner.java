import controller.CalculateController;
import view.CalculateView;

public class ApplicationRunner {
    public static void startProgram(){
        CalculateController controller = new CalculateController();
        CalculateView view = new CalculateView(controller);
        view.run();
    }
}
