package Controller;

import Model.starModel;
import View.starView;

public class StarController {
	private starModel model;
	private starView view;
	private boolean exitCheck;
	
	public StarController(){
		model = new starModel();
		view = new starView();
		exitCheck = false;	//사용자가 q 또는 6을 누르면 true로 변하고, 반복문이 종료됨.
	}	
	
	//원하는 도형을 화면에 그려줌.
	//프로그램이 루프를 돌면서 돌아가다가 사용자가 q 또는 6을 누르면 종료됨.
	public void run() {
		while(!exitCheck) {
			starView.logMessage("이것은 로그 메세지 입니다");
			while(!exitCheck) {
				String shape = view.getUserShape();
				switch(shape) {	
				case "삼각형" : 
				case "1" : view.printShape(model.generateTriangle());break;
				case "직각삼각형" : 
				case "2" : view.printShape(model.generateRightTriangle()); break;
				case "사각형" : 
				case "3" : view.printShape(model.generateSquare()); break;
				case "마름모" : 
				case "4" : view.printShape(model.generateDiamond()); break;
				case "별" : 
				case "5" : view.printShape(model.generateStar()); break;
				case "6" : 
				case "q" :  view.exitShapeProgram(); exitCheck = true; break;
				default : view.reEnter();
				}
			}
	}
	
}

