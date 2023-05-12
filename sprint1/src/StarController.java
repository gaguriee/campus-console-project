import Model.starModel;
import View.starView;

public class StarController {
	private starView view;
	private boolean exitCheck;
	
	public StarController(){
		view = new starView();
		exitCheck = false;	//사용자가 q 또는 6을 누르면 true로 변하고, 반복문이 종료됨.
	}	
	
	//원하는 도형을 화면에 그려줌.
	//프로그램이 루프를 돌면서 돌아가다가 사용자가 q 또는 6을 누르면 종료됨.
	public void run() {
		while(!exitCheck) {
			String shape = view.getUserShape();


			switch(shape) {	
			case "삼각형" : 
			case "1" : starModel.generateTriangle(); break;
			case "직각삼각형" : 
			case "2" : starModel.generateRightTriangle(); break;
			case "사각형" : 
			case "3" : starModel.generateSquare(); break;
			case "마름모" : 
			case "4" : starModel.generateDiamond(); break;
			case "별" : 
			case "5" : starModel.generateStar(); break;
			case "6" : 
			case "q" : System.out.println("도형 출력 프로그램을 종료합니다."); exitCheck = true; break;
			default : System.out.println("다시 입력해주세요.");
			}
		}
	}
	
}

