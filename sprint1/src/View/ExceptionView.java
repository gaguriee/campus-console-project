package View;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionView {

    public static void displayException( String programName, Exception e, String errorMessage ) {

        // 예외 발생 시 원하는 출력 방식으로 예외 정보를 표시할 수 있음

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date) + " ["+programName+" 실행 중 에러 발생] " + e.getMessage());

        // 에러 메시지를 직접 넣어줄 수 있음
        System.out.println(errorMessage);


    }


}
