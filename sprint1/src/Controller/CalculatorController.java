package Controller;

import Model.CalculatorModel;
import View.CalculatorView;

import java.util.Scanner;

import java.util.Scanner;

public class CalculatorController {
    private String userInputCalculation; //변수를 공유할 필요가 없으므로 private로 선언
    private boolean exitCheck;
    private CalculatorModel cm;
    private CalculatorView cv;

    public CalculatorController() {

    }


    public void passModelCalculation() {
        Scanner in = new Scanner(System.in);
        //유저에게 입력값을 받음

        while(!exitCheck) { //루프형 기능 추가
            this.userInputCalculation = in.nextLine();
            if(userInputCalculation == "q"){
                cv.isExitView();
                exitCheck = true;
            }else {
                //입력값 model에 전달
                cm = new CalculatorModel(userInputCalculation);
                //model에서 받은 결과값을 view에 전달
                cv = new CalculatorView(cm.isCalculation());
                //view 출력
                cv.isOutputView();
            }
        }
    }

}