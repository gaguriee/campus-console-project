package View;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GugudanView {

    // 로그 메세지 출력
    public static void logMessage(String message) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date) + " [구구단 실행 중] " + message);

    }

    // 시작 메세지 출력
    public static void printStart() {

        System.out.println("1 ~ 999 사이의 정수를 입력하시오");

    }

    // 구구단 출력
    public void printGugudan(String gugudan) {

        System.out.println(gugudan);

    }

}
