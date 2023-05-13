package Model;

public class CalculatorModel {
    String userInputCalculation;

    public CalculatorModel(String userInputCalculation) {
        this.userInputCalculation = userInputCalculation;

    }

    public int isCalculation() {
        char operator = ' '; //연산자
        int operand1 = 0; //피연산자1
        int operand2 = 0; //피연산자2
        int operatorPosition = 0; //연산자 위치 번호

        // 연산자 index번호 찾기
        // 있으면 그 연산자와 번호를 저장
        if (userInputCalculation.indexOf('+') != -1) { //indexof를 이용해 연산자 위치를 찾는 과정
            operatorPosition = userInputCalculation.indexOf('+');
            operator = '+';
        } else if (userInputCalculation.indexOf('-') != -1) {
            operatorPosition = userInputCalculation.indexOf('-');
            operator = '-';
        } else if (userInputCalculation.indexOf('*') != -1) {
            operatorPosition = userInputCalculation.indexOf('*');
            operator = '*';
        } else if (userInputCalculation.indexOf('/') != -1) {
            operatorPosition = userInputCalculation.indexOf('/');
            operator = '/';
        }
//        } else {
//            System.out.println("잘못된 연산자 입니다."); //TODO 오류 처리 해야함
//        }


        //indexof 메서드로 연산자의 위치를 알아낸 것을 활용하여
        //substring 메서드로 범위를 지정하여 피연산자 부분 문자열 추출 후
        //Integer 메서드로 int형으로 변환
        operand1 = Integer.parseInt(userInputCalculation.substring(0, (operatorPosition - 1)));
        operand2 = Integer.parseInt(userInputCalculation.substring((operatorPosition + 2)));

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
}
