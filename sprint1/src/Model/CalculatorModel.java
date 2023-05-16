package Model;
import Error.CalculatorError;

public class CalculatorModel {
    String userInputCalculation;

    public CalculatorModel(String userInputCalculation) {
        this.userInputCalculation = userInputCalculation;

    }

    public double isCalculation() throws CalculatorError {
        char operator = ' '; //연산자
        double operand1 = 0; //피연산자1
        double operand2 = 0; //피연산자2
        int operatorPosition = 0; //연산자 위치 번호

        if(userInputCalculation.contains(" ") == false){ //오류 메시지들 if문 시작지점에 위치 시키기
            throw new CalculatorError("띄어쓰기를 하지 않아 오류가 발생했어요!!");
        } else if(isNumber(userInputCalculation) == false){
            throw new CalculatorError("문자를 입력해서 오류가 발생했어요!!");
        } else if(checkOperatorCount(userInputCalculation) == false){ //연산자 한 개만 받도록 하기
            throw new CalculatorError("연산자를 하나만 입력해주세요!!");
        } else {
            // 연산자 index번호 찾기
            // 있으면 그 연산자와 번호를 저장
            if (userInputCalculation.indexOf('+') != -1) { //indexof를 이용해 연산자 위치를 찾는 과정
                operatorPosition = userInputCalculation.indexOf('+');
                operator = '+';
            } else if (userInputCalculation.indexOf('-') != -1) {
                operatorPosition = userInputCalculation.indexOf('-');
                operator = '-';
            } else if (userInputCalculation.indexOf('*') != -1) {
                operator = '*';
                operatorPosition = userInputCalculation.indexOf('*');
            } else if (userInputCalculation.indexOf('/') != -1) {
                operatorPosition = userInputCalculation.indexOf('/');
                operator = '/';
            }
        }

        //indexof 메서드로 연산자의 위치를 알아낸 것을 활용하여
        //substring 메서드로 범위를 지정하여 피연산자 부분 문자열 추출 후
        //Double로 변환
        operand1 = Double.parseDouble(userInputCalculation.substring(0, (operatorPosition - 1)));
        operand2 = Double.parseDouble(userInputCalculation.substring((operatorPosition + 2)));

        if (operator == '+') { // 연산 후 결과값 리턴 //이거보다 비교할게 많으면 switch case문 활용 가능
            return operand1 + operand2;
        } else if (operator == '-') {
            return operand1 - operand2;
        } else if (operator == '/') {
            return operand1 / operand2;
        } else {
            return operand1 * operand2;
        }

    }

    public boolean isNumber(String input) { //숫자와 문자열을 제외한 문자를 입력하는지 확인하는 메서드
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c) && "+-*/.".indexOf(c) == -1 && c !=' ') {
                //연산자,공백,'.'을 제외한 문자열 입력받을시 false
                return false;
            }
        }
        return true;
    }
    public boolean checkOperatorCount(String input) { //연산자 개수를 확인하는 메서드
        int operatorCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operatorCount++;
            }
        }
        if (operatorCount == 1){
            return true;
        }else {
            return false;
        }
    }
}
