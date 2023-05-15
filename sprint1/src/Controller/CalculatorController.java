package Controller;

import Model.CalculatorModel;
import View.CalculatorView;
import Error.CalculatorError;
import java.util.Scanner;

public class CalculatorController {
    private String userInputCalculation; //변수를 공유할 필요가 없으므로 private로 선언
    private boolean exitCheck;
    private CalculatorModel calculatorModel;
    private CalculatorView calculatorView;

    public CalculatorController() {

    }




    public void passModelCalculation()  {
        Scanner in = new Scanner(System.in);
        //유저에게 입력값을 받음

        while(!exitCheck) { //루프형 기능 추가
            //view에서 static을 이용해 유저에게 메시지를 전달
            CalculatorView.isInputView();
            this.userInputCalculation = in.nextLine();

            if(userInputCalculation.equals("q") == true){
                calculatorView.isExitView();
                exitCheck = true;
            }else {
                //입력값 model에 전달
                calculatorModel = new CalculatorModel(userInputCalculation);
                //model에서 받은 결과값을 view에 전달
                try {
                    //발생할 수 있는 오류
                    //1.띄어쓰기를 안했을 시
                    //2.문자열 입력 시
                    //연산자 입력 안했을 시
                    calculatorView = new CalculatorView(calculatorModel.isCalculation());
                    //view 출력
                    calculatorView.isOutputView();
                }catch (CalculatorError e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}