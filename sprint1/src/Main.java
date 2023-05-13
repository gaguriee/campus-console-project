import Controller.CalculatorController;
import Controller.GugudanController;
import Controller.UserInputController;
import Controller.StarController;
import View.CalculatorView;

public class Main {

    // UserInputController -> GugudanController


    public static void main(String[] args) {

        // 사용자 입력값 받기 "gugudan", "calculator", "star" 중 하나 return
        String userInput = UserInputController.getUserInput();

        // UserInputController -> GugudanController -> GugudanService(Model) -> GugudanController -> GugudanView


        if (userInput.equals("gugudan")) {

            /**
             * -> Main (정수 선택)
             * -> Controller (정수 전달)
             * -> Model (결과 리턴)
             * -> View (결과 출력)
             *
             */

            GugudanController controller = new GugudanController(); // controller에 dan 전
            controller.gugudanController();  // controller에 gugudanController 메서드 호출

        }

        else if(userInput.equals("calculator")){ // CalculateController

            /**
             * -> View (연산자 선택)
             * -> Main (연산자 입력)
             * -> Model (연산)
             * -> Controller (연산 결과 전달)
             * -> View  (연산 결과 출력)
             */


            //view에서 static을 이용해 유저에게 메시지를 전달
            CalculatorView.isInputView();
            //유저에게 입력값 받기
            CalculatorController cc = new CalculatorController();
            //controller가 model의 연산 결과를 받아서 view에 값 전달
            cc.passModelCalculation();

        }
        else { // StarController

            /**
             * Controller
             * -> View (도형 선택)
             * -> Controller
             * -> Model (도형 리턴)
             * -> View (도형 출력)
             */


            StarController starController = new StarController();
            starController.run();


        }





    }
}