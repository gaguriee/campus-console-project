package View;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculatorView {
    double result; //Controller에서 받아온 결과값 저장

    public CalculatorView(double result) {
        this.result = result;
    }

    public static void isInputView() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println("-------------------------------------------------");


        System.out.println(formatter.format(date) + "[calculator 실행 중] ");



        System.out.println("연산식을 입력해주세요");
        System.out.println("연산자와 피연산자를 띄어쓰기로 구분하는 방식으로 입력해주세용");
        System.out.println("종료하려면 q를 입력해주세요");
        System.out.println("-------------------------------------------------"); //여러개 입력시 구별하기위해 추가
    }


    public void isOutputView() { //결과값 출력

        System.out.println("결과값은 " + result + " 입니다!!!!");
    }

    public void isExitView(){
        System.out.println("계산기 프로그램을 종료합니다");
    }
}
