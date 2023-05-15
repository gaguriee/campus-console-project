package View;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StarView {
	private Scanner sc;

	public StarView() {
		sc = new Scanner(System.in);
	}


	//로그메세지 출력
	public static void logMessage(String message) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date) + "[별찍기 실행 중] " + message);
	}

	//사용자에게서 원하는 도형을 입력받음
	public String getUserShape() {
		System.out.println("출력하고 싶은 도형을 입력하세요.");
		System.out.println("1.삼각형 2.직각삼각형 3.사각형 4.마름모 5.별 6.도형 출력 프로그램 종료");
		return sc.nextLine();
	}

	//입력받은 도형을 출력함
	public void printShape(String shape) {
		System.out.println(shape);
	}

	public void exitShapeProgram() {
		System.out.println("도형 출력 프로그램을 종료합니다.");
	}

	public void reEnter() {
		System.out.println("다시 입력해주세요.");
	}
}
