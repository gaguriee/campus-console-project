package star;

import java.util.Scanner;

public class starView {
	private Scanner sc;
	
	public starView() {
		sc = new Scanner(System.in);
	}
	
	//사용자에게서 원하는 도형을 입력받음
	public String getUserShape() {
		System.out.println("출력하고 싶은 도형을 입력하세요.");
		System.out.println("1.삼각형 2.직각삼각형 3.사각형 4.마름모 5.별 6.도형 출력 프로그램 종료");
		return sc.nextLine();
	}
}
