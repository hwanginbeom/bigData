package step01.syntax;

public class Step07static {
	static int no;//객체 생성 이전에 사용 가능
	int getNo() { //객체 생성 이후에만 사용 가능
		return no;
	}
	/* 오류
	int no2;//객체 생성 이후에 사용 가능
	static int getNo2() {//객체 생성 이전에 사용 가능
		return no2;//객체가 없는데? no2존재 여부는 ?
	}	*/
	public static void main(String[] args) {
		
	}
}