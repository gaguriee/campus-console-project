import Model.GugudanModel;
import View.GugudanView;

import java.util.Scanner;

import Error.GugudanError;

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

        GugudanView.logMessage("이것은 로그 메세지 입니다.");
        GugudanView.printStart();

        int dan;
        while (true) {
            try {
                dan = in.nextInt();
                if (dan < 1 || dan > 999) { // 1 ~ 999 사이가 아닐때
                    throw new GugudanError(); // catch 문으로 이동
                } else {
                    String gugudan = gugudanModel.getGugudan(dan); // gugudan에 getGugudan메서드 리턴 값을 저장
                    gugudanView.printGugudan(gugudan); // pringGugudan 메서드에 gugudan매개변수를 넣어줌
                    break;
                }
            } catch (GugudanError e) {
                GugudanView.printError();
                in.nextLine(); // 에러발생 후 다시 사용자 입력 값 받음
            }
        }
    }
}
