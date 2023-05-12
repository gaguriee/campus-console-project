package Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        //view에서 static을 이용해 유저에게 메시지를 전달
        CalculatorView.isInputView();
        //Scanner를 이용해서 controller에 요청
        Scanner in = new Scanner(System.in);
        CalculatorController cc = new CalculatorController(in.nextLine());
        //controller가 model의 연산 결과를 받아서 view에 값 전달
        CalculatorView cv = new CalculatorView(cc.passModelCalculation());
        //controller가 view에 전달한 결과값 출력
        cv.isOutputView();

    }
}



