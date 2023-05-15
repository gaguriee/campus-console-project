package Controller;

import Model.GugudanModel;
import View.GugudanView;

import java.util.InputMismatchException;
import java.util.Scanner;


public class GugudanController {

    private GugudanModel model;
    private GugudanView view;

    public GugudanController() { // 생성자

        this.model = model;
        this.view = view;

    }

    public void gugudanController() {

        GugudanModel gugudanModel = new GugudanModel(); // 모델 객체 생성
        GugudanView gugudanView = new GugudanView(); // 뷰 객체 생성

        Scanner in = new Scanner(System.in);

        GugudanView.printStart(); // 시작 메세지

        int dan;
        while (true) {
            try {

                /**
                 * in.nextInt()로 받게 되면 int형이 입력되지 않았을 때 InputMismatchException이 발생합니다! 핸들링해주세용
                 */

                dan = in.nextInt();

                if (dan >= 1 && dan < 999) { // 1 ~ 999 사이일 경우
                    String gugudan = gugudanModel.getGugudan(dan); // gugudan에 getGugudan메서드 리턴 값을 저장
                    gugudanView.printGugudan(gugudan); // pringGugudan 메서드에 gugudan매개변수를 넣어줌
                    break;
                } else {
                    throw new InputMismatchException(); // catch 문으로 이동 입력값의 Type이 다를경우
                }
            } catch (InputMismatchException e) {
                GugudanView.displayException("구구단", e); // 에러 문구
                in.nextLine(); // 에러발생 후 다시 사용자 입력 값 받음
            }
        }
    }
}
