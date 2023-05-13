package Model;

public class StarModel {
	//사각형 생성 메소드
	public String generateSquare() {
		String star="";
		int width = 5;
		int height = 5;
		for (int i = 0; i < height; i++) {	// 높이 생성
			for (int j = 0; j < width; j++) {// 너비 생성
				star+="* ";
			}
			star+="\n";
		}
		return star;
	}

	//직각 삼각형 생성 메소드
	public String generateRightTriangle() {
		String star="";
		int width = 8;
		for (int i = 0; i < width; i++) {
			for(int j=0; j<=i; j++) {
				star+="* ";
			}
			star+="\n";
		}
		return star;
	}

	//삼각형 생성 메소드
	public String generateTriangle() {
		String star="";
		int width = 8;
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= width - i; j++) { // 공백 출력
				star+=" ";
			}
			for (int k = 1; k <= i; k++) { // 별 출력
				star+="* ";
			}
			star+="\n";// 다음 행으로 이동
		}
		return star;
	}

	//마름모 생성 메소드
	public String generateDiamond() {
		String star="";
		int width = 5;
		// 위쪽 삼각형 출력하는 for문
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= width - i; j++) {
				star+=" ";
			}
			for (int k = 1; k <= i; k++) {
				star+="* ";
			}
			star+="\n";
		}
		// 아래쪽 삼각형 출력하는 for문
		for (int i = 1; i <= width - 1; i++) {
			for (int j = 1; j <= i; j++) {
				star+=" ";
			}
			for (int k = i; k <= width - 1; k++) {
				star+="* ";
			}
			star+="\n";
		}
		return star;
	}

	//별 생성 메소드
	public String generateStar() {
		String star="";
		int width = 8;
		int starCount=1;

		// 별 위쪽 삼각형
		for (int i = 1; i <= width; i++) {
			for(int  j = 1; j<=(width*2); j++) {
				star+=" ";
			}
			for (int k = 1; k <= width - i; k++) { // 공백 출력
				star+=" ";
			}
			for (int l = 1; l <= i; l++) { // 별 출력
				star+="* ";
			}
			star+="\n"; // 다음 행으로 이동
		}

		// 별 중간 몸통
		for(int i=1; i<=width; i++) {

			for(int j=1; j<=i; j++) {
				star+=" ";
			}
			for (int k = i; k <= (width*3); k++) {
				star+="* ";
			}
			star+="\n";
		}

		//별 다리
		for(int i=1; i<=width+1; i++) {
			for(int  j = i; j<=width; j++) {
				star+=" ";;
			}
			for (int k = i; k <= width; k++) {
				star+="* ";
			}
			for(int m=1; m<=starCount-1; m++) {
				star+=" ";;
			}
			for(int m=1; m<=starCount; m++) {
				star+=" ";
			}
			for (int n = i; n <= width; n++) {
				star+="* ";
			}
			star+="\n";
			starCount+=3;
		}
		return star;
	}
}