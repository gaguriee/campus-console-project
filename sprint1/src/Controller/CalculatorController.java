package Controller;

import Model.CalculatorModel;
import View.CalculatorView;
import Error.CalculatorError;
import View.ExceptionView;

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

        while(true) { //루프형 기능 추가
            //view에서 static을 이용해 유저에게 메시지를 전달
            CalculatorView.isInputView();
            this.userInputCalculation = in.nextLine();

            if(userInputCalculation.equals("q")){
                calculatorView.isExitView();
                break;
            }else {
                //입력값 model에 전달
                calculatorModel = new CalculatorModel(userInputCalculation);
                //model에서 받은 결과값을 view에 전달
                try {
                    calculatorView = new CalculatorView(calculatorModel.isCalculation());
                    //view 출력
                    calculatorView.isOutputView();
                }catch (CalculatorError e){
                    System.out.println(e.getMessage());
                }catch (NumberFormatException e){// 문자열을 숫자로 변환 하려고 할 때 발생하는 예외 (1+ 2)
                    ExceptionView.displayException("calculator", e, "잘못된 형식 입력입니다. 입력 양식을 다시 확인해주세요");
                }catch (StringIndexOutOfBoundsException e){ //index범위 초과 (연산자가 잘못되었을 때)
                    ExceptionView.displayException("calculator", e, "잘못된 형식의 입력입니다. 연산자를 정확히 입력해주세용.");
                }
            }
        }
    }

}