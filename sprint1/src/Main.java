import Controller.*;
import View.CalculatorView;

public class Main {


    public static void main(String[] args) {

        // 사용자 입력값 받기 "gugudan", "calculator", "star" 중 하나 return
        InputType input = UserInputController.getUserInput();

        switch (input) {
            case GUGUDAN:
                // gugudan 처리 코드
                GugudanController controller = new GugudanController();
                controller.gugudanController();
                break;
            case CALCULATOR:
                // calculator 처리 코드
                CalculatorController cc = new CalculatorController();
                cc.passModelCalculation();
                break;
            case STAR:
                // star 처리 코드
                StarController starController = new StarController();
                starController.run();
                break;
            default:
                // 예외 처리 코드
                break;
        }


    }
}