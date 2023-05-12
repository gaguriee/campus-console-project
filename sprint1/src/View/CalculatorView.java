package View;

public class CalculatorView {
    int result; //Controller에서 받아온 결과값 저장

    public CalculatorView(int result) {
        this.result = result;
    }

    public static void isInputView() {
        System.out.println("연산식을 입력해주세요");
        System.out.println("연산자와 피연산자를 띄어쓰기로 구분하는 방식으로 입력해주세용");
    }

    public void isOutputView() { //결과값 출력
        System.out.println("결과값은 " + result + " 입니다!!!!");
    }
}
