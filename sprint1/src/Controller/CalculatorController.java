package Controller;

import Model.CalculatorModel;
import View.CalculatorView;

import java.util.Scanner;

public class CalculatorController {
    private String userInputCalculation; //변수를 공유할 필요가 없으므로 private로 선언
    private CalculatorModel cm;

    public CalculatorController(String userInputCalculation) {
        this.userInputCalculation = userInputCalculation;

        //Scanner를 이용해서 controller에 요청
        Scanner in = new Scanner(System.in);
        cm = new CalculatorModel(userInputCalculation);//main에서 입력 받은 값을 model에 전달
    }

    public int passModelCalculation() {
        //model에서 받은 결과값을 view에 전달하기위해 리턴
        return cm.isCalculation();
    }

}