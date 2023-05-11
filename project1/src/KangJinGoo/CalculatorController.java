package Calculator;

public class CalculatorController {
    public String userInputCalculation;

    public CalculatorController(String userInputCalculation) {
        this.userInputCalculation = userInputCalculation;
    }

    public int passModelCalculation() {
        //main에서 입력 받은 값을 model에 전달
        CalculatorModel cm = new CalculatorModel(userInputCalculation);
        //model에서 받은 결과값을 view에 전달하기위해 리턴
        return cm.isCalculation();
    }

}
