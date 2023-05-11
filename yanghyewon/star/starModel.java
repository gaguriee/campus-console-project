package star;

public class starModel {
	
	//사각형 생성 메소드
	public static void generateSquare() {
		int width = 5;
		int height = 5;
		for (int i = 0; i < height; i++) {	// 높이 생성
			for (int j = 0; j < width; j++) {// 너비 생성
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	//직각 삼각형 생성 메소드
	public static void generateRightTriangle() {
		int width = 8;
		for (int i = 0; i < width; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	//삼각형 생성 메소드
	public static void generateTriangle() {
		int width = 8;
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= width - i; j++) { // 공백 출력
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) { // 별 출력
				System.out.print("* ");
			}
			System.out.println(); // 다음 행으로 이동
		}
		System.out.println();
	}

	//마름모 생성 메소드
	public static void generateDiamond() {
		int width = 5;
		// 위쪽 삼각형 출력하는 for문
		for (int i = 1; i <= width; i++) { 
			for (int j = 1; j <= width - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// 아래쪽 삼각형 출력하는 for문
		for (int i = 1; i <= width - 1; i++) { 
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= width - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	//별 생성 메소드
	public static void generateStar() {
		int width = 8;
		int starCount=1;
		
		// 별 위쪽 삼각형
		for (int i = 1; i <= width; i++) {
			for(int  j = 1; j<=(width*2); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= width - i; k++) { // 공백 출력
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) { // 별 출력
				System.out.print("* ");
			}
			System.out.println(); // 다음 행으로 이동
		}
		
		// 별 중간 몸통
		for(int i=1; i<=width; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= (width*3); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//별 다리
		for(int i=1; i<=width+1; i++) {
			for(int  j = i; j<=width; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= width; k++) {
				System.out.print("* ");
			}
			for(int m=1; m<=starCount-1; m++) {
				System.out.print(" ");
			}
			for(int m=1; m<=starCount; m++) {
				System.out.print(" ");
			}
			for (int n = i; n <= width; n++) {
				System.out.print("* ");
			}
			System.out.println();
			starCount+=3;
		}
		System.out.println();
	}
}
